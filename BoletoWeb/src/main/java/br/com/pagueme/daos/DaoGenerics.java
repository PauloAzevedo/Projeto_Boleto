/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.daos;

import br.com.pagueme.conexao.TransactionManager;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class DaoGenerics<T> implements Dao<T> {

    protected Session session = TransactionManager.getCurrentSession();
    protected Class alvo;

    @Override
    public void persistir(T o) {
        session.saveOrUpdate(o);
        session.flush();
    }

    @Override
    public void remover(T o) {
        session.delete(o);
        session.flush();
    }

    @Override
    public T obterPorId(int id) {
        T objeto = null;
        if (id > 0) {
            Query select = session.createQuery("From " + alvo.getSimpleName() + " where id = " + id);
            objeto = (T) select.uniqueResult();
        }
        return objeto;
    }

    @Override
    public List<T> listar(String filtro, String campo) {
        List<T> lista = null;
        if (filtro != null) {
            Query query = session.createQuery("FROM " + alvo.getSimpleName() + " WHERE " + campo + " LIKE '%" + filtro + "%' ORDER BY " + campo);
            lista = query.list();
        }
        return lista;
    }
}
