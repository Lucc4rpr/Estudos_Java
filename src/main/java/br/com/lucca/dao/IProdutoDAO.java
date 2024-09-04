package br.com.lucca.dao;

import java.util.List;

import br.com.lucca.dao.generic.IGenericDAO;
import br.com.lucca.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
