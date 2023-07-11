package ch1.cvMax._01;

/**
 * 매표소에서 초대장을 티켓으로 교환해주거나
 * 티켓을 판매하는 역할을 수행하는
 * 판매원을 구현한 클래스
 */

public class TicketSeller {
    private TicketOffice ticketOffice; //판매원은 자신이 일하는 매표소(TicketOffice)를 알아야 한다.

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    /**
     * sellTo 메소드를 통해 티켓을 관리하는 일을 판매원이 직접 하게 되어
     * 다른 외부 클래스에서 매표소를 더 이상 접근할 수 없게 만들고
     * 판매원이 스스로 티켓을 판매하고 돈을 적립하는 일을 스스로 하게 만들었다.
     * 이처럼 개념적이나 물리적으로 객체 내부의 세부적인 사항을 감추는 것을 "캡슐화" 라고 부른다.
     */

    public void sellTo(Audience audience) { // 티켓 판매

        /**
         * 이 코드도 앞 enter 메소드와 마찬가지로
         * 아직 Audience가 이 코드에 대한 의존성이 높아
         * Audience에 관한 부분을 수정
         */

//        if (audience.getBag().hasInvitation()) { // 관람객에 가방에 초대장이 있는지 확인
//            Ticket ticket = ticketOffice.getTicket();
//            audience.getBag().setTicket(ticket);
//        } else { // 관람객에 가방에 초대장이 없는 경우
//            Ticket ticket = ticketOffice.getTicket();
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketOffice.plusAmount(ticket.getFee());
//            audience.getBag().setTicket(ticket);
//        }
//        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket())); // 이제 TicketSeller는 Audinece의 인터페이스에만 의존하게 된다.
        ticketOffice.sellTicketTo(audience);
    }
}
