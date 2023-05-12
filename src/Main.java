import clases.CajeroAutomatico;
import clases.Cuenta;
import clases.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        double saldoInicial = scanner.nextDouble();

        Persona persona = new Persona(nombre, edad, saldoInicial);
        CajeroAutomatico cajero = new CajeroAutomatico();

        System.out.println("Bienvenido " + persona.getNombre() + ", su saldo actual es de $" + persona.consultarSaldo());

        System.out.print("Ingrese el monto que desea retirar: ");
        double montoRetiro = scanner.nextDouble();
        persona.realizarRetiroEnCajero(cajero, montoRetiro);
        System.out.println("Su saldo actual es de $" + persona.consultarSaldo());

        System.out.print("Ingrese el monto que desea depositar: ");
        double montoDeposito = scanner.nextDouble();
        persona.depositar(montoDeposito);
        System.out.println("Su saldo actual es de $" + persona.consultarSaldo());
    }
}