package javaapplication37;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


/**
 *
 * @author Poozer
 */
public class Group1 {
    public static void main (String[] args){
        Executor executor = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            Runnable1 runnable = new Runnable1();
            executor.execute(runnable);
        }
        try{
            Thread.sleep(5000);
            System.out.println("Wake Up!");
            for(int i = 0; i < 5; i++){
                Runnable1 runnable = new Runnable1();
                executor.execute(runnable);
            }
            } catch (InterruptedException e){
        }
    }
}

