/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.conexao;

import br.com.caelum.stella.boleto.Banco;
import br.com.caelum.stella.boleto.Emissor;
import br.com.caelum.stella.boleto.Sacado;
import br.com.pagueme.beans.Beneficiario;
import br.com.pagueme.beans.Boleto;
import br.com.pagueme.beans.Datas;
import br.com.pagueme.beans.Endereco;
import br.com.pagueme.beans.Pagador;
import br.com.pagueme.beans.Usuario;
import br.com.pagueme.regranegocio.ListaBoletos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class HibernateConfiguration {
    // configuracões somente uma vez 
    // build  valida somente uma vez
    // Session uma sessão para cada transação ou um conjunto de transações

    private static AnnotationConfiguration cfg;
    private static SessionFactory sessionFactory;
    private static String user = "root";
    private static String pass = "aluno";
    private static String base = "boleto";
    private static String host = "192.168.1.251:3306";

    public static Session openConnect() {
        if (cfg == null) {
            cfg = new AnnotationConfiguration();
            cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
            cfg.setProperty("hibernate.connection.username", user);
            cfg.setProperty("hibernate.connection.password", pass);
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://" + host + "/" + base);
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.connection.autocommit", "true");

            cfg.addAnnotatedClass(Endereco.class);
            cfg.addAnnotatedClass(Banco.class);
            cfg.addAnnotatedClass(Beneficiario.class);
            cfg.addAnnotatedClass(Boleto.class);
            cfg.addAnnotatedClass(Datas.class);
            cfg.addAnnotatedClass(Emissor.class);
            cfg.addAnnotatedClass(Pagador.class);
            cfg.addAnnotatedClass(Sacado.class);
            cfg.addAnnotatedClass(Usuario.class);
            cfg.addAnnotatedClass(ListaBoletos.class);


            sessionFactory = cfg.buildSessionFactory();
        }
        return sessionFactory.openSession();
    }

    public static AnnotationConfiguration getCfg() {
        return cfg;
    }

    public static void setCfg(AnnotationConfiguration cfg) {
        HibernateConfiguration.cfg = cfg;
    }

    public static String getBase() {
        return base;
    }

    public static void setBase(String base) {
        HibernateConfiguration.base = base;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        HibernateConfiguration.pass = pass;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        HibernateConfiguration.user = user;
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        HibernateConfiguration.host = host;
    }

    public static void criarSchema() {
        openConnect().close();
        org.hibernate.tool.hbm2ddl.SchemaExport schemaEx = new SchemaExport(cfg);
        schemaEx.create(true, true);
    }

    public static List<Object> runHQLQuery(String hql) {
        Session session = TransactionManager.getCurrentSession();
        return session.createQuery(hql).list();
    }

    public static ArrayList<Class> getEntityClasses() {
        ArrayList<Class> classes = new ArrayList<Class>();
        if (cfg == null) {
            openConnect();
        }
        Iterator i = cfg.getClassMappings();
        while (i.hasNext()) {
            classes.add(((PersistentClass) i.next()).getMappedClass());
        }
        return classes;
    }
}
