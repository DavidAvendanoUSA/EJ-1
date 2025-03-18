package tienda;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void crearProducto(Producto producto) {
        productos.add(producto);
    }
}

