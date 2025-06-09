public class Fisico extends TipoPago {
    public Fisico(int horas) {
        super(horas);
    }

    @Override
    public void pagar() {
        System.out.println("Pago físico realizado.");
        mostrarDetallePago();
    }

    @Override
    public void mostrarDetallePago() {
        System.out.println("\n--- DETALLE PAGO FÍSICO ---");
        super.mostrarDetallePago();
    }
}
