/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.daos;

import br.com.caelum.stella.boleto.Sacado;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class DaoSacado extends DaoGenerics<Sacado> {
    public DaoSacado() {
        super.alvo = Sacado.class;
    }
}