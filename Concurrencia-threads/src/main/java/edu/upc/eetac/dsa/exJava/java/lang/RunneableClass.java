package edu.upc.eetac.dsa.exJava.java.lang;

/**
 * Created by Usuari on 29/09/2015.
 */
public class RunneableClass implements Runnable {
    long lastexecution=0;
    int counter=0;


    public void run(){
        for (int i=0;i<10;i++) {
            long currentExecution = System.currentTimeMillis(); //Calcula donde se esta ejecutando
            long transcurrido = (lastexecution==0)?0:currentExecution-lastexecution;
            lastexecution=currentExecution;
            System.out.println("Soy el thread " + Thread.currentThread().getName()+ ", tiempo transcurrido "+transcurrido+" en ms y llevo " + (++counter)+ "threads");
            long sleep = (long) (Math.random()*2000); //Numero aleatorio entre 0 y 2
            try{
                Thread.sleep(sleep);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }
}
