public class MultiThreading {
    public static void main(String[] args) {

        Counter ctr = new Counter();
        MyThread obj = new MyThread(ctr);
        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj);
        Thread thread3 = new Thread(obj);
        Thread thread4 = new Thread(obj);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(ctr.count);
    }
}

class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class MyThread implements Runnable {

    Counter ct;

    MyThread(Counter ctr) {
        this.ct = ctr;
    }

    public void run() {
        for (int i = 0; i < 10000; i++)
            ct.increment();
    }
}
