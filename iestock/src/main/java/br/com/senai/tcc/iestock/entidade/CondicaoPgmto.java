package br.com.senai.tcc.iestock.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class CondicaoPgmto {

	@Id
	@GeneratedValue(generator = "condicaopgmto", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "condicaopgmto", sequenceName = "condicaopgmto", allocationSize = 1, initialValue = 1)
	private Integer nId;
	private String cCodigo;
	private String cCondicao;
	private String cDescricao;
	
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
	public String getcCondicao() {
		return cCondicao;
	}
	public void setcCondicao(String cCondicao) {
		this.cCondicao = cCondicao;
	}
	public String getcDescricao() {
		return cDescricao;
	}
	public void setcDescricao(String cDescricao) {
		this.cDescricao = cDescricao;
	}		
}
