package main.java.br.com.lucca.domain;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import main.java.anotacao.ColunaTabela;
import main.java.anotacao.Tabela;
import main.java.anotacao.TipoChave;
import main.java.br.com.lucca.dao.Persistente;

@Setter
@Getter
@Tabela("TB_PRODUTO")
public class Produto implements Persistente {
	@ColunaTabela(dbName = "id", setJavaName = "setId")
	private Long id;

	@TipoChave("getCodigo")
	@ColunaTabela(dbName = "codigo", setJavaName = "setCodigo")
	private String codigo;
	
	@ColunaTabela(dbName = "nome", setJavaName = "setNome")
	private String nome;
	
	@ColunaTabela(dbName = "descricao", setJavaName = "setDescricao")
	private String descricao;
	
	@ColunaTabela(dbName = "valor", setJavaName = "setValor")
	private BigDecimal valor;

	@ColunaTabela(dbName = "categoria", setJavaName = "setCategoria")
	private String categoria;

}
