/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class RectanguloServicio {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearR() {
        Rectangulo r = new Rectangulo();
        System.out.println(" Ingrese la base del rectangulo");
        r.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        r.setAltura(leer.nextInt());

        return r;
    }

    public void Calculo(Rectangulo r) {
        int superficie;
        superficie = r.getBase() * r.getAltura();
        System.out.println("La superficie del rectagulo es " + superficie);

    }

    public void Calculop(Rectangulo r) {

        int perimetro;
        perimetro = (r.getBase() + r.getAltura()) * 2;
        System.out.println("El perimetro del rectangulo es " + perimetro);
    }

    public void imprime(Rectangulo r) {
        int i, j;

        for (i = 0; i < r.getBase(); i++) {

            System.out.print("*");
        }
        System.out.println("");
        for (i = 0; i < r.getAltura() - 2; i++) {
            System.out.print("*");
            for (j = 0; j < r.getBase() - 2; j++) {

                System.out.print(" ");

            }
            System.out.println("*");

        }

        for (i = 0; i < r.getBase(); i++) {
            System.out.print("*");
        }

    }
}
