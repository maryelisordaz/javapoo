/*
 Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */
package ejercicio1extrapoo;

import Entidad.Cancion;

/**
 *
 * @author Raul8
 */
public class Ejercicio1extrapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c = new Cancion("hoy no", "Mariano");
        
        System.out.println("Autor: "+c.getAutor());
        System.out.println("Titulo de la cacion: "+c.getTitulo());
    }

}
