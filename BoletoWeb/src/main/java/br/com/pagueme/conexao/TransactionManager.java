/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.conexao;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class TransactionManager {
    static Session session = null;
    static Transaction transaction = null;

    public static void beginTransaction() {
        if (transaction != null) {
            //throw new RuntimeException("Já existe uma transação iniciada.");
            getCurrentSession();
        } else {
            session = HibernateConfiguration.openConnect();
            transaction = session.beginTransaction();
        }
    }

    public static void commit() {
        if (transaction == null) {
            //throw new RuntimeException("Erro tentando executar commit() sem antes ter executado beginTrans()..");
            beginTransaction();
            transaction.commit();
        } else {
            transaction.commit();
            closeCurrentSession();
        }

    }

    public static void rollback() {
        if (transaction == null) {
            throw new RuntimeException("Erro tentando executar rollback() sem antes ter executado beginTrans()..");
        }
        transaction.rollback();
        closeCurrentSession();
    }

    public static Session getCurrentSession() {
        /*Automatizando a criação da transação.*/
        if (session == null) {
            Session session2 = HibernateConfiguration.openConnect();
            // System.out.println("========================="+session2.getFlushMode());
            session2.setFlushMode(FlushMode.ALWAYS);
            return session2;
        }
        return session;
    }

    public static void closeCurrentSession() {
        session.flush();
        session.close();
        transaction = null;
        session = null;
    }
}
