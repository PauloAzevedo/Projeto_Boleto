/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.boletoweb;

import br.com.pagueme.conexao.HibernateConfiguration;
import java.io.Serializable;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class CriarBase implements Serializable {
    public static void main(String[] args) {
        HibernateConfiguration.criarSchema();
    }
}
