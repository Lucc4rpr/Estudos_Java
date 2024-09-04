package br.com.lucca.dao;

import java.util.List;

import br.com.lucca.dao.generic.IGenericDAO;
import br.com.lucca.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
