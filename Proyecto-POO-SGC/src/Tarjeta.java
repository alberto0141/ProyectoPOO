public class Tarjeta extends TipoPago {
    private String numero;
    private String nombreTitular;
    private String fechaVencimiento;
    private String cvv;

    public Tarjeta(int horas, String numero, String nombreTitular, String fechaVencimiento, String cvv) {
        super(horas);
        this.numero = numero;
        this.nombreTitular = nombreTitular;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    @Override
    public void pagar() {
        System.out.println("Pago con tarjeta procesado.");
        mostrarDetallePago();
    }

    @Override
    public void mostrarDetallePago() {
        System.out.println("\n--- DETALLE PAGO CON TARJETA ---");
        super.mostrarDetallePago();
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Últimos 4 dígitos: " + numero.substring(numero.length() - 4));
    }
}
