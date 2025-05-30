import java.util.Date;

public class Ingeniero extends Empleado{
    private String especialidad;


    //constructores

    public Ingeniero() {

    }

    public Ingeniero(String nombre, String correo, String tipo, int telefono, String horario, Date fechaInicio, Date fechaFin, int idEmpleado, String contrasena, String especialidad) {
        super(nombre, correo, tipo, telefono, horario, fechaInicio, fechaFin, idEmpleado, contrasena);
        this.especialidad = especialidad;
    }

    //getters y setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    //metodos
    @Override
    public void consultarTarea() {

    }

    public void revisarHardware(){

    }

    public void revisarSoftware(){

    }

    public void RegistrarReporteMantenimiento(){

    }

    public void actualizarReporteMantenimiento(){

    }

    public void eliminarReporteMantenimiento(){

    }

}
