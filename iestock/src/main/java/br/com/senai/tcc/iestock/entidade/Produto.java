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
public class Produto {
	
	@Id
	@GeneratedValue(generator = "produto_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "produto_seq", sequenceName = "produto_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	private String cCodigo;
	private String cDescricao;
	@Enumerated(EnumType.STRING)
	private EnumTipoProduto enumTipoProduto;
	@OneToOne
	private UnidadeMedida oUnidadeMedida;
	@OneToOne
	private ArmazemPadrao oArmazemPadrao;
	@OneToOne
	private GrupoProduto oGrupoProduto;
	private float nPrecoVenda;
	private float nUltmoPreco;
	@Temporal(TemporalType.DATE)
	private Date dDtUltimaCompra;
	private String cCodigoBarras;
	private String cRfid;
	private float nPontoDePedido;
	private int nQtdEmbalagem;
	private float nEstoqueDeSeguraca;
	private String cFoto;
	@Enumerated(EnumType.STRING)
	private EnumStatus enumStatusProduto;
	
	public Integer getnId() {
		return nId;
	}
	public void setnId(Integer nId) {
		this.nId = nId;
	}
	public String getcCodigo() {
		return cCodigo;
	}
	public void setcCodigo(String cCodigo) {
		this.cCodigo = cCodigo;
	}
	public String getcDescricao() {
		return cDescricao;
	}
	public void setcDescricao(String cDescricao) {
		this.cDescricao = cDescricao;
	}
	public EnumTipoProduto getEnumTipoProduto() {
		return enumTipoProduto;
	}
	public void setEnumTipoProduto(EnumTipoProduto enumTipoProduto) {
		this.enumTipoProduto = enumTipoProduto;
	}
	public UnidadeMedida getoUnidadeMedida() {
		return oUnidadeMedida;
	}
	public void setoUnidadeMedida(UnidadeMedida oUnidadeMedida) {
		this.oUnidadeMedida = oUnidadeMedida;
	}
	public ArmazemPadrao getoArmazemPadrao() {
		return oArmazemPadrao;
	}
	public void setoArmazemPadrao(ArmazemPadrao oArmazemPadrao) {
		this.oArmazemPadrao = oArmazemPadrao;
	}
	public GrupoProduto getoGrupoProduto() {
		return oGrupoProduto;
	}
	public void setoGrupoProduto(GrupoProduto oGrupoProduto) {
		this.oGrupoProduto = oGrupoProduto;
	}
	public float getnPrecoVenda() {
		return nPrecoVenda;
	}
	public void setnPrecoVenda(float nPrecoVenda) {
		this.nPrecoVenda = nPrecoVenda;
	}
	public float getnUltmoPreco() {
		return nUltmoPreco;
	}
	public void setnUltmoPreco(float nUltmoPreco) {
		this.nUltmoPreco = nUltmoPreco;
	}
	public Date getdDtUltimaCompra() {
		return dDtUltimaCompra;
	}
	public void setdDtUltimaCompra(Date dDtUltimaCompra) {
		this.dDtUltimaCompra = dDtUltimaCompra;
	}
	public String getcCodigoBarras() {
		return cCodigoBarras;
	}
	public void setcCodigoBarras(String cCodigoBarras) {
		this.cCodigoBarras = cCodigoBarras;
	}
	public String getcRfid() {
		return cRfid;
	}
	public void setcRfid(String cRfid) {
		this.cRfid = cRfid;
	}
	public float getnPontoDePedido() {
		return nPontoDePedido;
	}
	public void setnPontoDePedido(float nPontoDePedido) {
		this.nPontoDePedido = nPontoDePedido;
	}
	public int getnQtdEmbalagem() {
		return nQtdEmbalagem;
	}
	public void setnQtdEmbalagem(int nQtdEmbalagem) {
		this.nQtdEmbalagem = nQtdEmbalagem;
	}
	public float getnEstoqueDeSeguraca() {
		return nEstoqueDeSeguraca;
	}
	public void setnEstoqueDeSeguraca(float nEstoqueDeSeguraca) {
		this.nEstoqueDeSeguraca = nEstoqueDeSeguraca;
	}
	public String getcFoto() {
		return cFoto;
	}
	public void setcFoto(String cFoto) {
		this.cFoto = cFoto;
	}
	public EnumStatus getEnumStatusProduto() {
		return enumStatusProduto;
	}
	public void setEnumStatusProduto(EnumStatus enumStatusProduto) {
		this.enumStatusProduto = enumStatusProduto;
	}	
}
