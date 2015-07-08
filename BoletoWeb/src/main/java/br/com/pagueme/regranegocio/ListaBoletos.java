/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.regranegocio;

import br.com.caelum.stella.boleto.Boleto;
import java.util.List;



/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class ListaBoletos {
    private Integer idLista;
    private List<Boleto> boletos;
    private Usuario usuario;

    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
