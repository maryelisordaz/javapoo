/* Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class PuntosServicio {
    Scanner leer= new Scanner(System.in);
    public Puntos crearPuntos(){
        Puntos p=new Puntos();
        System.out.println("Ingrese dos numeros para las coordenadas de X e Y (1)");
        p.setX1(leer.nextInt());
        p.setY1(leer.nextInt());
        System.out.println("Ingrese dos numeros para las coordenadas de X e Y (2)");
        p.setX2(leer.nextInt());
        p.setY2(leer.nextInt());
        return p;
  }
    public void distancia(Puntos p){
        double distancia;
        distancia=Math.sqrt(Math.pow(p.getX2()-p.getX1(), 2)+(Math.pow(p.getY2()-p.getY1(), 2)));
        System.out.println("la distancia entre las cordenadas es: "+distancia);
        
    }
}
