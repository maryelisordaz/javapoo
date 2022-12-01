/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Entidad;

/**
 *
 * @author Raul8
 */
public class Cuenta {

    private int numeroCuenta;
    private int Dni;
    private int saldoAc;
    private String hacer;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int Dni, int saldoAc) {
        this.numeroCuenta = numeroCuenta;
        this.Dni = Dni;
        this.saldoAc = saldoAc;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public int getSaldoAc() {
        return saldoAc;
    }

    public void setSaldoAc(int saldoAc) {
        this.saldoAc = saldoAc;
    }

    public String getHacer() {
        return hacer;
    }

    public void setHacer(String hacer) {
        this.hacer = hacer;
    }

}
