package br.com.senai.tcc.iestock.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class GrupoProduto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generator")
	@SequenceGenerator(name="generator", sequenceName="grupoproduto_seq", allocationSize=1)
	private Integer nId;
	private String cCodigo;
	private String cDescricao;
	
	
	//teste
	@Override
	public String toString() {
		return "GrupoProduto [nId=" + nId + ", cCodigo=" + cCodigo + ", cDescricao=" + cDescricao + "]";
	}
	
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
}
