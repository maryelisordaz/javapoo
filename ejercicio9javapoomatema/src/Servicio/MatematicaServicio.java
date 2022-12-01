/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import java.text.DecimalFormat;

/**
 *
 * @author Raul8
 */
public class MatematicaServicio {
    DecimalFormat limitdecimal= new DecimalFormat("#.##");
    public void devolverMayor(Matematica m) {
        System.out.println("Compararemos: " + limitdecimal.format(m.getNum()) + " con: " +m.getNum1());
        m.setNumM((float)Math.max(m.getNum(), m.getNum1()));
        m.setNumm((float)Math.min(m.getNum(),m.getNum1()));
        System.out.println("El valor " + m.getNumM() + " es el numero mayor");

    }

    public void calcularPotencia(Matematica m) {
        double numr = Math.round(m.getNumM());
        double pote = Math.pow(numr, 2);
        System.out.println("La potencia del numero mayor " +limitdecimal.format(numr)+  " es: " + limitdecimal.format(pote));
    }

    public void calculaRaiz(Matematica m) {
        double numra = Math.abs(m.getNumm());
        double raiz = Math.sqrt(numra);
        System.out.println("La raiz cuadrada del numero menor "+ limitdecimal.format(numra)+ " es: "+ limitdecimal.format(raiz));
    }
}
