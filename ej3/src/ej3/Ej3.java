/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Entidad.Operacion;
import Servicios.OperacionServicio;

/**
 *
 * @author Raul8
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionServicio os=new OperacionServicio();
        Operacion o=os.crearOperacion();
        os.sumar(o);
        os.restar(o);
        os.multiplicar(o);
        os.dividir(o);
    }
}
    
