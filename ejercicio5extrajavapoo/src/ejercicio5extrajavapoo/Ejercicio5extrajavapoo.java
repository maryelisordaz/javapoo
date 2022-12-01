/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package ejercicio5extrajavapoo;

import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class Ejercicio5extrajavapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String var[] = new String[12];
        var[0] = "enero";
        var[1] = "febrero";
        var[2] = "marzo";
        var[3] = "abril";
        var[4] = "mayo";
        var[5] = "junio";
        var[6] = "julio";
        var[7] = "agosto";
        var[8] = "septiembre";
        var[9] = "octubre";
        var[10] = "noviembre";
        var[11] = "diciembre";
        String mesSecreto;
        int num = (int) (Math.random() * 11) + 1;
        mesSecreto = var[num];
        
        System.out.println("Adivina el mes secreto");
        String respuesta = leer.next(); 
        int cont=0;
        do{
        if (!respuesta.equalsIgnoreCase(mesSecreto)) {
            System.out.println("No ha acertado. Intente de nuevo");
            String pista= mesSecreto.substring(mesSecreto.length()-1,mesSecreto.length());
            
            System.out.println("Te daré una pista, termina con la letra: " + pista.toUpperCase());
            respuesta = leer.next();
            cont++;
        } else {
            System.out.println("Has acertado! Felicidades!");
            cont++;
        }
        }while(cont<2);
         if (cont==2 && !respuesta.equalsIgnoreCase(mesSecreto)){
                System.out.println("Has perdido el juego");
         }
    }

}
