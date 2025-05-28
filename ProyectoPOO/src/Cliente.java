import java.util.List;

public class Cliente {

    private String nombre;
    private int idCliente;
    private List<Renta> registroRenta;
    private String correoCliente;
    private int numeroTelefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String nombre, int idCliente, List<Renta> registroRenta, String correoCliente, int numeroTelefono, String direccion) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.registroRenta = registroRenta;
        this.correoCliente = correoCliente;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Renta> getRegistroRenta() {
        return registroRenta;
    }

    public void setRegistroRenta(List<Renta> registroRenta) {
        this.registroRenta = registroRenta;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Métodos solicitados (vacíos)
    public void pedirRenta() {
        // Implementación pendiente
    }

    public void reportarFallas() {
        // Implementación pendiente
    }

    public void pagar(TipoPago tipoPago) {
        // Implementación pendiente
    }

    public void verDatos() {
        // Implementación pendiente
    }

    public void registrarCliente() {
        // Implementación pendiente
    }

    public void eliminarCliente() {
        // Implementación pendiente
    }

    public void modificarCliente() {
        // Implementación pendiente
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", idCliente=" + idCliente +
                ", registroRenta=" + registroRenta +
                ", correoCliente='" + correoCliente + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
