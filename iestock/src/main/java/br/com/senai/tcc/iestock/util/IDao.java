package br.com.senai.tcc.iestock.util;

import java.util.List;

public interface IDao {
	
	public interface InterfacePersistencia<T> {

		public  void  salvar(T obj) ;

		public void atualizar(T obj);

		public void remove(long id) ;

		public List<T> list(T obj) ;

	}
	
}
