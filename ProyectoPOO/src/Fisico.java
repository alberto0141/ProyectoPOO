/**
 * Representa un pago en efectivo.
 */
public class Fisico extends TipoPago {

    private double cantidadRecibida;
    private double cambio;

    public Fisico() {
    }

    public Fisico(int idTipo, double cantidadPago, String estado, double cantidadRecibida, double cambio) {
        super(idTipo, cantidadPago, estado);
        this.cantidadRecibida = cantidadRecibida;
        this.cambio = cambio;
    }

    public double getCantidadRecibida() {
        return cantidadRecibida;
    }

    public void setCantidadRecibida(double cantidadRecibida) {
        this.cantidadRecibida = cantidadRecibida;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
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
        return "Fisico{" +
                "cantidadRecibida=" + cantidadRecibida +
                ", cambio=" + cambio +
                ", idTipo=" + idTipo +
                ", cantidadPago=" + cantidadPago +
                ", estado='" + estado + '\'' +
                '}';
    }
}
