package main.java.br.com.lucca.dao;

import main.java.br.com.lucca.dao.generic.IGenericDAO;
import main.java.br.com.lucca.domain.Venda;
import main.java.br.com.lucca.exceptions.DAOException;
import main.java.br.com.lucca.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
