package tienda;

public class Tipo {
    private boolean perecedero;
    private double iva; 

    public Tipo(boolean perecedero, double iva) {
        this.iva = iva;
        this.perecedero = perecedero;
    }

    public double getIva() {
        return iva;
    }

    public boolean isPerecedero() {
        return perecedero;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setPerecedero(boolean perecedero) {
        this.perecedero = perecedero;
    }

    @Override
    public String toString() {
        return "Tipo{perecedero=" + (perecedero ? "Perecedero" : "No Perecedero") + ", iva=" + iva + "}";
    }
}
