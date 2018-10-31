package br.com.senai.tcc.iestock.controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.senai.tcc.iestock.entidade.ArmazemPadrao;
import br.com.senai.tcc.iestock.util.JPAUtil;

public class ArmazemPadraoController {
	
	EntityManager em;
	
	
	public ArmazemPadraoController() {
		super();		
		em = JPAUtil.getEntityManager();
	}
	
	public void salvar(ArmazemPadrao armazempadrao){
		em.getTransaction().begin();
		em.persist(armazempadrao);
		em.getTransaction().commit();
		em.close();			
	}

}
