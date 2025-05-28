import java.sql.Date;
import java.sql.Time;

public class Renta {

    private int idRenta;
    private Time horaInicio;
    private Time horaFin;
    private Date fecha;

    // Constructor por defecto
    public Renta() {
    }

    // Constructor con parámetros
    public Renta(int idRenta, Time horaInicio, Time horaFin, Date fecha) {
        this.idRenta = idRenta;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.fecha = fecha;
    }

    // Getters y Setters
    public int getIdRenta() {
        return idRenta;
    }

    public void setIdRenta(int idRenta) {
        this.idRenta = idRenta;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Métodos solicitados (vacíos)
    public double calcularTotal() {
        // Implementación pendiente
        return 0.0;
    }

    public void verDetalles() {
        // Implementación pendiente
    }

    public void generarFactura() {
        // Implementación pendiente
    }

    public void buscarPorIDCliente() {
        // Implementación pendiente
    }

    public void generarRentas() {
        // Implementación pendiente
    }

    public void consultarHistorialRentas() {
        // Implementación pendiente
    }

    public void editar() {
        // Implementación pendiente
    }

    public void eliminar() {
        // Implementación pendiente
    }

    @Override
    public String toString() {
        return "Renta{" +
                "idRenta=" + idRenta +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", fecha=" + fecha +
                '}';
    }
}
