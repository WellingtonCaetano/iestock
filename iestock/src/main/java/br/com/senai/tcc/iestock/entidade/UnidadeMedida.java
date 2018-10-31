package br.com.senai.tcc.iestock.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class UnidadeMedida {
	
	@Id
	@GeneratedValue(generator = "unidademedida_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "unidademedida_seq", sequenceName = "unidademedida_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	private String cCodigo;
	private String cDescricao;
	private String cSigla;
	
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
	public String getcSigla() {
		return cSigla;
	}
	public void setcSigla(String cSigla) {
		this.cSigla = cSigla;
	}
		
}
