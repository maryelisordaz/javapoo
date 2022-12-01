/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import static java.util.Collections.reverseOrder;

/**
 *
 * @author Raul8
 */
public class ArrayServicio {

    

    public Array crear() {
        Array a = new Array();
        double[] arreglo = new double[50];
        BigDecimal big1;
        double num=0;
        for (int i = 0; i < 50; i++) {
            big1= new BigDecimal(Math.random() * 1000);
           num=big1.setScale(2,RoundingMode.DOWN).doubleValue();
            arreglo[i] = num;
        }
        a.setVectorA(arreglo);
        System.out.println("El vector A es:");
        System.out.println(Arrays.toString(a.getVectorA()));
        System.out.println("");
        System.out.println("Los numeros del vector A ordenados de menor a mayor");
        Arrays.sort(a.getVectorA());

        System.out.println(Arrays.toString(a.getVectorA()));

        double[] arreglob = new double[20];
        for (int i = 0; i < 20; i++) {
            arreglob[i] = arreglo[i];

            if (i >= 10) {
                arreglob[i] = 0.5;
            }
        }
        a.setVectorB(arreglob);
        System.out.println("Los numeros del arreglo B son: ");
        System.out.println(Arrays.toString(a.getVectorB()));
        return a;
    }


}
