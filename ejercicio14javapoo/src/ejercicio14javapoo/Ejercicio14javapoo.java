/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14javapoo;

import Servicios.ServiciosMovil;

/**
 *
 * @author Raul8
 */
public class Ejercicio14javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosMovil sm= new ServiciosMovil();
        sm.cargarCelular();
        sm.ingresarCodigo();
    }
    
}
