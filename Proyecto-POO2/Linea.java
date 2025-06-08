public class Linea extends TipoPago {
    private String plataforma;

    public Linea(double monto, String plataforma) {
        super(monto);
        this.plataforma = plataforma;
    }

    @Override
    public void pagar() {
        System.out.println("Pago en línea vía " + plataforma + " realizado. Total: $" + monto);
    }

    @Override
    public void mostrarDetallePago() {
        System.out.println("Pago en línea via " + plataforma + " - Monto: $" + monto);
    }
}