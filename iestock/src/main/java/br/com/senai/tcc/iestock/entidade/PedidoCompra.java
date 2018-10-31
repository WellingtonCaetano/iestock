package br.com.senai.tcc.iestock.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class PedidoCompra {
	
	@Id
	@GeneratedValue(generator = "pedidocompra_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "pedidocompra_seq", sequenceName = "pedidocompra_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	private String cNumero;
	private Date dDtEmissao;
	@OneToOne
	private Fornecedor oFornecedor;
	private String cLoja;
	@OneToOne
	private CondicaoPgmto oCondicaoPgmto;
	private int nItem;
	@OneToOne
	private Produto oProduto;
	private String cDescProduto;
	private String cUnidadeMedida;
	private float nQuantidade;
	private float nValorUn;
	private float nValorTotal;
	private Date dDtEntrega;
	private int nArmazem;
	private float nQtdJaEntregue;
	private boolean lStatusPedido;
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
	public CondicaoPgmto getoCondicaoPgmto() {
		return oCondicaoPgmto;
	}
	public void setoCondicaoPgmto(CondicaoPgmto oCondicaoPgmto) {
		this.oCondicaoPgmto = oCondicaoPgmto;
	}
	public int getnItem() {
		return nItem;
	}
	public void setnItem(int nItem) {
		this.nItem = nItem;
	}
	public Produto getoProduto() {
		return oProduto;
	}
	public void setoProduto(Produto oProduto) {
		this.oProduto = oProduto;
	}
	public String getcDescProduto() {
		return cDescProduto;
	}
	public void setcDescProduto(String cDescProduto) {
		this.cDescProduto = cDescProduto;
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
	public Date getdDtEntrega() {
		return dDtEntrega;
	}
	public void setdDtEntrega(Date dDtEntrega) {
		this.dDtEntrega = dDtEntrega;
	}
	public int getnArmazem() {
		return nArmazem;
	}
	public void setnArmazem(int nArmazem) {
		this.nArmazem = nArmazem;
	}
	public float getnQtdJaEntregue() {
		return nQtdJaEntregue;
	}
	public void setnQtdJaEntregue(float nQtdJaEntregue) {
		this.nQtdJaEntregue = nQtdJaEntregue;
	}
	public boolean islStatusPedido() {
		return lStatusPedido;
	}
	public void setlStatusPedido(boolean lStatusPedido) {
		this.lStatusPedido = lStatusPedido;
	}

}
