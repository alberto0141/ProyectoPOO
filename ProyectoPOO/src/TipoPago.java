public abstract class TipoPago {

    protected int idTipo;
    protected double cantidadPago;
    protected String estado;

    public TipoPago() {
    }

    public TipoPago(int idTipo, double cantidadPago, String estado) {
        this.idTipo = idTipo;
        this.cantidadPago = cantidadPago;
        this.estado = estado;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public double getCantidadPago() {
        return cantidadPago;
    }

    public void setCantidadPago(double cantidadPago) {
        this.cantidadPago = cantidadPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract void detallePago();

    public abstract void procesarPago();

    @Override
    public String toString() {
        return "TipoPago{" +
                "idTipo=" + idTipo +
                ", cantidadPago=" + cantidadPago +
                ", estado='" + estado + '\'' +
                '}';
    }
}
