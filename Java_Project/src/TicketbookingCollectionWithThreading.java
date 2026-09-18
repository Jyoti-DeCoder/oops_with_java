import java.util.*;

public class TicketbookingCollectionWithThreading {
    public static void main(String[] args) {

        TicketBooking obj = new TicketBooking();
        BookingCounter Bookcntr = new BookingCounter(obj);
        Thread t1 = new Thread(Bookcntr);
        Thread t2 = new Thread(Bookcntr);
        Thread t3 = new Thread(Bookcntr);
        t1.start();
        t2.start();
        t3.start();

    }

}

class TicketBooking {
    List<Integer> tickets = new ArrayList<>();

    TicketBooking() {
        for (int i = 1; i <= 5; i++) {
            tickets.add(i);
        }
    }

    synchronized void bookTicket() {
        if (tickets.isEmpty()) {
            System.out.println("tickets sold out");
            return;
        }
        System.out.println("Ticket successfully booked with id" + tickets.get(0));
        tickets.remove(0);
    }
}

class BookingCounter implements Runnable {
    TicketBooking tb;

    BookingCounter(TicketBooking tb) {
        this.tb = tb;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        tb.bookTicket();
    }
}