/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9javapoomatema;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author Raul8
 */
public class Ejercicio9javapoomatema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio();
        Matematica m = new Matematica();

        m.setNum((float)Math.random()*10+1);
        m.setNum1((float)Math.random()*10+1);
        ms.devolverMayor(m);
        ms.calcularPotencia(m);
        ms.calculaRaiz(m);
    }
}
