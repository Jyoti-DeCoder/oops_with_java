class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class MyThread implements Runnable {
    Counter cn;

    MyThread(Counter cn) {
        this.cn = cn;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            // System.out.println(Thread.currentThread().getName() + "is running at " + i);
            cn.increment();

        }
    }
}

public class Sleep {

    public static void main(String[] args) {
        Counter count = new Counter();
        MyThread obj = new MyThread(count);
        Thread t1 = new Thread(obj, "Thread1");
        Thread t2 = new Thread(obj, "thread2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Count = " + count.count);
    }
}