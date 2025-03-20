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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tienda{productos=[");
        
        for (Producto p : productos) {
            sb.append(p).append(", ");
        }
        
        if (!productos.isEmpty()) {
            sb.setLength(sb.length() - 2); 
        }
        
        sb.append("]}");
        return sb.toString();
    }
}