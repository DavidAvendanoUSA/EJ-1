package tienda; 
public class Main {public static void main(String[] args) {  
    Tienda tienda = new Tienda();  
    
    Tipo tipoLacteo = new Tipo(true, 0.19);  
    Producto leche = new Producto(tipoLacteo, 101, "Leche", 2.50, 10, new Fecha(10, 5, 2025));  
    tienda.crearProducto(leche);  
    System.out.println("Producto creado con éxito.");  
    System.out.println("Código: " + leche.getCodigoProducto() + 
    ", Nombre: " + leche.getDescripcionProducto() + 
    ", Precio: " + leche.getPrecioVenta() + 
    ", IVA: " + leche.getTipoProducto().getIva() + 
    ", Precio con IVA: " + (leche.getPrecioVenta() * (1 + leche.getTipoProducto().getIva())) + 
    ", Cantidad: " + leche.getCatidadProducto() + 
    ", Fecha de caducidad: " + leche.getFechaCaducacion().getDia() + "/" +
                            leche.getFechaCaducacion().getMes() + "/" +
                            leche.getFechaCaducacion().getAnio());


}
}