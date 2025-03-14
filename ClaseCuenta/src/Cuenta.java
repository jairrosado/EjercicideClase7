public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public double consultarSaldo() {
        return saldo;
    }

    // Método para recibir abonos
    public void abonar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    // Método para pagar recibos
    public void pagarRecibo(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        }
    }

    // Main para probar la clase
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("12345678", 500.0);
        System.out.println("Saldo inicial: " + cuenta.consultarSaldo());

        cuenta.abonar(200.0);
        System.out.println("Saldo después del abono: " + cuenta.consultarSaldo());

        cuenta.pagarRecibo(100.0);
        System.out.println("Saldo después del pago de recibo: " + cuenta.consultarSaldo());
    }
}
