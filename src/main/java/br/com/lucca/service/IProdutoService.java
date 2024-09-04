package br.com.lucca.service;

import java.util.List;

import br.com.lucca.domain.Produto;
import br.com.lucca.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
