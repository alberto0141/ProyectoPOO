import java.util.Date;

public class Renta {
    private Cliente cliente;
    private Computadora computadora;
    private Date fecha;
    private double monto;
    private TipoPago tipoPago;

    public Renta(Cliente cliente, Computadora computadora, double monto, TipoPago tipoPago) {
        this.cliente = cliente;
        this.computadora = computadora;
        this.monto = monto;
        this.tipoPago = tipoPago;
        this.fecha = new Date();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void mostrarInfo() {
        System.out.println("Renta realizada por: " + cliente.getNombre());
        System.out.println("Computadora: " + computadora.getProcesador());
        System.out.println("Fecha: " + fecha);
        System.out.println("Monto: $" + monto);
        System.out.print("Método de pago: ");
        tipoPago.mostrarDetallePago();
    }
}


