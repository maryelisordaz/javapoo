/*
 • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    Cafetera c = new Cafetera();

    public Cafetera CrearCafetera() {

        return c;
    }

    public void menu() {

        int eleccion;
        do {
            System.out.println("Bienvenido a Nespresso. " + "Indicanos que accion quieres realizar");
            System.out.println("1. llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Salir");
            eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    llenarCafetera();
                    break;
                case 2:
                    servirTaza();
                    break;
                case 3:
                    vaciarCafetera();
                    break;
                case 4:
                    agregarCafe();
                    break;
                case 5:
                    System.out.println("Chaooo...");
                    break;
                default:
                    System.out.println("Ingrese un numero válido");
                    break;
            } 
        } while (eleccion != 5);
        System.out.println("");
    }

    public void llenarCafetera() {
        if (c.getCantidadActual() != c.getCapacidadMaxima()) {
            c.setCantidadActual(500);
            System.out.println("La cafetera se ha llenado con éxito");
        } else {
            System.out.println("La cafetera ya esta llena");
        }
        System.out.println("");
    }

    public int servirTaza() {
        System.out.println("Ingrese el tamaño de la taza");
        int ttz = leer.nextInt();
        if (c.getCantidadActual() < ttz) {
            System.out.println("La taza no se llenó completa, se llenaron " + c.getCantidadActual() + "ml");
        } else {
            System.out.println("La taza se llenó completamente");
        }
        int resta = c.getCantidadActual() - ttz;
        c.setCantidadActual(resta);
        if (c.getCantidadActual() < 1) {
            c.setCantidadActual(0);
        }
        System.out.println("");
        return resta;

    }

    public void vaciarCafetera() {
        c.setCantidadActual(0);
        System.out.println("La cafetera esta vacia");
        System.out.println("");
    }

    public int agregarCafe() {
        System.out.println("Cuánta cantidad de café quiere agregar?");
        int agregar = leer.nextInt();
        c.setCantidadActual(agregar);
        System.out.println("");
        return c.getCantidadActual();

    }

}
