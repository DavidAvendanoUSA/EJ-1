package tienda;

public class Producto {
    private Tipo tipoProducto;
    private int codigoProducto;
    private String descripcionProducto;
    private double precioVenta;
    private int catidadProducto;
    private Fecha fechaCaducacion;
    public Producto(Tipo tipoProducto, int codigoProducto, String descripcionProducto, double precioVenta, int catidadProducto, Fecha fechaCaducacion) {
        this.tipoProducto = tipoProducto;
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto; 
        this.precioVenta = precioVenta; 
        this.catidadProducto = catidadProducto;
        this.fechaCaducacion = fechaCaducacion;
    }
    public Tipo getTipoProducto() {
        return tipoProducto;
    }
    public int getCodigoProducto() {
        return codigoProducto;
    }
    public String getDescripcionProducto() {
        return descripcionProducto;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public int getCatidadProducto() {
        return catidadProducto;
    }
    public Fecha getFechaCaducacion() {
        return fechaCaducacion;
    }
    public void setTipoProducto(Tipo tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public void setCatidadProducto(int catidadProducto) {
        this.catidadProducto = catidadProducto;
    }
    public void setFechaCaducacion(Fecha fechaCaducacion) {
        this.fechaCaducacion = fechaCaducacion;
    }
}   
