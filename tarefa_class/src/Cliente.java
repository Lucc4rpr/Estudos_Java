/**
 * A classe Cliente representa um cliente com um código, nome e altura
 * @author Lucca
 * */

public class Cliente {
    public int codigo;
    public String nome;
    public Float altura;

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void cadastrarAltura(Float altura) {
        setAltura(altura);
    }


}
