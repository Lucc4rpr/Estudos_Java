package com.lucca.testes;


import com.lucca.testes.dao.ClienteDao;
import com.lucca.testes.dao.ClienteDaoMock;
import com.lucca.testes.dao.IClienteDao;
import com.lucca.testes.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void AtualizarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
}