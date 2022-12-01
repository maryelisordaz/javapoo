/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class OperacionServicio {
    Scanner leer = new Scanner(System.in);
    public Operacion crearOperacion(){
        Operacion o= new Operacion();
        System.out.println("Ingrese un numero");
        o.setN1(leer.nextInt());
        System.out.println("Ingrese otro numero");
        o.setN2(leer.nextInt());
        
        return o;
    }
    
    public void sumar(Operacion o){
        double sumar;
        sumar=(o.getN1()+o.getN2());
        System.out.println("La suma de los numeros es: " + sumar);
    }
    public void restar(Operacion o){
        double restar;
        restar=(o.getN1()-o.getN2());
        System.out.println("La resta de los numeros es: " +restar);
    }
    public void multiplicar(Operacion o){
        double multiplicar;
        
        if (o.getN1()==0 || o.getN2()==0 ){
            System.out.println("EL resultado 0. Error");
        } else {
        multiplicar=(o.getN1()*o.getN2());
        System.out.println("El producto de los numeros es: " + multiplicar);
        }
    }
    public void dividir(Operacion o){
        double dividir;
        
        if (o.getN1()==0 || o.getN2()==0 ){
            System.out.println("EL resultado 0. Error");
        } else {
        dividir=(o.getN1()/o.getN2());
        System.out.println("El cociente de los numeros es: " + dividir);
        }
    }
    
}
