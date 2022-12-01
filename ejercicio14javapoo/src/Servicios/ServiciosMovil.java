/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class ServiciosMovil {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    Movil m = new Movil();
    /*Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.*/
    public Movil cargarCelular(){
        System.out.println("ingrese la marca del movil");
        m.setMarca(leer.next());
        System.out.println("Ingrese el modelo");
        m.setModelo(leer.next());
        System.out.println("Ingrese la memoria Ram");
        m.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese el Almacenamiento");
        m.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese el precio");
        m.setPrecio(leer.nextDouble());
        return m;
    }
    /*Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/
    public void ingresarCodigo(){
          System.out.println("Ingrese el codigo del telefono");
          int cod[]= new int[7];
        for (int i=0; i<7;i++){
          cod[i]=leer.nextInt();
          m.setCodigo(cod);
        }
                
    }

}
