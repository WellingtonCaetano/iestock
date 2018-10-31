package br.com.senai.tcc.iestock.persistencia;

import java.util.List;

import br.com.ambientinformatica.jpa.persistencia.Persistencia;
import br.com.senai.tcc.iestock.entidade.Produto;

public interface ProdutoDao extends Persistencia<Produto>{

		public List<Produto> listarPorCertidao(String query);

		Produto carregarAluno(Produto produto);

		public List<Produto> listarPorNome(String query);
		
		public List<Produto> listarTodos();

		Produto getProduto(Integer idProduto);
	}
