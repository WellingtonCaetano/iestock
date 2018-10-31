package br.com.senai.tcc.iestock.util;

import javax.management.Query;
import javax.persistence.EntityManager;

import br.com.senai.tcc.iestock.controle.ArmazemPadraoController;
import br.com.senai.tcc.iestock.entidade.ArmazemPadrao;

public class Teste {
	
	public static void main(String[] args) {
		ArmazemPadrao  arm = new ArmazemPadrao();
		arm.setcDescricao("teste");
		
		ArmazemPadraoController controller = new ArmazemPadraoController();
		
		controller.salvar(arm);
	}
}
