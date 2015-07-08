/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.daos;

import br.com.caelum.stella.boleto.Banco;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class DaoBanco extends DaoGenerics<Banco> {
    public DaoBanco() {
        super.alvo = Banco.class;
    }
}
