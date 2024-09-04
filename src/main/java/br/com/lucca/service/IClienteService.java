package br.com.lucca.service;

import java.util.List;

import br.com.lucca.domain.Cliente;
import br.com.lucca.exceptions.DAOException;
import br.com.lucca.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
