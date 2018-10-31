package br.com.senai.tcc.iestock.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ItemNotaEntrada {
	
	@Id
	@GeneratedValue(generator = "grupoproduto_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "grupoproduto_seq", sequenceName = "grupoproduto_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;	
	private String nItem;
	@OneToOne
	private Produto oCodProduto;
	private String coDescProduto;
	private String cUnidadeMedida;
	private String cArmazem;
	private float nQuantidade;
	private float nValorUn;
	private float nValorTotal;
	@OneToOne
	private PedidoCompra oPedidoCompra;
	private  int cItemPedidoCompra;
	@OneToOne
	private Fornecedor oFornecedor;
	private String  cLoja;
	@OneToOne
	private CabecalhoNotaEntrada oNumeroDoc;
	private String cSerie;
	private String cTipo;
	@Temporal(TemporalType.DATE)
	private Date dDtEmissao;
	public Integer getnId() {
		return nId;
	}
	public void setnId(Integer nId) {
		this.nId = nId;
	}
	public String getnItem() {
		return nItem;
	}
	public void setnItem(String nItem) {
		this.nItem = nItem;
	}
	public Produto getoCodProduto() {
		return oCodProduto;
	}
	public void setoCodProduto(Produto oCodProduto) {
		this.oCodProduto = oCodProduto;
	}
	public String getCoDescProduto() {
		return coDescProduto;
	}
	public void setCoDescProduto(String coDescProduto) {
		this.coDescProduto = coDescProduto;
	}
	public String getcUnidadeMedida() {
		return cUnidadeMedida;
	}
	public void setcUnidadeMedida(String cUnidadeMedida) {
		this.cUnidadeMedida = cUnidadeMedida;
	}
	public String getcArmazem() {
		return cArmazem;
	}
	public void setcArmazem(String cArmazem) {
		this.cArmazem = cArmazem;
	}
	public float getnQuantidade() {
		return nQuantidade;
	}
	public void setnQuantidade(float nQuantidade) {
		this.nQuantidade = nQuantidade;
	}
	public float getnValorUn() {
		return nValorUn;
	}
	public void setnValorUn(float nValorUn) {
		this.nValorUn = nValorUn;
	}
	public float getnValorTotal() {
		return nValorTotal;
	}
	public void setnValorTotal(float nValorTotal) {
		this.nValorTotal = nValorTotal;
	}
	public PedidoCompra getoPedidoCompra() {
		return oPedidoCompra;
	}
	public void setoPedidoCompra(PedidoCompra oPedidoCompra) {
		this.oPedidoCompra = oPedidoCompra;
	}
	public int getcItemPedidoCompra() {
		return cItemPedidoCompra;
	}
	public void setcItemPedidoCompra(int cItemPedidoCompra) {
		this.cItemPedidoCompra = cItemPedidoCompra;
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
	public CabecalhoNotaEntrada getoNumeroDoc() {
		return oNumeroDoc;
	}
	public void setoNumeroDoc(CabecalhoNotaEntrada oNumeroDoc) {
		this.oNumeroDoc = oNumeroDoc;
	}
	public String getcSerie() {
		return cSerie;
	}
	public void setcSerie(String cSerie) {
		this.cSerie = cSerie;
	}
	public String getcTipo() {
		return cTipo;
	}
	public void setcTipo(String cTipo) {
		this.cTipo = cTipo;
	}
	public Date getdDtEmissao() {
		return dDtEmissao;
	}
	public void setdDtEmissao(Date dDtEmissao) {
		this.dDtEmissao = dDtEmissao;
	}
	
	
}
