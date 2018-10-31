package br.com.senai.tcc.iestock.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CabecalhoNotaEntrada {
	
	@Id
	@GeneratedValue(generator = "cabecalhonota_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cabecalhonota_seq", sequenceName = "cabecalhonota_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	private String cNumero;
	private String cSerie;
	@Enumerated(EnumType.STRING)
	private EnumTipoNota enumTipoNota;
	@Temporal(TemporalType.DATE)
	private Date dDtEmissao;
	@OneToOne
	private Fornecedor oFornecedor;
	private String  cLoja;
	@Enumerated(EnumType.STRING)
	private EnumEspecieNF enumEspecieNF;
	private EnumEstado enumUFOrigem;
	public Integer getnId() {
		return nId;
	}
	public void setnId(Integer nId) {
		this.nId = nId;
	}
	public String getcNumero() {
		return cNumero;
	}
	public void setcNumero(String cNumero) {
		this.cNumero = cNumero;
	}
	public String getcSerie() {
		return cSerie;
	}
	public void setcSerie(String cSerie) {
		this.cSerie = cSerie;
	}
	public EnumTipoNota getEnumTipoNota() {
		return enumTipoNota;
	}
	public void setEnumTipoNota(EnumTipoNota enumTipoNota) {
		this.enumTipoNota = enumTipoNota;
	}
	public Date getdDtEmissao() {
		return dDtEmissao;
	}
	public void setdDtEmissao(Date dDtEmissao) {
		this.dDtEmissao = dDtEmissao;
	}
	public Fornecedor getoFornecedor() {
		return oFornecedor;
	}
	public void setoFornecedor(Fornecedor oFornecedor) {
		this.oFornecedor = oFornecedor;
	}
	public String getcLoja() {
		return cLoja;
	}
	public void setcLoja(String cLoja) {
		this.cLoja = cLoja;
	}
	public EnumEspecieNF getEnumEspecieNF() {
		return enumEspecieNF;
	}
	public void setEnumEspecieNF(EnumEspecieNF enumEspecieNF) {
		this.enumEspecieNF = enumEspecieNF;
	}
	public EnumEstado getEnumUFOrigem() {
		return enumUFOrigem;
	}
	public void setEnumUFOrigem(EnumEstado enumUFOrigem) {
		this.enumUFOrigem = enumUFOrigem;
	}

}
