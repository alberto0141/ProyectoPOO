public abstract class TipoPago {
    protected double monto;
    protected int horas;
    protected static final double precioHora = 10.0;

    public TipoPago(int horas) {
        this.horas = horas;
        this.monto = calcularMonto(horas);
    }

    private double calcularMonto(int horas) {
        return horas * precioHora;
    }

    public abstract void pagar();

    public void mostrarDetallePago() {
        System.out.println("Horas rentadas: " + horas);
        System.out.println("Precio por hora: $" + precioHora);
        System.out.println("Monto total: $" + monto);
    }


    public double getMonto() {
        return monto;
    }
}