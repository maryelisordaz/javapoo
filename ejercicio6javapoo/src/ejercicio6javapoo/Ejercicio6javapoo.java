/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6javapoo;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author Raul8
 */
public class Ejercicio6javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera cafe = cs.CrearCafetera();
        cs.menu();
        
    }

}
