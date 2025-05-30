import java.util.Date;

public abstract class Empleado {
    private String nombre;
    private String correo;
    private String tipo;
    private int telefono;
    private String horario;
    private Date fechaInicio;
    private Date fechaFin;
    private int idEmpleado;
    private String contrasena;

    // Constructor por defecto
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(String nombre, String correo, String tipo, int telefono, String horario,
                    Date fechaInicio, Date fechaFin, int idEmpleado, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.tipo = tipo;
        this.telefono = telefono;
        this.horario = horario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idEmpleado = idEmpleado;
        this.contrasena = contrasena;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getHorario() {
        return horario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getContrasena() {
        return contrasena;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }


    abstract void consultarTarea();


    public void agregarEmpleado() {

    }

    public void cambiarEmpleado() {

    }

 }
