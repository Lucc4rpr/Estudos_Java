package out.com.lucca;

public class programa {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Lucca xyz", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa tal", "12.345.678/0000-00");

        System.out.println(pf);
        System.out.println(pj);
    }
}
