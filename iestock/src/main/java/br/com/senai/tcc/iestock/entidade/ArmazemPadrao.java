package br.com.senai.tcc.iestock.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="armazempadrao")
public class ArmazemPadrao implements Serializable {
	
	@Id
	@GeneratedValue(generator = "armazempadrao_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "armazempadrao_seq", sequenceName = "armazempadrao_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	private String cCodigo;
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
	public String getcDescricao() {
		return cDescricao;
	}
	public void setcDescricao(String cDescricao) {
		this.cDescricao = cDescricao;
	}
	
	
}
