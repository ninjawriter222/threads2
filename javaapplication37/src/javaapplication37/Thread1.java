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
public class Thread1 {

    public static void main(String[] args) {

        new ThreadTest(1).start();
        new ThreadTest(3).start();
        new ThreadTest(5).start();
    }

    static Object currentThread() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class ThreadTest extends Thread {

    int startLine;

    public ThreadTest(int input) {
        startLine = input;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " is counting to 5 starting at " + startLine);
        for (int i = startLine; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                ThreadTest.sleep(3000);

                ThreadTest.sleep(0, 999999);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " is finished!");
    }
}
