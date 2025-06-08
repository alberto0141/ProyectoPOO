import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String correo;
    private ArrayList<Renta> registroRenta;

    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public Cliente() {
        registroRenta = new ArrayList<>();
    }


    public void pedirRenta(Renta renta) {
        registroRenta.add(renta);
        System.out.println("Renta registrada para " + nombre + " con computadora " +
                renta.getComputadora().getProcesador() + " el " + renta.getFecha());
    }

    public void reportarFalla(String falla) {
        System.out.println("Falla reportada: " + falla);
    }

    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " realizado por el cliente.");
    }

    public void verDatos() {
        System.out.println("Nombre: " + nombre + ", Correo: " + correo);
        System.out.println("Historial de rentas:");
        if (registroRenta.isEmpty()) {
            System.out.println("No tiene rentas registradas.");
        } else {
            for (Renta renta : registroRenta) {
                System.out.println("- Computadora: " + renta.getComputadora().getProcesador()
                        + ", Fecha: " + renta.getFecha()
                        + ", Monto: $" + renta.getMonto());
            }
        }
    }


    public static void registrarCliente(Cliente c) {
        listaClientes.add(c);
        System.out.println("Cliente registrado.");
    }

    public static void consultarClientes() {
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        System.out.println("Listado de clientes:");
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente c = listaClientes.get(i);
            System.out.println("Índice " + i + ": Nombre: " + c.getNombre() + ", Correo: " + c.getCorreo());
        }
    }

    public static void eliminarCliente(int index) {
        if (index >= 0 && index < listaClientes.size()) {
            listaClientes.remove(index);
            System.out.println("Cliente eliminado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void modificarCliente(int index, Cliente nuevoCliente) {
        if (index >= 0 && index < listaClientes.size()) {
            listaClientes.set(index, nuevoCliente);
            System.out.println("Cliente modificado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public ArrayList<Renta> getRegistroRenta() { return registroRenta; }
}


