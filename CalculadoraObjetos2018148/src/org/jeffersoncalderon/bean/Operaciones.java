package org.jeffersoncalderon.bean;

public class Operaciones {
    private double dato1, dato2;
    private char signo;

    public Operaciones() {
    }

    public Operaciones(double dato1, double dato2, char signo) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.signo = signo;
    }

    public double getDato1() {
        return dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    public char getSigno() {
        return signo;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }
    
    public double operacion(double dato1, double dato2, char signo){
        switch (signo) {
            case '+':
                dato1 = dato1 + dato2;
                break;
            case '-':
                dato1 = dato1 - dato2;
                break;
            case '*':
                dato1 = dato1 * dato2;
                break;
            case '/':
                dato1 = dato1 / dato2;
                break;
            default:
                break;
        }
        return dato1;
    }
}
