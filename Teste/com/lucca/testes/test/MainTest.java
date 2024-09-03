package com.lucca.testes.test;

import com.lucca.testes.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    @Test
    public void testApenasMulheres() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "F"));
        pessoas.add(new Pessoa("João", "M"));
        pessoas.add(new Pessoa("Ana", "F"));
        pessoas.add(new Pessoa("Pedro", "M"));
        pessoas.add(new Pessoa("Lucia", "F"));

        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        Assert.assertTrue(mulheres.stream().allMatch(pessoa -> pessoa.getSexo().equalsIgnoreCase("F")));
    }
}
