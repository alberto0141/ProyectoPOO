import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Listas globales para manejar el sistema
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Computadora> computadoras = new ArrayList<>();
    static ArrayList<Empleado> empleados = new ArrayList<>();
    static ArrayList<Renta> rentas = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- SISTEMA DE RENTA DE COMPUTADORAS ---");
            System.out.println("1. Gestión de Clientes");
            System.out.println("2. Gestión de Computadoras");
            System.out.println("3. Gestión de Empleados");
            System.out.println("4. Realizar Renta");
            System.out.println("5. Ver Rentas y Facturas");
            System.out.println("6. Funciones de Ingeniero");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            int opcion = leerEntero();

            switch (opcion) {
                case 1 -> menuClientes();
                case 2 -> menuComputadoras();
                case 3 -> menuEmpleados();
                case 4 -> realizarRenta();
                case 5 -> mostrarRentasFacturas();
                case 6 -> menuIngeniero();
                case 7 -> {
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

   //menu de los clientes
    static void menuClientes() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE CLIENTES ---");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Modificar Cliente");
            System.out.println("3. Eliminar Cliente");
            System.out.println("4. Mostrar Clientes");
            System.out.println("5. Volver");
            System.out.print("Elige una opción: ");
            int op = leerEntero();

            switch (op) {
                case 1 -> registrarCliente();
                case 2 -> modificarCliente();
                case 3 -> eliminarCliente();
                case 4 -> mostrarClientes();
                case 5 -> volver = true;
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    static void registrarCliente() {
        System.out.println("--- Registrar Cliente ---");
        Cliente c = new Cliente();
        System.out.print("Nombre: ");
        c.setNombre(sc.nextLine());
        System.out.print("Correo: ");
        c.setCorreo(sc.nextLine());
        clientes.add(c);
        System.out.println("Cliente registrado correctamente.");
    }

    static void modificarCliente() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        mostrarClientes();
        System.out.print("Elige el número de cliente a modificar: ");
        int idx = leerEntero() - 1;
        if (idx >= 0 && idx < clientes.size()) {
            Cliente c = clientes.get(idx);
            System.out.print("Nuevo nombre (" + c.getNombre() + "): ");
            String nuevoNombre = sc.nextLine();
            if (!nuevoNombre.isBlank()) c.setNombre(nuevoNombre);
            System.out.print("Nuevo correo (" + c.getCorreo() + "): ");
            String nuevoCorreo = sc.nextLine();
            if (!nuevoCorreo.isBlank()) c.setCorreo(nuevoCorreo);
            System.out.println("Cliente modificado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    static void eliminarCliente() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        mostrarClientes();
        System.out.print("Elige el número de cliente a eliminar: ");
        int idx = leerEntero() - 1;
        if (idx >= 0 && idx < clientes.size()) {
            clientes.remove(idx);
            System.out.println("Cliente eliminado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    static void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        System.out.println("Clientes registrados:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.printf("%d. %s, correo: %s\n", i + 1, clientes.get(i).getNombre(), clientes.get(i).getCorreo());
        }
    }

    //menu de las computadoras
    static void menuComputadoras() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE COMPUTADORAS ---");
            System.out.println("1. Registrar Computadora");
            System.out.println("2. Mostrar Computadoras");
            System.out.println("3. Liberar Computadora");
            System.out.println("4. Eliminar Computadora");
            System.out.println("5. Volver");
            System.out.print("Elige una opción: ");
            int op = leerEntero();

            switch (op) {
                case 1 -> registrarComputadora();
                case 2 -> mostrarComputadoras();
                case 3 -> liberarComputadora();
                case 4 -> eliminarComputadora();
                case 5 -> volver = true;
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    static void registrarComputadora() {
        System.out.println("--- Registrar Computadora ---");
        Computadora c = new Computadora();

        System.out.print("Procesador: ");
        c.setProcesador(sc.nextLine());

        System.out.print("RAM (GB): ");
        c.setRam(leerEntero());

        System.out.print("Almacenamiento (GB): ");
        c.setAlmacenamiento(leerEntero());

        System.out.print("Sistema Operativo: ");
        c.setSistemaOperativo(sc.nextLine());

        System.out.print("Tipo: ");
        c.setTipo(sc.nextLine());

        System.out.print("Tarjeta gráfica: ");
        c.setTarjetaGrafica(sc.nextLine());

        c.setDisponible(true);

        computadoras.add(c);
        System.out.println("Computadora registrada correctamente.");
    }

    static void mostrarComputadoras() {
        if (computadoras.isEmpty()) {
            System.out.println("No hay computadoras registradas.");
            return;
        }
        System.out.println("Lista de computadoras:");
        for (int i = 0; i < computadoras.size(); i++) {
            System.out.printf("%d. ", i + 1);
            computadoras.get(i).mostrarInfo();
            System.out.println();
        }
    }

    static void liberarComputadora() {
        if (computadoras.isEmpty()) {
            System.out.println("No hay computadoras registradas.");
            return;
        }
        mostrarComputadoras();
        System.out.print("Elige el número de computadora a liberar: ");
        int idx = leerEntero() - 1;
        if (idx >= 0 && idx < computadoras.size()) {
            Computadora c = computadoras.get(idx);
            if (!c.isDisponible()) {
                c.setDisponible(true);
                System.out.println("Computadora liberada.");
            } else {
                System.out.println("La computadora ya está disponible.");
            }
        } else {
            System.out.println("Índice inválido.");
        }
    }

    static void eliminarComputadora() {
        if (computadoras.isEmpty()) {
            System.out.println("No hay computadoras registradas.");
            return;
        }
        mostrarComputadoras();
        System.out.print("Elige el número de computadora a eliminar: ");
        int idx = leerEntero() - 1;
        if (idx >= 0 && idx < computadoras.size()) {
            computadoras.remove(idx);
            System.out.println("Computadora eliminada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    //menu de los empleados
    static void menuEmpleados() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE EMPLEADOS ---");
            System.out.println("1. Registrar Empleado (Recepcionista)");
            System.out.println("2. Registrar Empleado (Ingeniero)");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. Modificar Empleado");
            System.out.println("5. Eliminar Empleado");
            System.out.println("6. Volver");
            System.out.print("Elige una opción: ");
            int op = leerEntero();

            switch (op) {
                case 1 -> registrarRecepcionista();
                case 2 -> registrarIngeniero();
                case 3 -> mostrarEmpleados();
                case 4 -> modificarEmpleado();
                case 5 -> eliminarEmpleado();
                case 6 -> volver = true;
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    static void registrarRecepcionista() {
        System.out.println("--- Registrar Recepcionista ---");
        Recepcionista r = new Recepcionista();
        cargarDatosEmpleado(r);
        empleados.add(r);
        System.out.println("Recepcionista registrada.");
    }

    static void registrarIngeniero() {
        System.out.println("--- Registrar Ingeniero ---");
        Ingeniero i = new Ingeniero();
        cargarDatosEmpleado(i);
        System.out.print("Especialidad: ");
        i.setEspecialidad(sc.nextLine());
        empleados.add(i);
        System.out.println("Ingeniero registrado.");
    }

    static void cargarDatosEmpleado(Empleado e) {
        System.out.print("Nombre: ");
        e.setNombre(sc.nextLine());
        System.out.print("Correo: ");
        e.setCorreo(sc.nextLine());
        System.out.print("Tipo: ");
        e.setTipo(sc.nextLine());
        System.out.print("Teléfono: ");
        e.setTelefono(sc.nextLine());
        System.out.print("Horario: ");
        e.setHorario(sc.nextLine());
        System.out.print("hora Inicio: ");
        e.setHoraInicio(sc.nextLine());
        System.out.print("hora Fin: ");
        e.setHoraFin(sc.nextLine());
        System.out.print("Estatus: ");
        e.setEstatus(sc.nextLine());
    }

    static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        System.out.println("Lista de empleados:");
        for (int i = 0; i < empleados.size(); i++) {
            Empleado e = empleados.get(i);
            System.out.printf("%d. %s, Tipo: %s, Correo: %s\n", i + 1, e.getNombre(), e.getTipo(), e.getCorreo());
        }
    }

    static void modificarEmpleado() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        mostrarEmpleados();
        System.out.print("Elige el número de empleado a modificar: ");
        int idx = leerEntero() - 1;
        if (idx >= 0 && idx < empleados.size()) {
            Empleado e = empleados.get(idx);
            System.out.print("Nuevo nombre (" + e.getNombre() + "): ");
            String nuevoNombre = sc.nextLine();
            if (!nuevoNombre.isBlank()) e.setNombre(nuevoNombre);

            System.out.print("Nuevo correo (" + e.getCorreo() + "): ");
            String nuevoCorreo = sc.nextLine();
            if (!nuevoCorreo.isBlank()) e.setCorreo(nuevoCorreo);

            System.out.print("Nuevo tipo (" + e.getTipo() + "): ");
            String nuevoTipo = sc.nextLine();
            if (!nuevoTipo.isBlank()) e.setTipo(nuevoTipo);

            System.out.print("Nuevo teléfono (" + e.getTelefono() + "): ");
            String nuevoTelefono = sc.nextLine();
            if (!nuevoTelefono.isBlank()) e.setTelefono(nuevoTelefono);

            System.out.print("Nuevo horario (" + e.getHorario() + "): ");
            String nuevoHorario = sc.nextLine();
            if (!nuevoHorario.isBlank()) e.setHorario(nuevoHorario);

            System.out.print("Nueva fecha inicio (" + e.getHoraInicio() + "): ");
            String nuevaFechaInicio = sc.nextLine();
            if (!nuevaFechaInicio.isBlank()) e.setHoraInicio(nuevaFechaInicio);

            System.out.print("Nueva fecha fin (" + e.getHoraFin() + "): ");
            String nuevaFechaFin = sc.nextLine();
            if (!nuevaFechaFin.isBlank()) e.setHoraFin(nuevaFechaFin);

            System.out.print("Nuevo estatus (" + e.getEstatus() + "): ");
            String nuevoEstatus = sc.nextLine();
            if (!nuevoEstatus.isBlank()) e.setEstatus(nuevoEstatus);

            if (e instanceof Ingeniero) {
                Ingeniero ing = (Ingeniero) e;
                System.out.print("Nueva especialidad (" + ing.getEspecialidad() + "): ");
                String nuevaEsp = sc.nextLine();
                if (!nuevaEsp.isBlank()) ing.setEspecialidad(nuevaEsp);
            }

            System.out.println("Empleado modificado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    static void eliminarEmpleado() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        mostrarEmpleados();
        System.out.print("Elige el número de empleado a eliminar: ");
        int idx = leerEntero() - 1;
        if (idx >= 0 && idx < empleados.size()) {
            empleados.remove(idx);
            System.out.println("Empleado eliminado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    //menu de ingeniero
    static void menuIngeniero() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        // Mostrar solo ingenieros
        System.out.println("\n--- SELECCIONAR INGENIERO ---");
        int contador = 1;
        ArrayList<Ingeniero> ingenieros = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (emp instanceof Ingeniero) {
                System.out.printf("%d. %s - %s\n", contador++, emp.getNombre(), ((Ingeniero)emp).getEspecialidad());
                ingenieros.add((Ingeniero)emp);
            }
        }

        if (ingenieros.isEmpty()) {
            System.out.println("No hay ingenieros registrados.");
            return;
        }

        System.out.print("Seleccione un ingeniero: ");
        int idxIng = leerEntero() - 1;

        if (idxIng < 0 || idxIng >= ingenieros.size()) {
            System.out.println("Selección inválida.");
            return;
        }

        Ingeniero ingeniero = ingenieros.get(idxIng);
        boolean volver = false;

        while (!volver) {
            System.out.println("\n--- MENÚ INGENIERO: " + ingeniero.getNombre() + " ---");
            System.out.println("1. Revisar hardware de computadora");
            System.out.println("2. Arreglar software de computadora");
            System.out.println("3. Registrar reporte de mantenimiento");
            System.out.println("4. Actualizar reporte de mantenimiento");
            System.out.println("5. Eliminar reporte de mantenimiento");
            System.out.println("6. Volver");
            System.out.print("Elige una opción: ");
            int op = leerEntero();

            switch (op) {
                case 1 -> {
                    if (computadoras.isEmpty()) {
                        System.out.println("No hay computadoras registradas.");
                        break;
                    }
                    mostrarComputadoras();
                    System.out.print("Seleccione computadora a revisar: ");
                    int idxComp = leerEntero() - 1;
                    if (idxComp >= 0 && idxComp < computadoras.size()) {
                        ingeniero.revisarHW(computadoras.get(idxComp));
                    } else {
                        System.out.println("Índice inválido.");
                    }
                }
                case 2 -> {
                    if (computadoras.isEmpty()) {
                        System.out.println("No hay computadoras registradas.");
                        break;
                    }
                    mostrarComputadoras();
                    System.out.print("Seleccione computadora a reparar: ");
                    int idxComp = leerEntero() - 1;
                    if (idxComp >= 0 && idxComp < computadoras.size()) {
                        ingeniero.arreglarSW(computadoras.get(idxComp));
                    } else {
                        System.out.println("Índice inválido.");
                    }
                }
                case 3 -> ingeniero.registrarReporteMantenimiento();
                case 4 -> ingeniero.actualizarReporteMantenimiento();
                case 5 -> ingeniero.eliminarReporteMantenimiento();
                case 6 -> volver = true;
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    // rentas y pagos
    static void realizarRenta() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados para realizar renta.");
            return;
        }
        if (computadoras.isEmpty()) {
            System.out.println("No hay computadoras registradas para rentar.");
            return;
        }

        System.out.println("--- Realizar Renta ---");
        mostrarClientes();
        System.out.print("Selecciona cliente (número): ");
        int clienteIdx = leerEntero() - 1;
        if (clienteIdx < 0 || clienteIdx >= clientes.size()) {
            System.out.println("Cliente inválido.");
            return;
        }
        Cliente cliente = clientes.get(clienteIdx);

        mostrarComputadoras();
        System.out.print("Selecciona computadora (número): ");
        int compIdx = leerEntero() - 1;
        if (compIdx < 0 || compIdx >= computadoras.size()) {
            System.out.println("Computadora inválida.");
            return;
        }
        Computadora comp = computadoras.get(compIdx);
        if (!comp.isDisponible()) {
            System.out.println("Computadora no disponible para renta.");
            return;
        }

        System.out.print("Monto de renta: ");
        double monto = leerDouble();

        System.out.println("\n--- Seleccione tipo de pago ---");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        System.out.println("3. Pago en línea");
        System.out.print("Opción: ");
        int opcionPago = leerEntero();

        TipoPago tipoPago = null;
        switch (opcionPago) {
            case 1 -> {
                tipoPago = new Fisico(monto);
                System.out.println("Pago en efectivo seleccionado.");
            }
            case 2 -> {
                System.out.print("Número de tarjeta: ");
                String numero = sc.nextLine();
                System.out.print("Nombre titular: ");
                String titular = sc.nextLine();
                System.out.print("Fecha vencimiento (MM/YY): ");
                String vencimiento = sc.nextLine();
                System.out.print("CVV: ");
                String cvv = sc.nextLine();
                tipoPago = new Tarjeta(monto, numero, titular, vencimiento, cvv);
                System.out.println("Pago con tarjeta registrado.");
            }
            case 3 -> {
                System.out.print("Plataforma (PayPal/Transferencia/etc): ");
                String plataforma = sc.nextLine();
                tipoPago = new Linea(monto, plataforma);
                System.out.println("Pago en línea registrado.");
            }
            default -> {
                System.out.println("Opción inválida, se usará efectivo por defecto.");
                tipoPago = new Fisico(monto);
            }
        }

        // generar la renta con el tipo de pago
        Renta renta = new Renta(cliente, comp, monto, tipoPago);
        rentas.add(renta);
        cliente.pedirRenta(renta);
        comp.setDisponible(false);

        // generar factura
        Factura factura = new Factura(renta, tipoPago);
        factura.imprimirFactura();

        System.out.println("Renta realizada con éxito.");
    }


    static void mostrarRentasFacturas() {
        if (rentas.isEmpty()) {
            System.out.println("No hay rentas registradas.");
            return;
        }
        System.out.println("--- Rentas ---");
        for (int i = 0; i < rentas.size(); i++) {
            Renta r = rentas.get(i);
            System.out.printf("%d. Cliente: %s | Computadora: %s | Monto: %.2f | Pago: ",
                    i + 1, r.getCliente().getNombre(), r.getComputadora().getProcesador(), r.getMonto());
            r.getTipoPago().mostrarDetallePago();
        }
    }


    static int leerEntero() {
        while (true) {
            try {
                String input = sc.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingresa un número: ");
            }
        }
    }

    static double leerDouble() {
        while (true) {
            try {
                String input = sc.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingresa un número decimal: ");
            }
        }
    }
}
