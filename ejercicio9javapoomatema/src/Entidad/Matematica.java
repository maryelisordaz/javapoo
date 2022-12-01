/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Raul8
 */
public class Matematica {
    private float num;
    private float num1;
    private float numM;
    private float numm;

    public Matematica() {
    }

    public Matematica(float num, float num1, float numM, float numm) {
        this.num = num;
        this.num1 = num1;
        this.numM = numM;
        this.numm = numm;
    }

    

    public double getNumm() {
        return numm;
    }

    public void setNumm(float numm) {
        this.numm = numm;
    }


    public double getNumM() {
        return numM;
    }

    public void setNumM(float numM) {
        this.numM = numM;
    }   

    public double getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    
    
}
