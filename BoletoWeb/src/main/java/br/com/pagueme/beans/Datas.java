/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.beans;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
@Entity
public class Datas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Calendar documento;
    private Calendar processamento;
    private Calendar vencimento;
    //private static final Calendar MINIMUM_DATE;
    //private static final Calendar MAXIMUM_DATE;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDocumento() {
        return documento;
    }

    public void setDocumento(Calendar documento) {
        this.documento = documento;
    }

    public Calendar getProcessamento() {
        return processamento;
    }

    public void setProcessamento(Calendar processamento) {
        this.processamento = processamento;
    }

    public Calendar getVencimento() {
        return vencimento;
    }

    public void setVencimento(Calendar vencimento) {
        this.vencimento = vencimento;
    }

}
