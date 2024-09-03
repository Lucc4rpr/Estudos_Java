package main.java.br.com.lucca.services;

import main.java.br.com.lucca.dao.IProdutoDAO;
import main.java.br.com.lucca.domain.Produto;
import main.java.br.com.lucca.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}
}
