/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.daos;

import br.com.pagueme.regranegocio.ListaBoletos;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class DaoListaBoletos extends DaoGenerics<ListaBoletos> {
    public DaoListaBoletos() {
        super.alvo = ListaBoletos.class;
    }
}
