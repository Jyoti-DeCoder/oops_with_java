public class Usecase5 {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        t2.setPriority(10);
        t1.setName("Counter1");
        t2.setName("Counter2");
        t1.start();

        t2.start();

        // TODO: set t1 priority to Thread.MAX_PRIORITY
        // TODO: start both threads
    }
}

class TicketCounter implements Runnable {
    int availabletickets = 3;

    synchronized void bookTickets() {
        if (availabletickets > 0) {
            availabletickets = availabletickets - 1;

            System.out.println("Ticket booked by " + Thread.currentThread().getName());
            System.out.println("left tickets are " + availabletickets);
        } else {
            System.out.println("Tickets are sold out");
        }
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        while (availabletickets > 0) {
            bookTickets();
        }
    }
}
