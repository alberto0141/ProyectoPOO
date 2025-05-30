import java.util.Date;

public class Tarjeta extends TipoPago {

    private String tipoTarjeta;
    private String entidadBancaria;
    private Date fechaOperacion;
    private String nombreTitular;
    private String numeroTarjeta;
    private Date fechaVencimiento;

    public Tarjeta() {
    }

    public Tarjeta(int idTipo, double cantidadPago, String estado, String tipoTarjeta, String entidadBancaria,
                   Date fechaOperacion, String nombreTitular, String numeroTarjeta, Date fechaVencimiento) {
        super(idTipo, cantidadPago, estado);
        this.tipoTarjeta = tipoTarjeta;
        this.entidadBancaria = entidadBancaria;
        this.fechaOperacion = fechaOperacion;
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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
        return "Tarjeta{" +
                "tipoTarjeta='" + tipoTarjeta + '\'' +
                ", entidadBancaria='" + entidadBancaria + '\'' +
                ", fechaOperacion=" + fechaOperacion +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", idTipo=" + idTipo +
                ", cantidadPago=" + cantidadPago +
                ", estado='" + estado + '\'' +
                '}';
    }
}

