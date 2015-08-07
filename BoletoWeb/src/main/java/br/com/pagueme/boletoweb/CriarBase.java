/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.boletoweb;

import br.com.pagueme.beans.TipoUsuario;
import br.com.pagueme.conexao.HibernateConfiguration;
import br.com.pagueme.conexao.TransactionManager;
import br.com.pagueme.daos.DaoTipoUsuario;
import java.io.Serializable;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class CriarBase implements Serializable {
    public static void main(String[] args) {
        HibernateConfiguration.criarSchema();
        TransactionManager.beginTransaction();
        try {
            DaoTipoUsuario tDao = new DaoTipoUsuario();
            TipoUsuario tipo1 = new TipoUsuario("Física");
            TipoUsuario tipo2 = new TipoUsuario("Jurídica");
            tDao.persistir(tipo1);
            tDao.persistir(tipo2);

            TransactionManager.commit();

        } catch (Exception e) {
            TransactionManager.rollback();
            System.out.println(e);
        }
    }
}
