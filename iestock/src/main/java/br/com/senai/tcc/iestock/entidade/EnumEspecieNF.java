package br.com.senai.tcc.iestock.entidade;

import br.com.senai.tcc.iestock.util.IEnum;

public enum EnumEspecieNF implements IEnum {
	
	CF("CUPOM FISCAL"),
	CTE("CONHECIMENTO DE TRANSPORTE ELETRONICO"),
	NF("NOTA FISCAL"),	
	NFS("NOTA FISCAL DE SERVICO"),
	RPS("RECIBO PROVISORIO DE SERVICOS"),
	SPED("NOTA FISCAL ELETRONICA - SEFAZ"),
	NFE("NOTA FISCAL DE ENTRADA");
		
	private String descricao;
	
	private EnumEspecieNF(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}	

}
