/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.regranegocio;

import br.com.caelum.stella.boleto.Endereco;
import java.io.Serializable;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class Usuario implements Serializable {
    
    private Integer id;
    private String senha;
    private String usuario;
    private String nomeCompleto;
    private String cnpjCPF;
    private Endereco endereco;
    
    
    
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

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCnpjCPF() {
        return cnpjCPF;
    }

    public void setCnpjCPF(String cnpjCPF) {
        this.cnpjCPF = cnpjCPF;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    
}
