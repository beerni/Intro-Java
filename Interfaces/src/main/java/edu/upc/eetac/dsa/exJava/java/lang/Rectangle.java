package edu.upc.eetac.dsa.exJava.java.lang;

/**
 * Created by Usuari on 29/09/2015.
 */
public class Rectangle implements Shape {
    private double area;
    private double altura, base;
    private String resposta;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        area = base * altura;
        return area;

    }

    public String escriu() {
        resposta = "I'm a rectangle ";
        return resposta;
    }
}