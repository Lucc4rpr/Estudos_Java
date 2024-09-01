package br.com.lucca;

public class OperadoresAritmeticos {


    public static void main(String args[]) {
        operacoesMedia();
    }


    public static void operacoesMedia() {
        double nota1 = 10;
        double nota2 = 7;
        double nota3 = 4;
        double nota4 = 5;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(media);

        Double mediaConvertida = media;
        System.out.println(mediaConvertida);
    }


}


