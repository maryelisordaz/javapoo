/*
 c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package Entidad;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class CircunferenciaServicio {

    Scanner leer = new Scanner(System.in);
    DecimalFormat decimales = new DecimalFormat("#,###.##");

    public Circunferencia LLenar() {
        Circunferencia r = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia");
        r.setRadio(leer.nextDouble());
        return r;

    }

    public void area(Circunferencia r) {
        double area;
        area = Math.PI * Math.pow(r.getRadio(), 2);
        System.out.println("El area de la circunferencia es: " + (decimales.format(area)));

    }

    public void perimetro(Circunferencia r) {
        double perimetro;
        perimetro = 2 * Math.PI * r.getRadio();

        System.out.println("El perimetro de la circunferencia es: " + (decimales.format(perimetro)));

    }

}
