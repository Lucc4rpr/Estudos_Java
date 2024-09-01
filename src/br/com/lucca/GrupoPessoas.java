package br.com.lucca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrupoPessoas {

        public static void main(String[] args) {
            List<String> grupoMasculino = new ArrayList<>();
            List<String> grupoFeminino = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Digite o nome da pessoa (ou 'sair' para terminar): ");
                String nome = scanner.nextLine();

                if (nome.equalsIgnoreCase("sair")) {
                    break;
                }

                System.out.print("Digite o sexo da pessoa (M/F): ");
                String sexo = scanner.nextLine();

                if (sexo.equalsIgnoreCase("M")) {
                    grupoMasculino.add(nome);
                } else if (sexo.equalsIgnoreCase("F")) {
                    grupoFeminino.add(nome);
                } else {
                    System.out.println("Sexo inválido! Tente novamente.");
                }
            }

            scanner.close();

            System.out.println("\nGrupo Masculino:");
            for (String pessoa : grupoMasculino) {
                System.out.println(pessoa);
            }

            System.out.println("\nGrupo Feminino:");
            for (String pessoa : grupoFeminino) {
                System.out.println(pessoa);
            }
        }
    }





