/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

/**
 *
 * @author Poozer
 */
public class Runnable1 implements Runnable {

          public static String runnableTheThing;
    public void test1(){
        for(int z = 1; z <= 5; z++){
            System.out.println(Thread.currentThread().getName()+" got number "+ z +" right ");
            boolean Check = this.Check(z);
            if(Check){
                break;
            }
        }
    }
    private boolean Check(int pass){
        boolean Check = false;
        if((Runnable1.runnableTheThing==null)&&(pass==5)){
            String passName=Thread.currentThread().getName();
            Runnable1.runnableTheThing=passName;
            System.out.println("Acceptable Marks.");
            Check=true;
        }
        else if(Runnable1.runnableTheThing==null){
            Check=false;
        }
        else if(Runnable1.runnableTheThing==null){
            Check=true;
        }
        return Check;
    }
    public void run(){
        this.test1();
    }
}