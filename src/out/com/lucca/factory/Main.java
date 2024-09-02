package out.com.lucca.factory;

public class Main {
    public static void main(String[] args) {
        Class<Produto> produtoClass = Produto.class;

        if (produtoClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = produtoClass.getAnnotation(Tabela.class);

            System.out.println("Nome da Tabela: " + tabela.value());
        } else {
            System.out.println("A anotação Tabela não existe");
        }
    }
}
