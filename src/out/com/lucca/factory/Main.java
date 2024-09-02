package out.com.lucca.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nome e sexo (ex: Maria,F) ou 'sair' para terminar:");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] dados = entrada.split(",");
            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim().toUpperCase();
                pessoas.add(new Pessoa(nome, sexo));
            } else {
                System.out.println("Entrada inválida.");
            }
        }

        Map<String, List<Pessoa>> pessoasPorSexo = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getSexo));

        pessoasPorSexo.forEach((sexo, listaPessoas) -> {
            System.out.println("Sexo: " + sexo);
            listaPessoas.forEach(System.out::println);
        });

        // Filtra e exibe apenas as mulheres usando expressoes lambda
        System.out.println("\nLista de Mulheres:");
        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        mulheres.forEach(System.out::println);
    }
}
