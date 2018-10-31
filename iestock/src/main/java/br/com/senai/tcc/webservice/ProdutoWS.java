package br.com.senai.tcc.webservice;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;


import br.com.senai.tcc.iestock.entidade.Produto;
import br.com.senai.tcc.iestock.persistencia.ProdutoDao;

@Path("/json/produto")
public class ProdutoWS {

	@PostConstruct
	public void init() {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}

	@Autowired
	public ProdutoDao produtoDao;

	@GET
	@Path("/{idProduto}")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto getAlunoJSON(@PathParam("idProduto") Integer idProduto) {
		return produtoDao.getProduto(idProduto);

	}

	@GET
	@Path("/alunos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> getProdutoJSON() {

		return produtoDao.listarTodos();
	}

}
