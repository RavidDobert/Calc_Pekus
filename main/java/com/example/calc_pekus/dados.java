package com.example.calc_pekus;

public class dados {

    private double n1, n2,dResultado;
    private String soma,Subtrai, multiplica, divide;

    public dados(double n1, double n2, double dResultado, String soma, String subtrai, String multiplica, String divide) {
        this.n1 = n1;
        this.n2 = n2;
        this.dResultado = dResultado;
        this.soma = soma;
        Subtrai = subtrai;
        this.multiplica = multiplica;
        this.divide = divide;
    }
    public dados(String toString, String toString1, String toString2, String toString3, double parseDouble, double parseDouble1) {
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getdResultado() {
        return dResultado;
    }

    public void setdResultado(double dResultado) {
        this.dResultado = dResultado;
    }

    public String getSoma() {
        return soma;
    }

    public void setSoma(String soma) {
        this.soma = soma;
    }

    public String getSubtrai() {
        return Subtrai;
    }

    public void setSubtrai(String subtrai) {
        Subtrai = subtrai;
    }

    public String getMultiplica() {
        return multiplica;
    }

    public void setMultiplica(String multiplica) {
        this.multiplica = multiplica;
    }

    public String getDivide() {
        return divide;
    }

    public void setDivide(String divide) {
        this.divide = divide;
    }
}
