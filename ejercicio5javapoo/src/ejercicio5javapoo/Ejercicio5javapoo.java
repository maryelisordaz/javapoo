/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5javapoo;

import Entidad.Cuenta;
import Servicio.CuentaServicio;

/**
 *
 * @author Raul8
 */
public class Ejercicio5javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaServicio cs= new CuentaServicio();
        Cuenta c= cs.crear();
        
        cs.ingresar(c);
        cs.retirar(c);
        cs.extraccionRapida(c);
        cs.consultarSaldo(c);
        cs.consultarDatos(c);
    }
    
}
