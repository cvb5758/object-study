package ch1.cvMax._01;

import java.util.function.Predicate;

/**
 * 관람객이라는 개념을 구현한 클래스
 */

public class Audience {
    private Bag bag; // 관람객의 소지품을 보관하고 있는 Bag 타입을 인스턴스 변수로 구현

    public Audience(Bag bag) {
        this.bag = bag;
    }

//    public Bag getBag() { // 다른 클래스에서 변경하지 못하게 코드를 제거한다.
//        return bag;
//    }

    /**
     * 이제 Audience는 자기 가방 안에 초대장이 있는지 스스로 확인하고
     * 다른 클래스에서 자신을 참조하도록 허용하지 않는다.
     * (캡슐화)
     */

    public Long buy(Ticket ticket) { // 티켓 구매
//        if (bag.hasTicket()) {
//            bag.setTicket(ticket);
//            return 0L;
//        } else {
//            bag.setTicket(ticket);
//            bag.minusAmount(ticket.getFee());
//            return ticket.getFee();
//        }
        return bag.hold(ticket);
    }
}
