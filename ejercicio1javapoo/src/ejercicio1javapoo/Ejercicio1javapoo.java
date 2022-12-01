/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1javapoo;

import Entidad.Libro;

/**
 *
 * @author Raul8
 */
public class Ejercicio1javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libro li = new Libro();
        Libro l=li.llenarDatos();
        li.mostrar(l);

    }

}
