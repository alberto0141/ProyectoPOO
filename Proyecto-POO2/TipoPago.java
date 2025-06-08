public abstract class TipoPago {
    protected double monto;

    public TipoPago(double monto) {
        this.monto = monto;
    }

    public abstract void pagar();


    public void mostrarDetallePago() {
        System.out.println("Monto pagado: $" + monto);
    }
}

