package edu.upc.eetac.dsa.exJava.java.lang;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Tree [] arboles = new Tree[4];
        arboles[0]= new Tree(4);
        arboles[1]= new Tree("Roble");
        arboles[2]= new Tree();
        arboles[3]= new Tree(5,"Pino");
        for(Tree numTrees: arboles)
            System.out.println(numTrees.escriure());

    }
}
