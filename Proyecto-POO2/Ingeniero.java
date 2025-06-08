import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Ingeniero extends Empleado {
    private String especialidad;
    private List<String> reportes;  // Cambiado a List<String>

    public Ingeniero() {
        super();
        this.reportes = new ArrayList<>();
    }

    public Ingeniero(String nombre, String correo, String tipo, String telefono, String horario,
                     String horaInicio, String horaFin, String estatus, String especialidad) {
        super(nombre, correo, tipo, telefono, horario, horaInicio, horaFin, estatus);
        this.especialidad = especialidad;
        this.reportes = new ArrayList<>();
    }


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
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- REGISTRO DE REPORTE DE MANTENIMIENTO ---");

        String reporteId = "RPT-" + (int)(Math.random() * 1000);

        System.out.print("Equipo/sistema afectado: ");
        String equipo = scanner.nextLine();

        System.out.print("Tipo de mantenimiento (Preventivo/Correctivo/Mejora): ");
        String tipo = scanner.nextLine();

        System.out.println("Describa el problema (escriba 'fin' en una línea nueva para terminar):");
        StringBuilder descripcion = new StringBuilder();
        String linea;
        while (!(linea = scanner.nextLine()).equalsIgnoreCase("fin")) {
            descripcion.append(linea).append("\n");
        }


        String reporte = "ID: " + reporteId + "\n" +
                "Equipo: " + equipo + "\n" +
                "Tipo: " + tipo + "\n" +
                "Ingeniero: " + this.getNombre() + "\n" +
                "Fecha: " + new Date() + "\n" +
                "Descripción:\n" + descripcion.toString();


        this.reportes.add(reporte);

        System.out.println("\nReporte registrado exitosamente con ID: " + reporteId);
    }

    public void actualizarReporteMantenimiento() {
        if (reportes.isEmpty()) {
            System.out.println("\n--- ACTUALIZAR REPORTE ---");
            System.out.println("No hay reportes registrados para actualizar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ACTUALIZAR REPORTE ---");
        System.out.println("Reportes disponibles:");

        // Mostrar lista de reportes
        for (int i = 0; i < reportes.size(); i++) {
            String[] lineas = reportes.get(i).split("\n");
            System.out.println((i+1) + ". " + lineas[0] + " - " + lineas[1]);
        }

        // Seleccionar reporte
        System.out.print("\nSeleccione el número de reporte a actualizar: ");
        int seleccion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        if (seleccion < 1 || seleccion > reportes.size()) {
            System.out.println("Selección inválida.");
            return;
        }


        System.out.println("Reporte seleccionado:");
        System.out.println(reportes.get(seleccion-1));


        System.out.println("¿Qué desea actualizar?");
        System.out.println("1. Equipo/sistema");
        System.out.println("2. Tipo de mantenimiento");
        System.out.println("3. Descripción");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();


        String[] partes = reportes.get(seleccion-1).split("\n");


        switch (opcion) {
            case 1:
                System.out.print("Nuevo equipo/sistema: ");
                partes[1] = "Equipo: " + scanner.nextLine();
                break;
            case 2:
                System.out.print("Nuevo tipo de mantenimiento: ");
                partes[2] = "Tipo: " + scanner.nextLine();
                break;
            case 3:
                System.out.println("Nueva descripción (escriba 'fin' en línea nueva para terminar):");
                StringBuilder nuevaDesc = new StringBuilder();
                String linea;
                while (!(linea = scanner.nextLine()).equalsIgnoreCase("fin")) {
                    nuevaDesc.append(linea).append("\n");
                }
                partes[5] = "Descripción:\n" + nuevaDesc.toString();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        String reporteActualizado = String.join("\n", partes);
        reportes.set(seleccion-1, reporteActualizado);

        System.out.println("Reporte actualizado exitosamente.");
    }

    public void eliminarReporteMantenimiento() {
        if (reportes.isEmpty()) {
            System.out.println("--- ELIMINAR REPORTE ---");
            System.out.println("No hay reportes registrados para eliminar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- ELIMINAR REPORTE ---");
        System.out.println("Reportes disponibles:");


        for (int i = 0; i < reportes.size(); i++) {
            String[] lineas = reportes.get(i).split("\n");
            System.out.println((i+1) + ". " + lineas[0] + " - " + lineas[1]);
        }


        System.out.print("Seleccione el número de reporte a eliminar: ");
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        if (seleccion < 1 || seleccion > reportes.size()) {
            System.out.println("Selección inválida.");
            return;
        }


        System.out.println("Reporte seleccionado:");
        System.out.println(reportes.get(seleccion-1));


        System.out.print("¿Está seguro que desea eliminar este reporte? (S/N): ");
        String confirmacion = scanner.nextLine();

        if (confirmacion.equalsIgnoreCase("S")) {
            String reporteEliminado = reportes.remove(seleccion-1);
            System.out.println("\nReporte eliminado exitosamente:");
            System.out.println(reporteEliminado);
        } else {
            System.out.println("Eliminación cancelada.");
        }
    }

    public void mostrarReportes() {
        if (reportes.isEmpty()) {
            System.out.println("--- LISTA DE REPORTES ---");
            System.out.println("No hay reportes registrados.");
            return;
        }

        System.out.println("--- LISTA DE REPORTES ---");
        System.out.println("Total de reportes: " + reportes.size());

        for (String reporte : reportes) {
            System.out.println("\n" + reporte);
            System.out.println("---------------------");
        }
    }

}



