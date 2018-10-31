package br.com.senai.tcc.iestock.entidade;

import br.com.senai.tcc.iestock.util.IEnum;

public enum EnumTipoPessoa implements IEnum {
	
	F("Fisica"),
	J("Juridica");
	
	private String descricao;
	
	private EnumTipoPessoa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}
	
	
}


