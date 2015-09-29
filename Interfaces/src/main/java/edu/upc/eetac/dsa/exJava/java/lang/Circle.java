package edu.upc.eetac.dsa.exJava.java.lang;

/**
 * Created by Usuari on 29/09/2015.
 */
public class Circle implements Shape {
    private double area;
    private double radi;
    private String resposta;
    public Circle(double radi){
        this.radi=radi;
    }
    public double area(){
        this.area= radi*Math.PI*radi;
        return area;
    }
    public String escriu(){
        resposta= "I'm a circle";
        return  resposta;
    }
}