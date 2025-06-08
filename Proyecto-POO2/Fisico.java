public class Fisico extends TipoPago {


    public Fisico(double monto) {

        super(monto);
    }

    @Override
    public void pagar() {
        System.out.println("Pago físico realizado por $" + monto);
    }

    @Override
    public void mostrarDetallePago() {
        System.out.println("Efectivo - Monto: $" + monto);
    }
}
