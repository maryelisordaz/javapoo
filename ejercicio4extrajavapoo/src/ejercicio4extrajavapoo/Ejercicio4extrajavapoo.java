/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extrajavapoo;

import Servicios.ServiciosNif;

/**
 *
 * @author Raul8
 */
public class Ejercicio4extrajavapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ServiciosNif sn= new ServiciosNif();
            sn.crearNif();
            sn.mostrar();
    }
    
}
