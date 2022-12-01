/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8javapoo;


import Entidad.Cadena;
import Servicios.CadenaServicio;

/**
 *
 * @author Raul8
 */
public class Ejercicio8javapoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        Cadena c = new Cadena();
        cs.ingresar();

        cs.mostrarVocales(c);
        cs.invertirFrase(c);
        cs.vecesRepetido(c);
        cs.compararLongitud(c);
        cs.unirFrases(c);
        cs.reemplazar(c);
        cs.contiene(c);

    }

}
