import java.util.Date;

public class Factura {
    private Renta renta;
    private TipoPago pago;

    public Factura(Renta renta, TipoPago pago) {
        this.renta = renta;
        this.pago = pago;
    }

    public void imprimirFactura() {
        System.out.println("\n--- FACTURA ---");
        System.out.println("Fecha: " + new Date());
        System.out.println("Cliente: " + renta.getCliente().getNombre());
        System.out.println("Computadora: " + renta.getComputadora().getProcesador());
        System.out.println("Monto total: $" + renta.getMonto());
        System.out.print("Método de pago: ");
        pago.mostrarDetallePago();
        System.out.println("Gracias por su pago.");
    }
}
