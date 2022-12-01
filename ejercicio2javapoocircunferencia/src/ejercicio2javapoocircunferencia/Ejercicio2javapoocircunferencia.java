/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2javapoocircunferencia;

import Entidad.Circunferencia;
import Entidad.CircunferenciaServicio;

/**
 *
 * @author Raul8
 */
public class Ejercicio2javapoocircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia r = cs.LLenar();
                
        cs.area(r);
        cs.perimetro(r);
      

    }

}
