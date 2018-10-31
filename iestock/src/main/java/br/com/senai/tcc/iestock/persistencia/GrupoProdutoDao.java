package br.com.senai.tcc.iestock.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import br.com.senai.tcc.iestock.util.IDao;
import br.com.senai.tcc.iestock.entidade.ArmazemPadrao;
import br.com.senai.tcc.iestock.entidade.GrupoProduto;
import br.com.senai.tcc.iestock.util.IDao.InterfacePersistencia;

public class GrupoProdutoDao {

	private static GrupoProdutoDao instance;
	protected EntityManager entityManager;
	private static final long serialVersionUID = 1L;

	public GrupoProdutoDao() {
		entityManager = getEntityManager();
	}

	public static GrupoProdutoDao getInstance() {
		if (instance == null) {
			instance = new GrupoProdutoDao();
		}
		return instance;
	}

	public EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("iestockteste");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public GrupoProduto getById(final int id) {
		return entityManager.find(GrupoProduto.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<GrupoProduto> findAll() {
		return entityManager.createQuery("FROM " + GrupoProduto.class.getName()).getResultList();
	}
	//update
	public void merge(GrupoProduto GrupoProduto) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(GrupoProduto);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	// inserir
	public void persist(GrupoProduto GrupoProduto) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(GrupoProduto);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	// remover
	public void remove(GrupoProduto grupoproduto) {
		try {
			entityManager.getTransaction().begin();
			grupoproduto = entityManager.find(GrupoProduto.class, grupoproduto.getnId());
			entityManager.remove(grupoproduto);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) {
		try {
			GrupoProduto grupoproduto = getById(id);
			remove(grupoproduto);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	//listar
	public List<GrupoProduto> Listar() {
		// Query query = entityManager.createQuery("SELECT cdescricao FROM
		// grupoproduto cdescricao");
		// List<GrupoProduto> grupoproduto = query.getResultList();
		// return grupoproduto;
		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(GrupoProduto.class);
		List result = criteria.list();
		return result;
	}
	
	//listar
	public List<GrupoProduto> Listar1(String descricao) {
		 Query query = entityManager.createQuery("select v from GrupoProduto v");
		 query.getResultList ();
		 
		 return query.getResultList ();
	
	}
	
	//altrar
	public void alterar(GrupoProduto grupoproduto) {
		Session session = (Session) entityManager.getDelegate();
		Criteria criteria = session.createCriteria(GrupoProduto.class);
		session.update(grupoproduto);
		
	}
}

