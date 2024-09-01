package out.com.lucca;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OrdenarNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula:");
        String entrada = scanner.nextLine();

        List<String> nomes = Arrays.asList(entrada.split("\\s*,\\s*"));

        Collections.sort(nomes, Comparator.comparing(String::toLowerCase));

        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
