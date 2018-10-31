package br.com.senai.tcc.iestock.entidade;

import br.com.senai.tcc.iestock.util.IEnum;

public enum EnumTipoNota implements IEnum{
	
	N("Normal"),
	D("Devolucao"),
	B("Beneficiamento"),
	C("Complemento");
	
	
	private String descricao;
	
	private EnumTipoNota(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}	
}
