/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.daos;

import br.com.pagueme.beans.TipoUsuario;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class DaoTipoUsuario extends DaoGenerics<TipoUsuario> {
    public DaoTipoUsuario() {
        super.alvo = TipoUsuario.class;
    }
}
