package ch1.doongu.ticketapp.version4;


// 개선 : 분명 Audience는 자율적인 존재다.
// 스스로 티켓을 구매하고 가방 안의 내용물을 직접 관리한다. 하지만 Bag은?
// Audience에 끌려다는 수동적인 존재다. 객체지향적(변경 가능한 코드 말하는듯)에 따르면 Bag에
// 문제가 있다.

// 고로 Bag을 자율적으로 바꾸자.


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
        /*if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();*/

        return bag.hold(ticket);
    }
}
