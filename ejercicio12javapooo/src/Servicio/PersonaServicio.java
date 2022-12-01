/*
Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("Ingresa tu nombre");
        p.setNombre(leer.next());
        System.out.println("Ingresa tu fecha de nacimiento");
        System.out.println("ingrese el día");
        int dia = leer.nextInt();
        System.out.println("ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("ingrese el año");
        int anio = leer.nextInt();
        Date fechas = new Date(anio - 1900, mes - 1, dia);
        p.setFecha(fechas);

        return p;
    }

    /*
    Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
     */
    public int calcularEdad(Persona p) {
        Date hoy = new Date();
        int edad = hoy.getYear() - p.getFecha().getYear();
       return edad;
    }

    /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.*/
    public void menorQue(int edadotra, Persona p) {
        boolean logico = true;
        Date hoy = new Date();
        int edad = hoy.getYear() - p.getFecha().getYear();
        if (edadotra < edad) {
            logico = false;
            System.out.println(logico);

        }
        System.out.println(logico);
    }

    /*Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
    public void mostrarPersona(Persona p) {
        System.out.println("Tu nombre es: "+p.getNombre());
        System.out.println("Tu fecha de nacimiento"+p.getFecha());
        System.out.println("Tu edad: "+ calcularEdad(p));

    }
}
