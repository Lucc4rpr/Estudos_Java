package br.com.lucca;

public class OperadoresAritmeticos {


    public static void main(String args[]) {
        operacoesMedia();
    }


    public static void operacoesMedia() {
        double nota1 = 10;
        double nota2 = 7;
        double nota3 = 1;
        double nota4 = 1;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        Double mediaConvertida = media;


        if (mediaConvertida >= 7) {
            System.out.println("Nota " + mediaConvertida + "- Aprovado");
        } else if (mediaConvertida >= 5) {
            System.out.println("Nota " + mediaConvertida + "- Recuperação");
        } else {
            System.out.println("Nota " + mediaConvertida + "- Reprovado");
        }
    }


}


