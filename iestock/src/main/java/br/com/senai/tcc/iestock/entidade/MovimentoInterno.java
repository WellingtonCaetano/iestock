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
public class MovimentoInterno {
	
	@Id
	@GeneratedValue(generator = "movimentointerno_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "movimentointerno_seq", sequenceName = "movimentointerno_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	@OneToOne
	private Produto oCodProduto;
	private String cUnidadeMedida;
	private float nQuantidade;
	@Temporal(TemporalType.DATE)	
	private Date dDtEmissao;
	@Enumerated(EnumType.STRING)
	private EnumTipoProduto enumTipoProduto;
	private String docOrigem;
	public Integer getnId() {
		return nId;
	}
	public void setnId(Integer nId) {
		this.nId = nId;
	}
	public Produto getoCodProduto() {
		return oCodProduto;
	}
	public void setoCodProduto(Produto oCodProduto) {
		this.oCodProduto = oCodProduto;
	}
	public String getcUnidadeMedida() {
		return cUnidadeMedida;
	}
	public void setcUnidadeMedida(String cUnidadeMedida) {
		this.cUnidadeMedida = cUnidadeMedida;
	}
	public float getnQuantidade() {
		return nQuantidade;
	}
	public void setnQuantidade(float nQuantidade) {
		this.nQuantidade = nQuantidade;
	}
	public Date getdDtEmissao() {
		return dDtEmissao;
	}
	public void setdDtEmissao(Date dDtEmissao) {
		this.dDtEmissao = dDtEmissao;
	}
	public EnumTipoProduto getEnumTipoProduto() {
		return enumTipoProduto;
	}
	public void setEnumTipoProduto(EnumTipoProduto enumTipoProduto) {
		this.enumTipoProduto = enumTipoProduto;
	}
	public String getDocOrigem() {
		return docOrigem;
	}
	public void setDocOrigem(String docOrigem) {
		this.docOrigem = docOrigem;
	}
	
	
	}
