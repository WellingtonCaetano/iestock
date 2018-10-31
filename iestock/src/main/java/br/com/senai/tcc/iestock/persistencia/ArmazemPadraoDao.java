package br.com.senai.tcc.iestock.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.senai.tcc.iestock.util.IDao;
import br.com.senai.tcc.iestock.entidade.ArmazemPadrao;
import br.com.senai.tcc.iestock.util.IDao.InterfacePersistencia;

public class ArmazemPadraoDao  {

    private static ArmazemPadraoDao instance;
    protected EntityManager entityManager;
    
    
    public static ArmazemPadraoDao getInstance(){
        if (instance == null){
            instance = new ArmazemPadraoDao();
        }
         return instance;
    }
    
    public ArmazemPadraoDao() {
        entityManager = getEntityManager();
    }
    
    public EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("iestockteste");
        if (entityManager == null) {
                 entityManager = factory.createEntityManager();
        }

        return entityManager;
    }
    
    
    public ArmazemPadrao getById(final int id) {
        return entityManager.find(ArmazemPadrao.class, id);
    }
    
    @SuppressWarnings("unchecked")
    public List<ArmazemPadrao> findAll() {
              return entityManager.createQuery("FROM " + ArmazemPadrao.class.getName()).getResultList();
    }
    
    public void persist(ArmazemPadrao armazempadrao) {
        try {
                 entityManager.getTransaction().begin();
                 entityManager.persist(armazempadrao);
                 entityManager.getTransaction().commit();
        } catch (Exception ex) {
                 ex.printStackTrace();
                 entityManager.getTransaction().rollback();
        }
    }
    
    public void merge(ArmazemPadrao armazempadrao) {
        try {
                 entityManager.getTransaction().begin();
                 entityManager.merge(armazempadrao);
                 entityManager.getTransaction().commit();
        } catch (Exception ex) {
                 ex.printStackTrace();
                 entityManager.getTransaction().rollback();
        }
    }
    
    public void remove(ArmazemPadrao armazempadrao) {
        try {
                 entityManager.getTransaction().begin();
                 armazempadrao = entityManager.find(ArmazemPadrao.class, armazempadrao.getnId());
                 entityManager.remove(armazempadrao);
                 entityManager.getTransaction().commit();
        } catch (Exception ex) {
                 ex.printStackTrace();
                 entityManager.getTransaction().rollback();
        }
}
    public void removeById(final int id) {
        try {
        	ArmazemPadrao armazempadrao = getById(id);
                 remove(armazempadrao);
        } catch (Exception ex) {
                 ex.printStackTrace();
        }
}
    
    
	

	
	
	
	
}



