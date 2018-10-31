package br.com.senai.tcc.iestock.entidade;

import br.com.senai.tcc.iestock.util.IEnum;

public enum EnumStatus implements IEnum {
	
	ATIVO("Ativo"),
	BLOQUEADO("Bloqueado");
	
	
	private String descricao;
	
	private EnumStatus(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

}
