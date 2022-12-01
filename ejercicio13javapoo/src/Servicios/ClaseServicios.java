/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Clase;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class ClaseServicios {
    /*método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.*/
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
            
    Clase c=new Clase();
    String nombre[]=new String[5];
    public Clase cargarAlumnos(){
        for (int i=0; i<5;i++){
            System.out.println("Ingrese el nombre del alumno");
            nombre[i]=leer.next();
            c.setAlumnos(nombre);
          
        }
    return c;
}
    /* Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos*/
    public void  crearCurso(){
        String opcion;
        
        do {
            System.out.println("Ingrese el nombre del curso");
        
        c.setNombreCurso(leer.next());
        cargarAlumnos();
        System.out.println("Ingrese la cantidad de dias por semana");
        c.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese la cantidad de horas por día");
        c.setCantidadHorasPorDia(leer.nextInt());
        do {
            System.out.println("Ingrese el turno Mañana (M) o Tarde (T)");
              c.setTurno(leer.next());
        } while (!"M".equalsIgnoreCase(c.getTurno()) && !"T".equalsIgnoreCase(c.getTurno()));
        System.out.println("Ingrese el precio por hora");
        c.setPrecioPorHora(leer.nextDouble());
        calcularGananciaSemanal();
            do{
                System.out.println("Indique (salir) cuando no haya mas cursos que agregar, si desea continuar escriba (c)");
                opcion=leer.next();
            }while(!opcion.equalsIgnoreCase("salir") && (!opcion.equalsIgnoreCase("c")));
        } while (!opcion.equalsIgnoreCase("salir"));
    }
    /*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.*/
    public void calcularGananciaSemanal(){
        
        double calculo=(c.getCantidadHorasPorDia()*c.getPrecioPorHora()*c.getCantidadDiasPorSemana());
        System.out.println("Tu ganancia es del curso " +c.getNombreCurso()+" es:"+calculo);
    }
}
