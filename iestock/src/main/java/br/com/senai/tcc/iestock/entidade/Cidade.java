package br.com.senai.tcc.iestock.entidade;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cidade {
	
	@Id
	@GeneratedValue(generator = "cidade_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cidade_seq", sequenceName = "cidade_seq", allocationSize = 1, initialValue = 1)
	private Integer nId;
	private String cCodigo;
	private String nomeCidade;
	@Enumerated(EnumType.STRING)
	private EnumEstado enumEstado;
	
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
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	public EnumEstado getEnumEstado() {
		return enumEstado;
	}
	public void setEnumEstado(EnumEstado enumEstado) {
		this.enumEstado = enumEstado;
	}
}
