class Counter {

    int count = 0;

    void increment() {
        count++;
    }
}

class MyTask extends Thread {

    Counter counter;

    MyTask(Counter counter) {
        this.counter = counter;
    }

    public void run() {

        for (int i = 1; i <= 10000; i++) {
            counter.increment();
        }
    }
}

public class SyncronizedThread1 {

    public static void main(String[] args)
            throws InterruptedException {

        Counter c = new Counter();

        MyTask t1 = new MyTask(c);
        MyTask t2 = new MyTask(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count = " + c.count);
    }
}