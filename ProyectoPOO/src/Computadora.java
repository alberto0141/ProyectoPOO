public class Computadora {

    private String procesador;
    private String ram;
    private String almacenamiento;
    private String modelo;
    private String sistemaOp;
    private String estado;
    private String tipo;
    private String tarjetaGrafica;
    private boolean disponible;
    private boolean disponibilidadComputadora;

    public Computadora() {
    }

    public Computadora(String procesador, String ram, String almacenamiento, String modelo, String sistemaOp,
                       String estado, String tipo, String tarjetaGrafica, boolean disponible, boolean disponibilidadComputadora) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.modelo = modelo;
        this.sistemaOp = sistemaOp;
        this.estado = estado;
        this.tipo = tipo;
        this.tarjetaGrafica = tarjetaGrafica;
        this.disponible = disponible;
        this.disponibilidadComputadora = disponibilidadComputadora;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponibilidadComputadora() {
        return disponibilidadComputadora;
    }

    public void setDisponibilidadComputadora(boolean disponibilidadComputadora) {
        this.disponibilidadComputadora = disponibilidadComputadora;
    }

    public void mostrarInfoComputadora() {
        // Implementación pendiente
    }

    public void encender() {
        // Implementación pendiente
    }

    public void apagar() {
        // Implementación pendiente
    }

    public void consultarComputadoras() {
        // Implementación pendiente
    }

    public void registrarComputadora() {
        // Implementación pendiente
    }

    public void liberarComputadora() {
        // Implementación pendiente
    }

    public void eliminarComputadora() {
        // Implementación pendiente
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "procesador='" + procesador + '\'' +
                ", ram='" + ram + '\'' +
                ", almacenamiento='" + almacenamiento + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOp='" + sistemaOp + '\'' +
                ", estado='" + estado + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tarjetaGrafica='" + tarjetaGrafica + '\'' +
                ", disponible=" + disponible +
                ", disponibilidadComputadora=" + disponibilidadComputadora +
                '}';
    }
}
