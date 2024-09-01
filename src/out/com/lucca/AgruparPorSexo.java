package out.com.lucca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AgruparPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> pessoasPorSexo = new HashMap<>();
        pessoasPorSexo.put("Masculino", new ArrayList<>());
        pessoasPorSexo.put("Feminino", new ArrayList<>());

        while (true) {
            System.out.println("Digite o nome e sexo da pessoa (no formato Nome-Sexo) ou 'sair' para encerrar:");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] dados = entrada.split("-");
            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim();

                if (sexo.equalsIgnoreCase("Masculino")) {
                    pessoasPorSexo.get("Masculino").add(nome);
                } else if (sexo.equalsIgnoreCase("Feminino")) {
                    pessoasPorSexo.get("Feminino").add(nome);
                } else {
                    System.out.println("Sexo inválido. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Use o formato Nome-Sexo.");
            }
        }

        System.out.println("Pessoas agrupadas por sexo:");

        for (Map.Entry<String, List<String>> entry : pessoasPorSexo.entrySet()) {
            String sexo = entry.getKey();
            List<String> pessoas = entry.getValue();

            System.out.println(sexo + ":");
            for (String pessoa : pessoas) {
                System.out.println(" - " + pessoa);
            }
        }

        scanner.close();
    }
}
