/*
 Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. 
 */
package Entidad;

/**
 *
 * @author Raul8
 */
public class Raices {

    public int a = 2;
    public int b = 4;
    public int c = 2;

    public Raices() {
    }

    /*Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c*/
    public double Discriminante() {
        double discriminante = (Math.pow(b, 2)) - 4 * a * c;
        System.out.println("El discriminante es: "+discriminante);
        return discriminante;

    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneRaices() {
        boolean tienes = false;
        if ((Math.pow(b, 2)) - 4 * a * c > 0) {
            tienes = true;
        }

        return tienes;

    }

    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.*/
    public boolean tieneRaiz() {
        boolean tiene = false;
        if ((Math.pow(b, 2)) - 4 * a * c == 0) {
            tiene = true;
        }
        return tiene;
    }

    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.*/
    public double obtenerRaices() {
        double dis = (Math.pow(b, 2)) - 4 * a * c;
        double formula1 = (-b + (Math.sqrt(dis))) / (2 * a);
        double formula2 = (-b - (Math.sqrt(dis))) / (2 * a);
        if (tieneRaices() == true) {
            System.out.println("Estas son las dos posibles soluciones:");
            System.out.println(formula1 + " o " + formula2);
        } else if (dis < 0) {
            System.out.println("no existe solucion");
        }
        return formula2;

    }

    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.*/
    public double obtenerRaiz() {
        double dis = (Math.pow(b, 2)) - 4 * a * c;
        double formula1 = (-b + (Math.sqrt(dis))) / (2 * a);
        if (tieneRaiz() == true) {
            System.out.println("Estas es la unica soluciones de la ecuacion:");
            System.out.println(formula1);
        } else if (dis < 0) {
            System.out.println("no existe solucion");
        }
        return formula1;
    }

    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
     */
    public void calcular() {
        System.out.println("la ecuacion tiene una sola solución: " + tieneRaiz());
        double dis = (Math.pow(b, 2)) - 4 * a * c;
        if (dis>0){
    
            System.out.println("La ecuación tiene dos soluciones: " +tieneRaices());
            if (dis==0){
                System.out.println("La raiz es: " + obtenerRaiz());
            }
            System.out.println("Las raices son: " +obtenerRaiz() + " y "+ obtenerRaices());
        }
    }
}
