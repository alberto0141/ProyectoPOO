public class Linea extends TipoPago {

    private String proveedor;
    private String referenciaNumero;

    public Linea() {
    }

    public Linea(int idTipo, double cantidadPago, String estado, String proveedor, String referenciaNumero) {
        super(idTipo, cantidadPago, estado);
        this.proveedor = proveedor;
        this.referenciaNumero = referenciaNumero;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getReferenciaNumero() {
        return referenciaNumero;
    }

    public void setReferenciaNumero(String referenciaNumero) {
        this.referenciaNumero = referenciaNumero;
    }

    @Override
    public void detallePago() {
        // Implementación pendiente
    }

    @Override
    public void procesarPago() {
        // Implementación pendiente
    }

    @Override
    public String toString() {
        return "Linea{" +
                "proveedor='" + proveedor + '\'' +
                ", referenciaNumero='" + referenciaNumero + '\'' +
                ", idTipo=" + idTipo +
                ", cantidadPago=" + cantidadPago +
                ", estado='" + estado + '\'' +
                '}';
    }
}