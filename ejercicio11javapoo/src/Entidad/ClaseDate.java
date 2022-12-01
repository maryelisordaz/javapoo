/*
 vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Entidad;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Raul8
 */
public class ClaseDate {

   /* private Date fecha;

    public ClaseDate() {
    }

    public ClaseDate(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }*/

    public void fecha() {
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el día");
        int dia = leer.nextInt();
        System.out.println("ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("ingrese el año");
        int anio = leer.nextInt();

        Date fechas = new Date(anio-1900, mes-1, dia);
   
        Date hoy = new Date();
        //int diferencia = hoy.getYear() - fechas.getYear();
   

        System.out.println("hay " + (hoy.getYear()- fechas.getYear()) + " años de diferencia entre la fecha inicial y la fecha actual");
     
    }

}
