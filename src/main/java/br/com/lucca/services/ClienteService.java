package main.java.br.com.lucca.services;

import main.java.br.com.lucca.dao.IClienteDAO;
import main.java.br.com.lucca.domain.Cliente;
import main.java.br.com.lucca.exceptions.DAOException;
import main.java.br.com.lucca.exceptions.MaisDeUmRegistroException;
import main.java.br.com.lucca.exceptions.TableException;
import main.java.br.com.lucca.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}
	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
