package br.com.senai.tcc.iestock.entidade;

import java.util.Date;

import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class PedidoVenda {
	
	private Integer nNumero;
	@OneToOne
	private Cliente oCliente;
	private Cliente oLoja;
	@OneToOne
	private CondicaoPgmto oCondicaoPgmto;
	@Temporal(TemporalType.DATE)
	private Date dDtEmissao;
	@Temporal(TemporalType.DATE)
	private Date dDtEntrega;
	private boolean lStatusFaturamento;
	
	public Integer getnNumero() {
		return nNumero;
	}
	public void setnNumero(Integer nNumero) {
		this.nNumero = nNumero;
	}
	public Cliente getoCliente() {
		return oCliente;
	}
	public void setoCliente(Cliente oCliente) {
		this.oCliente = oCliente;
	}
	public Cliente getoLoja() {
		return oLoja;
	}
	public void setoLoja(Cliente oLoja) {
		this.oLoja = oLoja;
	}
	public CondicaoPgmto getoCondicaoPgmto() {
		return oCondicaoPgmto;
	}
	public void setoCondicaoPgmto(CondicaoPgmto oCondicaoPgmto) {
		this.oCondicaoPgmto = oCondicaoPgmto;
	}
	public Date getdDtEmissao() {
		return dDtEmissao;
	}
	public void setdDtEmissao(Date dDtEmissao) {
		this.dDtEmissao = dDtEmissao;
	}
	public Date getdDtEntrega() {
		return dDtEntrega;
	}
	public void setdDtEntrega(Date dDtEntrega) {
		this.dDtEntrega = dDtEntrega;
	}
	public boolean islStatusFaturamento() {
		return lStatusFaturamento;
	}
	public void setlStatusFaturamento(boolean lStatusFaturamento) {
		this.lStatusFaturamento = lStatusFaturamento;
	}
}
