package clases;
// Clase Persona
public class Persona {
    private String nombre;
    private int edad;
    private Cuenta cuenta;

    public Persona(String nombre, int edad, double saldoInicial) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = new Cuenta(saldoInicial);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double consultarSaldo() {
        return cuenta.getSaldo();
    }

    public void depositar(double monto) {
        cuenta.depositar(monto);
    }

    public boolean retirar(double monto) {
        return cuenta.retirar(monto);
    }

    public void realizarRetiroEnCajero(CajeroAutomatico cajero, double monto) {
        cajero.retirar(this, monto);
    }
}