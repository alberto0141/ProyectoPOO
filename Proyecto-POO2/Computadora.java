import java.util.ArrayList;

public class Computadora {
    private String procesador;
    private int ram;
    private int almacenamiento;
    private String sistemaOperativo;
    private String tipo;
    private String tarjetaGrafica;
    private boolean disponible;

    private static ArrayList<Computadora> listaComputadoras = new ArrayList<>();

    public Computadora() {
        this.disponible = true;
    }


    public void mostrarInfo() {
        System.out.println("Procesador: " + procesador + ", RAM: " + ram + "GB, Almacenamiento: " + almacenamiento + "GB");
        System.out.println("Sistema Operativo: " + sistemaOperativo + ", Tipo: " + tipo + ", Tarjeta Gráfica: " + tarjetaGrafica);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public void encender() {
        System.out.println("La computadora se ha encendido.");
    }

    public void apagar() {
        System.out.println("La computadora se ha apagado.");
    }

    public void liberar() {
        this.disponible = true;
        System.out.println("Computadora liberada y disponible para renta.");
    }


    public static void registrarComputadora(Computadora c) {
        listaComputadoras.add(c);
        System.out.println("Computadora registrada.");
    }

    public static void consultarComputadoras() {
        if (listaComputadoras.isEmpty()) {
            System.out.println("No hay computadoras registradas.");
            return;
        }
        System.out.println("Listado de computadoras:");
        for (int i = 0; i < listaComputadoras.size(); i++) {
            System.out.println("Índice " + i + ":");
            listaComputadoras.get(i).mostrarInfo();
            System.out.println("----------------");
        }
    }

    public static void eliminarComputadora(int index) {
        if (index >= 0 && index < listaComputadoras.size()) {
            listaComputadoras.remove(index);
            System.out.println("Computadora eliminada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void modificarComputadora(int index, Computadora nuevaComputadora) {
        if (index >= 0 && index < listaComputadoras.size()) {
            listaComputadoras.set(index, nuevaComputadora);
            System.out.println("Computadora modificada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }


    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
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
}



