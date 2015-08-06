/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.beans;

import br.com.caelum.stella.boleto.Banco;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
@Entity
public class Boleto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    protected BigDecimal valorBoleto;
    protected BigDecimal quantidadeMoeda;
    protected BigDecimal valorMoeda;
    protected BigDecimal valorDescontos;
    protected BigDecimal valorDeducoes;
    protected BigDecimal valorMulta;
    protected BigDecimal valorAcrescimos;
    protected String especieMoeda;
    protected int codigoEspecieMoeda;
    protected String especieDocumento;
    protected String numeroDocumento;
    protected boolean aceite;
    protected Banco banco;
    @OneToOne
    protected Datas datas;
    @OneToOne
    protected Pagador pagador;
    @OneToOne
    protected Beneficiario beneficiario;
    protected String instrucoes;
    protected String descricoes;
    protected String locaisDePagamento;

    public BigDecimal getValorBoleto() {
        return valorBoleto;
    }

    public void setValorBoleto(BigDecimal valorBoleto) {
        this.valorBoleto = valorBoleto;
    }

    public BigDecimal getQuantidadeMoeda() {
        return quantidadeMoeda;
    }

    public void setQuantidadeMoeda(BigDecimal quantidadeMoeda) {
        this.quantidadeMoeda = quantidadeMoeda;
    }

    public BigDecimal getValorMoeda() {
        return valorMoeda;
    }

    public void setValorMoeda(BigDecimal valorMoeda) {
        this.valorMoeda = valorMoeda;
    }

    public BigDecimal getValorDescontos() {
        return valorDescontos;
    }

    public void setValorDescontos(BigDecimal valorDescontos) {
        this.valorDescontos = valorDescontos;
    }

    public BigDecimal getValorDeducoes() {
        return valorDeducoes;
    }

    public void setValorDeducoes(BigDecimal valorDeducoes) {
        this.valorDeducoes = valorDeducoes;
    }

    public BigDecimal getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(BigDecimal valorMulta) {
        this.valorMulta = valorMulta;
    }

    public BigDecimal getValorAcrescimos() {
        return valorAcrescimos;
    }

    public void setValorAcrescimos(BigDecimal valorAcrescimos) {
        this.valorAcrescimos = valorAcrescimos;
    }

    public String getEspecieMoeda() {
        return especieMoeda;
    }

    public void setEspecieMoeda(String especieMoeda) {
        this.especieMoeda = especieMoeda;
    }

    public int getCodigoEspecieMoeda() {
        return codigoEspecieMoeda;
    }

    public void setCodigoEspecieMoeda(int codigoEspecieMoeda) {
        this.codigoEspecieMoeda = codigoEspecieMoeda;
    }

    public String getEspecieDocumento() {
        return especieDocumento;
    }

    public void setEspecieDocumento(String especieDocumento) {
        this.especieDocumento = especieDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public boolean isAceite() {
        return aceite;
    }

    public void setAceite(boolean aceite) {
        this.aceite = aceite;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Datas getDatas() {
        return datas;
    }

    public void setDatas(Datas datas) {
        this.datas = datas;
    }

    public Pagador getPagador() {
        return pagador;
    }

    public void setPagador(Pagador pagador) {
        this.pagador = pagador;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public String getDescricoes() {
        return descricoes;
    }

    public void setDescricoes(String descricoes) {
        this.descricoes = descricoes;
    }

    public String getLocaisDePagamento() {
        return locaisDePagamento;
    }

    public void setLocaisDePagamento(String locaisDePagamento) {
        this.locaisDePagamento = locaisDePagamento;
    }

    
    
    
}
