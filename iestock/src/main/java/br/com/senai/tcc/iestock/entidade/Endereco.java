package br.com.senai.tcc.iestock.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(generator = "endereco_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "endereco_seq", sequenceName = "endereco_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	private String cCodigo;
	private String cBairro;
	private int nCep;
	private String cRuaAvenida;
	private String cComplemento;
	private String cQuadra;
	private String cLote;
	private int nNumero;
	@OneToOne
	private Cidade oCidade;
	
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
	public String getcBairro() {
		return cBairro;
	}
	public void setcBairro(String cBairro) {
		this.cBairro = cBairro;
	}
	public int getnCep() {
		return nCep;
	}
	public void setnCep(int nCep) {
		this.nCep = nCep;
	}
	public String getcRuaAvenida() {
		return cRuaAvenida;
	}
	public void setcRuaAvenida(String cRuaAvenida) {
		this.cRuaAvenida = cRuaAvenida;
	}
	public String getcComplemento() {
		return cComplemento;
	}
	public void setcComplemento(String cComplemento) {
		this.cComplemento = cComplemento;
	}
	public String getcQuadra() {
		return cQuadra;
	}
	public void setcQuadra(String cQuadra) {
		this.cQuadra = cQuadra;
	}
	public String getcLote() {
		return cLote;
	}
	public void setcLote(String cLote) {
		this.cLote = cLote;
	}
	public int getnNumero() {
		return nNumero;
	}
	public void setnNumero(int nNumero) {
		this.nNumero = nNumero;
	}
	public Cidade getoCidade() {
		return oCidade;
	}
	public void setoCidade(Cidade oCidade) {
		this.oCidade = oCidade;
	}
}
