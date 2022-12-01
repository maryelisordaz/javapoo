/*
 c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class CuentaServicio {

    Scanner leer = new Scanner(System.in);
 

    public Cuenta crear() {
        Cuenta c = new Cuenta();
        System.out.println("Ingrese su DNI");
        c.setDni(leer.nextInt());
        System.out.println("Ingrese su numero de cuenta");
        c.setNumeroCuenta(leer.nextInt());
        c.setSaldoAc((int) (Math.random() * 100) + 1);
        System.out.println("Que dese hacer?");
        System.out.println("a)ingresar dinero");
        System.out.println("b)retirar dinero");
        System.out.println("c)Extraccion rapida, 20% del saldo total");
        System.out.println("d)Consultar saldo");
        System.out.println("e)Consultar datos");
        c.setHacer(leer.next());
        return c;

    }

    public void ingresar(Cuenta c) {
        if (c.getHacer().equalsIgnoreCase("a")) {
            System.out.println("Ingrese la cantidad de dinero que desea ingresar");
            double ingreso = leer.nextInt();
            double suma = ingreso + c.getSaldoAc();
            System.out.println("Su cuenta queda en $"+ suma);
            
        }
    }

    public void retirar(Cuenta c) {
        if (c.getHacer().equalsIgnoreCase("b")) {
            System.out.println("Ingrese la cantidad de dinero que desea retirar");
            double retiro = leer.nextInt();
           
            if (retiro > c.getSaldoAc()) {
                System.out.println("El retiro de su cuenta fue el total de ella: " + c.getSaldoAc() + ". Su cuenta a quedado en $0");
            } else{
                 double total=retiro-c.getSaldoAc();
            System.out.println("Su saldo inicial era de: " + c.getSaldoAc()+"Su quedó en: " + total );
            }
        }
    }

    public void extraccionRapida(Cuenta c) {
        if (c.getHacer().equalsIgnoreCase("c")) {
            System.out.println("Usted eligio retiro rápido, seria el 20% del total de su cuenta");
            System.out.println(c.getSaldoAc());
            double rr = c.getSaldoAc() * 0.20;
            System.out.println("Ha retirado " + rr);
        }

    }

    public void consultarSaldo(Cuenta c) {
        if (c.getHacer().equalsIgnoreCase("d")) {
            System.out.println("El saldo actual de su cuenta es: " + c.getSaldoAc());
        }
    }

    public void consultarDatos(Cuenta c) {
        if (c.getHacer().equalsIgnoreCase("e")) {
            System.out.println("Los datos de su cuenta son:");
            System.out.println("DNI: " + c.getDni() + ". Numero de cuenta: " + c.getNumeroCuenta());
        }
    }
}
