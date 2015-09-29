package edu.upc.eetac.dsa.exJava.java.lang;

/**
 * Created by Usuari on 29/09/2015.
 */
public class Tree {
    private int height;
    private String name;
    private String resultado;

    public Tree() {
        height =0;
        name = null;
    }

    public Tree(int height) {

        this.height=height;
    }

    public Tree(String name) {
        this.name = name;
        height=0;
    }

    public Tree(int height, String name) {
        this.height = height;
        this.name = name;
    }
    public String escriure(){
        if(height>0 && name==null)
            resultado="Un árbol de "+height+ " metros";
        else if(height==0 &&name!=null)
            resultado="Un "+name;
        else if(height==0 && name==null)
            resultado="Un árbol";
        else
            resultado= "Un "+name+ " de "+ height + " metros";
        return resultado;
    }
}
