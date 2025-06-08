import java.util.ArrayList;


public class Empleado {
    private String nombre;
    private String correo;
    private String tipo;
    private String telefono;
    private String horario;
    private String horaInicio;
    private String horaFin;
    private ArrayList<String> listaTareas;
    private String estatus;

    private static ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public Empleado() {
        listaTareas = new ArrayList<>();
    }


    public void consultarTareas() {
        System.out.println("Tareas asignadas:");
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas asignadas.");
        } else {
            for (String tarea : listaTareas) {
                System.out.println("- " + tarea);
            }
        }
    }

    public void añadirTarea(String tarea) {
        listaTareas.add(tarea);
        System.out.println("Tarea añadida: " + tarea);
    }


    public static void registrarEmpleado(Empleado e) {
        listaEmpleados.add(e);
        System.out.println("Empleado registrado.");
    }

    public static void consultarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        System.out.println("Listado de empleados:");
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado e = listaEmpleados.get(i);
            System.out.println("Índice " + i + ": Nombre: " + e.getNombre() + ", Tipo: " + e.getTipo() + ", Estatus: " + e.getEstatus());
        }
    }

    public static void eliminarEmpleado(int index) {
        if (index >= 0 && index < listaEmpleados.size()) {
            listaEmpleados.remove(index);
            System.out.println("Empleado eliminado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void modificarEmpleado(int index, Empleado nuevoEmpleado) {
        if (index >= 0 && index < listaEmpleados.size()) {
            listaEmpleados.set(index, nuevoEmpleado);
            System.out.println("Empleado modificado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public String getHoraInicio() { return horaInicio; }
    public void setHoraInicio(String horaInicio) { this.horaInicio = horaInicio; }

    public String getHoraFin() { return horaFin; }
    public void setHoraFin(String horaFin) { this.horaFin = horaFin; }


    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) { this.estatus = estatus; }

    public ArrayList<String> getListaTareas() { return listaTareas; }
}


