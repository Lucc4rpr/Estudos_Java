package out.com.lucca.factory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Ford("Mustang"));
        carros.add(new Toyota("Corolla"));
        carros.add(new Honda("Civic"));

        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}
