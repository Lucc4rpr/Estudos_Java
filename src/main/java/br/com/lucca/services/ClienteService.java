
package main.java.br.com.lucca.services;

import main.java.br.com.lucca.dao.IClienteDAO;
import main.java.br.com.lucca.domain.Cliente;
import main.java.br.com.lucca.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.lucca.services.generic.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}


	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}


}
