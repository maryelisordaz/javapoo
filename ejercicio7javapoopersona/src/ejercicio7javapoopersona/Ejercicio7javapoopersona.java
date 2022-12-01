/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package ejercicio7javapoopersona;

import Entidad.Persona;
import Servicios.PersonaServicio;

public class Ejercicio7javapoopersona {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        int[] imc = new int[4];
        Persona p1 = ps.crearPersona();
        imc[0] = ps.CalcularIMC(p1);
        ps.esMayorDeEdad(p1);
        Persona p2 = ps.crearPersona();
        imc[1] = ps.CalcularIMC(p2);
        ps.esMayorDeEdad(p2);
        Persona p3 = ps.crearPersona();
        imc[2] = ps.CalcularIMC(p3);
        ps.esMayorDeEdad(p3);
        Persona p4 = ps.crearPersona();
        imc[3] = ps.CalcularIMC(p4);
        ps.esMayorDeEdad(p4);
        int cont1 = 0, cont2 = 0, cont3 = 0;
        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case -1:
                    System.out.println("Delgado");
                    cont1++;
                    break;
                case 0:
                    System.out.println("Peso normal");
                    cont2++;
                    break;
                case 1:
                    System.out.println("Sobrepeso");
                    cont3++;
                    break;

            }

        }
        int conte1=0, conte2=0;
        if (ps.esMayorDeEdad(p1) == true || ps.esMayorDeEdad(p2) == true || ps.esMayorDeEdad(p3) == true || ps.esMayorDeEdad(p4) == true) {
            
            conte1++;

        } else {
            
            conte2++;
        }
        int porcentaje1, porcentaje2, porcentaje3;
        int porcentaje4, porcentaje5;
     
        porcentaje1=(100/4)*cont1;
        porcentaje2=(100/4)*cont2;
        porcentaje3=(100/4)*cont3;
        porcentaje4=(100/4)*conte1;
        porcentaje5=(100/4)*conte2;
        System.out.println("Porcentaje de personas delgadas: " + porcentaje1);
        System.out.println("Porcentaje de personas con peso ideal: " + porcentaje2);
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentaje3);
        System.out.println("Porcentaje de personas mayores de edad: " + porcentaje4);
        System.out.println("Porcentaje de personas menores de edad: " + porcentaje5);
     
    }

}
