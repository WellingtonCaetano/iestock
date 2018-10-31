package br.com.senai.tcc.iestock.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.web.bind.EscapedErrors;

import br.com.senai.tcc.iestock.controle.ArmazemPadraoController;
import br.com.senai.tcc.iestock.entidade.ArmazemPadrao;
import br.com.senai.tcc.iestock.entidade.Cidade;
import br.com.senai.tcc.iestock.entidade.EnumEstado;
import br.com.senai.tcc.iestock.entidade.GrupoProduto;
import br.com.senai.tcc.iestock.persistencia.GrupoProdutoDao;

public class Man {	
	public static void main(String[] args) throws Exception {
		
		GrupoProduto arm = new GrupoProduto();
		List<GrupoProduto> lista = new ArrayList<GrupoProduto>();		
		
		arm.setnId(1);
		arm.setcCodigo("987");		
		arm.setcDescricao("update");
		GrupoProdutoDao dao = new GrupoProdutoDao();
		dao.getInstance();
		
		
		
		//update 
		//dao.merge(arm);
		
		 //insert
		// dao.persist(arm);
		 
		//delete
		//dao.remove(arm);
			//lista
		// lista = dao.Listar();
		// for (int i = 0; i < lista.size(); i++) {
		//	 System.out.println(lista.get(i).toString());  
		// }
		 
		 lista = dao.Listar1("update");
		for (int i = 0; i < lista.size(); i++) {
			 System.out.println(lista.get(i).toString());  
		}
		 
	}
}