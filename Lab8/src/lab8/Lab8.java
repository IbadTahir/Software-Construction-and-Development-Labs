package lab8;

public class Lab8 {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();
    public static Object Lock3 = new Object();

    public static void main(String[] args) {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        ThreadDemo3 T3 = new ThreadDemo3();

        T1.start();
        T2.start();
        T3.start();
    }

    // Thread 1
    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding Lock1");
                try {
                    Thread.sleep(50); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding Lock1 & Lock2");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (Lock1) { 
                System.out.println("Thread 2: Holding Lock1");
                try {
                    Thread.sleep(50); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Lock2) {
                    System.out.println("Thread 2: Holding Lock1 & Lock2");
                    synchronized (Lock3) {
                        System.out.println("Thread 2: Holding Lock1, Lock2 & Lock3");
                    }
                }
            }
        }
    }

    private static class ThreadDemo3 extends Thread {
        public void run() {
            synchronized (Lock1) { 
                System.out.println("Thread 3: Holding Lock1");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Lock2) {
                    System.out.println("Thread 3: Holding Lock1 & Lock2");
                    synchronized (Lock3) {
                        System.out.println("Thread 3: Holding Lock1, Lock2 & Lock3");
                    }
                }
            }
        }
    }
}
