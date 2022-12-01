/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12javapooo;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Raul8
 */
public class Ejercicio12javapooo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edadotra= 25;
        PersonaServicio ps=new PersonaServicio();
        Persona p= ps.crearPersona();
        ps.calcularEdad(p);
        ps.menorQue(edadotra, p);
        ps.mostrarPersona(p);
    }
    
}
