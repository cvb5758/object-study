package ch1.cvMax._01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 초대장을 티켓으로 교환하거나, 현금으로 구매하기 위해 필요한
 * 판매할 티켓
 * 티켓의 가격
 * 이 포함된 매표소를 구현한 클래스
 */

public class TicketOffice {
    private List<Ticket> tickets = new ArrayList<>();
    private Long amount;

    public TicketOffice(Long amount, Ticket ... tickets) { // ... 가변인자를 통해 여러장의 티켓을 입력 받을 수 있다.
        this.tickets.addAll(Arrays.asList(tickets)); // 가변인자를 통해 받은 티켓들을 List 형태로 변환하여 tickets에 넣는다.
        this.amount = amount;
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    public Ticket getTicket() {
        return tickets.remove(0); // 티켓은 맨 첫번째 위치한 티켓을 반환하는 것으로 구현.
    }

//    public void minusAmount(Long amount) {
//        this.amount -= amount;
//    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
