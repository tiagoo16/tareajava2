package clases;

// Clase CajeroAutomatico
public class CajeroAutomatico {
    public void retirar(Persona persona, double monto) {
        if (persona.retirar(monto)) {
            System.out.println("Retiro de $" + monto + " exitoso.");
        } else {
            System.out.println("No se pudo realizar el retiro.");
        }
    }
}
