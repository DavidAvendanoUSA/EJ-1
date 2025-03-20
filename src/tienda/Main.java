package tienda;

import java.util.ArrayList;
import java.util.List;

public class Main {


    private static List<Producto> productos = new ArrayList<>();

    public static void main(String[] args) {  
        Tipo perecedero = new Tipo(true, 0.19);
        Tipo noPerecedero = new Tipo(false, 0.19);

        Producto leche = new Producto(perecedero, 101, "Leche", 2.50, 10, new Fecha(10, 5, 2025));  


        productos.add(leche);

        for (Producto p : productos) {
            System.out.println(p);
        }
    }
    
}