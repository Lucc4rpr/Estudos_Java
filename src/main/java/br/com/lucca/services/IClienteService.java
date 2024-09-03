
package main.java.br.com.lucca.services;

import main.java.br.com.lucca.domain.Cliente;
import main.java.br.com.lucca.exceptions.TipoChaveNaoEncontradaException;


public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
