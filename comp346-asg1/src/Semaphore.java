//filename: Semaphore.java
/**************************************************************/
/* class Semaphore                                            */
/* The class defines and implements a semaphore.              */
/* The file is ported from the Dr. probst lab4.txt            */
/* Author: Jianxiong Dong                                     */
/* Date  : May 30, 2000                                       */

/**************************************************************/


public class Semaphore {
    private int value;

    public Semaphore() {
        value = 0;

    }

    public Semaphore(int v) {
        value = v;

    }

    public synchronized void acquire() {
        while (value <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        value--;

    }

    public synchronized void release() {
        ++value;
        notify();

    }
}
