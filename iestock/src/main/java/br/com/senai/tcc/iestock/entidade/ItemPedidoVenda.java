package br.com.senai.tcc.iestock.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ItemPedidoVenda {
	
	@Id
	@GeneratedValue(generator = "itempedidovenda_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "itempedidovenda_seq", sequenceName = "itempedidovenda_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	private String nItem;
	@OneToOne
	private Produto oProduto;
	private String cDescricao;
	private String cArmazem;
	private String cUnidadeMedida;
	private float nQuantidade;
	private float nValorUn;
	private float nValorTotal;
	
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
	public Produto getoProduto() {
		return oProduto;
	}
	public void setoProduto(Produto oProduto) {
		this.oProduto = oProduto;
	}
	public String getcDescricao() {
		return cDescricao;
	}
	public void setcDescricao(String cDescricao) {
		this.cDescricao = cDescricao;
	}
	public String getcArmazem() {
		return cArmazem;
	}
	public void setcArmazem(String cArmazem) {
		this.cArmazem = cArmazem;
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

}
