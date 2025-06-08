public class Tarjeta extends TipoPago {
    private String numero;
    private String nombreTitular;
    private String fechaVencimiento;
    private String cvv;

    public Tarjeta(double monto, String numero, String nombreTitular, String fechaVencimiento, String cvv) {
        super(monto);
        this.numero = numero;
        this.nombreTitular = nombreTitular;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    @Override
    public void pagar() {
        System.out.println("Pago con tarjeta procesado: $" + monto);
    }

    @Override
    public void mostrarDetallePago() {
        System.out.println("Tarjeta - Monto: $" + monto +
                " | Últimos 4 dígitos: " + numero.substring(numero.length() - 4));
    }
}


