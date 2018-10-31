package br.com.senai.tcc.iestock.entidade;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

public class SaldoEstoque {
	
	@Id
	@GeneratedValue(generator = "saldoestoque_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "saldoestoque_seq", sequenceName = "saldoestoque_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	@OneToOne
	private Produto oCodProduto;
	@OneToOne
	private ArmazemPadrao oCodArmazem;
	private float nQtdEstoque;
	private float nQtdEmenhada;
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
	public ArmazemPadrao getoCodArmazem() {
		return oCodArmazem;
	}
	public void setoCodArmazem(ArmazemPadrao oCodArmazem) {
		this.oCodArmazem = oCodArmazem;
	}
	public float getnQtdEstoque() {
		return nQtdEstoque;
	}
	public void setnQtdEstoque(float nQtdEstoque) {
		this.nQtdEstoque = nQtdEstoque;
	}
	public float getnQtdEmenhada() {
		return nQtdEmenhada;
	}
	public void setnQtdEmenhada(float nQtdEmenhada) {
		this.nQtdEmenhada = nQtdEmenhada;
	}

	
}
