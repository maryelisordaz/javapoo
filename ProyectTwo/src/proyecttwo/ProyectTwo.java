
package proyecttwo;


public class ProyectTwo {

    public static void main(String[] args) {
        double price= 15.99d;
        System.out.println("precio inicial "+price+", precio con IVA incluido "+total(price));
    }
    static double total(double price){
        double iva=price*0.19;
        return price+iva;
    } 
}
