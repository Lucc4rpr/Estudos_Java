public class Empresa {

        public static void main(String args[]) {
            Cliente cliente = new Cliente();
            cliente.cadastrarAltura(1.8f);
            System.out.println(cliente.getAltura());
        }

}
