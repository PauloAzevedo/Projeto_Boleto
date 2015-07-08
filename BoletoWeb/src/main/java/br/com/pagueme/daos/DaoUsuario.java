/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.daos;

import br.com.pagueme.regranegocio.Usuario;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class DaoUsuario extends DaoGenerics<Usuario> {
    public DaoUsuario() {
        super.alvo = Usuario.class;
    }
}
