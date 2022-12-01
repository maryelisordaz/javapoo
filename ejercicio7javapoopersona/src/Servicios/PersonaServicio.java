/*
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p = new Persona();

    public Persona crearPersona() {

        String opcion;
        System.out.println("Ingrese el nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo: ´H´ para hombre, ´M´ para mujer, ´O´ para otro");
        do {
            opcion = leer.next();
        } while (!"h".equalsIgnoreCase(opcion) && !"m".equalsIgnoreCase(opcion) && !"o".equalsIgnoreCase(opcion));
        p.setSexo(opcion);
        System.out.println("Ingrese su peso (kg)");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura (mts)");
        p.setAltura(leer.nextDouble());
        return p;
    }

    public int CalcularIMC(Persona p) {
        int formula = (int) (double) (p.getPeso() / (Math.pow(p.getAltura(), 2)));
        int imc;

        if (formula < 20) {
            imc = -1;

        } else if (formula >= 20 && formula <= 25) {
            imc = 0;

        } else {
            imc = 1;

        }
        return imc;
    }

    public boolean esMayorDeEdad(Persona p) {
        boolean bandera = false;
        if (p.getEdad() >= 18) {
            bandera = true;
        }
        return bandera;
    }
}
