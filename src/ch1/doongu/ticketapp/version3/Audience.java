package ch1.doongu.ticketapp.version3;

// 관람객 클래스, Bag을 소지할 수 있음
public class Audience {
    private final Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

//    public Bag getBag(){
//        return bag;
//    }

    public Long buy(Ticket ticket) {
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
