package main.java.br.com.lucca.services;

import main.java.br.com.lucca.domain.Cliente;
import main.java.br.com.lucca.exceptions.DAOException;
import main.java.br.com.lucca.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {
	Cliente buscarPorCPF(Long cpf) throws DAOException;
}
