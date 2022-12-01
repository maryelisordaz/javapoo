/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Nif;
import java.util.Scanner;

/**
 *
 * @author Raul8
 */
public class ServiciosNif {

    Scanner leer = new Scanner(System.in);
    Nif n = new Nif();

    /*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
    La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente.*/
    public Nif crearNif() {
        System.out.println("Ingrese su DNI");
        n.setDni(leer.nextInt());
        int dv;
        dv = n.getDni() / 23;
        do {
            int otro = dv;
            dv = otro / 23;

        } while (dv > 22);
        char vector[] = new char[23];
        vector[0] = 'T';
        vector[1] = 'R';
        vector[2] = 'W';
        vector[3] = 'A';
        vector[4] = 'G';
        vector[5] = 'M';
        vector[6] = 'Y';
        vector[7] = 'F';
        vector[8] = 'P';
        vector[9] = 'D';
        vector[10] = 'X';
        vector[11] = 'B';
        vector[12] = 'N';
        vector[13] = 'J';
        vector[14] = 'Z';
        vector[15] = 'S';
        vector[16] = 'Q';
        vector[17] = 'V';
        vector[18] = 'H';
        vector[19] = 'L';
        vector[20] = 'C';
        vector[21] = 'K';
        vector[22] = 'E';

        for (int i = 0; i < 23; i++) {
            if (i == dv) {
                n.setLetra(vector[i]);
            }

        }
        return n;
    }

    /* Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).*/
    public void mostrar() {
        System.out.println("DNI: " + n.getDni() + "-" + n.getLetra());
    }
}
