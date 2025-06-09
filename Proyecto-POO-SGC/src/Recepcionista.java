public class Recepcionista extends Empleado {
    private String area;

    public Recepcionista() {
        super();
    }

    public Recepcionista(String nombre, String correo, String tipo, String telefono, String horario,
                         String HoraInicio, String HoraFin, String estatus, String area) {
        super();
        this.setNombre(nombre);
        this.setCorreo(correo);
        this.setTipo(tipo);
        this.setTelefono(telefono);
        this.setHorario(horario);
        this.setHoraInicio(HoraInicio);
        this.setHoraFin(HoraFin);
        this.setEstatus(estatus);
        this.area = area;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public void recibirClientes() {
        System.out.println("Recibiendo clientes en el área de: " + area);
    }

    public void gestionarAgenda() {
        System.out.println("Gestionando agenda en el área de: " + area);
    }
}
