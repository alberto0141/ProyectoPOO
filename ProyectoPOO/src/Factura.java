public class Factura {

    private Double total;
    private String fechaFactura;

    // Constructor por defecto
    public Factura() {
    }

    // Constructor con parámetros
    public Factura(Double total, String fechaFactura) {
        this.total = total;
        this.fechaFactura = fechaFactura;
    }

    // Getters y Setters
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    // Métodos solicitados (vacíos)
    public double calcularTotal() {
        // Implementación pendiente
        return 0.0;
    }

    public void mostrarFactura() {
        // Implementación pendiente
    }

    @Override
    public String toString() {
        return "Factura{" +
                "total=" + total +
                ", fechaFactura='" + fechaFactura + '\'' +
                '}';
    }
}
