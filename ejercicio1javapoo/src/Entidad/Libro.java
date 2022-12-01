/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, 
y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. 

Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class Libro {

    public int ISBN;
    public String titulo;
    public String Autor;
    public int npag;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String Autor, int npag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.Autor = Autor;
        this.npag = npag;
    }

    public Libro llenarDatos() {
        Libro l = new Libro();
        System.out.println("ingrese el ISBN del libro");
        l.ISBN=leer.nextInt();
        System.out.println("ingrese el titulo del libro");
        l.titulo=leer.next();
        System.out.println("ingrese el autor del libro");
        l.Autor=leer.next();
        System.out.println("ingrese el numero de paginas que contiene el libro");
        l.npag=leer.nextInt();

        return l;
        
    }

   
    public void mostrar(Libro l) {
        System.out.println("Libro; ISBN=" + l.ISBN + ", titulo=" + l.titulo+ ", Autor=" + l.Autor+ ", npag=" + l.npag);
    }

   

}
