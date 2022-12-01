/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena ingresar() {
        Cadena c = new Cadena();
        System.out.println("Ingrese una frase");
        c.setFrase(leer.next());
        c.setLongitud(c.getFrase().length());
        return c;
    }

    public void mostrarVocales(Cadena c) {
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            String sub = c.getFrase().substring(i, i + 1);
            if ("a".equalsIgnoreCase(sub) || "e".equalsIgnoreCase(sub) || "i".equalsIgnoreCase(sub) || "o".equalsIgnoreCase(sub)
                    || "u".equalsIgnoreCase(sub)) {
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + "vocales");
    }

    public void invertirFrase(Cadena c) {
        System.out.println("La cadena invertida: ");

        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            System.out.print(c.getFrase().substring(i, i + 1));
        }
        System.out.println("");
    }

    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(Cadena c) {
        System.out.println("Ingrese que letra desea buscar en la frase");
        String letra;
        letra = leer.next();
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            String sub = c.getFrase().substring(i, i + 1);

            if (letra.equalsIgnoreCase(sub)) {
                cont++;
            }

        }
        System.out.println("Frase=" + c.getFrase() + " El caracter " + letra + " se repite " + cont + " veces");

    }

    public void compararLongitud(Cadena c) {
        System.out.println("Ingrese una nueva frase");
        String frase;
        frase = leer.next();
        if (frase.length() == c.getLongitud()) {
            System.out.println("Las frase tienen igual longitud");
        } else if (frase.length() > c.getLongitud()) {
            System.out.println("La frase " + frase + " Es mayor en longitud");
        } else if (c.getLongitud() > frase.length()) {
            System.out.println("La frase " + c.getFrase() + " Es mayor en longitud");
        }

    }

    public void unirFrases(Cadena c) {
        System.out.println("Completa la primera frase: ");
        System.out.println(c.getFrase() + "...");
        String frase = leer.next();

        System.out.println("Tu frase resultante es: ");
        System.out.print(c.getFrase() + " " + frase);
    }

    public void reemplazar(Cadena c) {
        System.out.println("Ingrese un caracter para reemplazar por la letras `a´ que contenga la frase");
        String carac = leer.next();
        for (int i = 0; i < c.getLongitud(); i++) {
            String sub = c.getFrase().substring(i, i + 1);

            if (sub.equalsIgnoreCase("a")) {
                System.out.print(carac);
            } else if (!sub.equalsIgnoreCase("a")) {
                System.out.print(sub);
            }

        }
        System.out.println("");
    }

    public void contiene(Cadena c) {
        System.out.println("Ingrese una letra para buscar en la frase");
        String buscar = leer.next();
        boolean bandera = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            String sub = c.getFrase().substring(i, i + 1);

            if (sub.equalsIgnoreCase(buscar)) {
                bandera = true;

            }
        }
        System.out.println(bandera);

    }
}
