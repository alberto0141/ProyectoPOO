public class Linea extends TipoPago {
    private String plataforma;

    public Linea(int horas, String plataforma) {
        super(horas);
        this.plataforma = plataforma;
    }

    @Override
    public void pagar() {
        System.out.println("Pago en línea vía " + plataforma + " realizado.");
        mostrarDetallePago();
    }

    @Override
    public void mostrarDetallePago() {
        System.out.println("\n--- DETALLE PAGO EN LÍNEA ---");
        super.mostrarDetallePago();
        System.out.println("Plataforma: " + plataforma);
    }
}
