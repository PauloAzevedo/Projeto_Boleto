/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.regranegocio;

import java.io.Serializable;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class Usuario implements Serializable{
    
    private Integer id;
    private String senha;
    private String usuario;
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}
