import java.util.Date;

public class Ingeniero extends Empleado {
    private String especialidad;

    public Ingeniero() {
        super();
    }

    public Ingeniero(String nombre, String correo, String tipo, String telefono, String horario,
                     String horaInicio, String horaFin, String estatus, String especialidad) {
        super();
        this.setNombre(nombre);
        this.setCorreo(correo);
        this.setTipo(tipo);
        this.setTelefono(telefono);
        this.setHorario(horario);
        this.setHoraInicio(horaInicio);
        this.setHoraFin(horaFin);
        this.setEstatus(estatus);
        this.especialidad = especialidad;
    }

    // Getters y setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    public void especialidad() {
        System.out.println("Especialidad: " + especialidad);
    }

    public void revisarHW(Computadora comp) {
        System.out.println("\n--- REVISIÓN DE HARDWARE ---");
        System.out.println("Ingeniero: " + this.getNombre());
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Computadora: " + comp.getProcesador());
        System.out.println("RAM: " + comp.getRam() + "GB");
        System.out.println("Realizando diagnósticos de hardware...");
        System.out.println("Revisión completada.");
    }

    public void arreglarSW(Computadora comp) {
        System.out.println("\n--- REPARACIÓN DE SOFTWARE ---");
        System.out.println("Ingeniero: " + this.getNombre());
        System.out.println("Computadora: " + comp.getProcesador());
        System.out.println("Sistema Operativo: " + comp.getSistemaOperativo());
        System.out.println("Analizando problemas de software...");
        System.out.println("Instalando actualizaciones...");
        System.out.println("Reparación completada.");
    }

    public void registrarReporteMantenimiento() {
        System.out.println("\n--- NUEVO REPORTE ---");
        System.out.println("Ingeniero: " + this.getNombre());
        System.out.println("Fecha: " + new Date());
        System.out.println("Reporte de mantenimiento registrado en el sistema.");
        System.out.println("ID: " + (int)(Math.random() * 1000));
    }

    public void actualizarReporteMantenimiento() {
        System.out.println("\n--- ACTUALIZAR REPORTE ---");
        System.out.print("Ingrese ID del reporte: ");
        System.out.println("Reporte de mantenimiento actualizado.");
    }

    public void eliminarReporteMantenimiento() {
        System.out.println("\n--- ELIMINAR REPORTE ---");
        System.out.print("Ingrese ID del reporte a eliminar: ");
        System.out.println("Reporte de mantenimiento eliminado del sistema.");
    }
}



