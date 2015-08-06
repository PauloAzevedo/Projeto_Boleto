/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.daos;

import br.com.pagueme.beans.Pagador;



/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class DaoPagador extends DaoGenerics<Pagador> {
    public DaoPagador() {
        super.alvo = Pagador.class;
    }
}
