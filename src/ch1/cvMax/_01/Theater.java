package ch1.cvMax._01;

/**
 * 전체적인 흐름
 * Audience (관람객) -> Bag (관람객의 정보를 가진) -> Invitation
 * -> Ticket
 * TicketSeller (판매원) -> TicketOffice (판매원이 정보를 가져오는 매표소) -> Ticket
 */
public class Theater {
    private TicketSeller ticketSeller; // 판매원을 인스턴스 변수로 생성

    public Theater(TicketSeller ticketSeller) { // 판매원을 인스턴스화 시키는 생성자
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) { // 관람객 입장
        /*
          이 코드에는 2가지의 문제가 존재한다
          1. 코드를 이해하기가 어렵다 이 코드를 이해하기 위해서는 여러 가지 세부적인 내용을 전부 알고있어야 한다.
          2.변경에 취약하다 결합도가 너무 높아서 객체 사이의 의존성이 너무 높다
          만약에 Audience와 TicketSeller를 변경할 경우 Theater도 함께 변경해야 한다.

          이 문제들을 해결하기 위해 Audience와 TicketSeller가 직접 Bag과 TicketOffice를 처리하는 자율적인 존재가 되도록 설계를 변경해보자.
         */

//        if (audience.getBag().hasInvitation()) { // 관람객에 가방에 초대장이 있는지 확인
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().setTicket(ticket);
//        } else { // 관람객에 가방에 초대장이 없는 경우
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
//            audience.getBag().setTicket(ticket);
//        }
        ticketSeller.sellTo(audience); // 위 코드에서 sellTo 메서드를 호출하는 간단한 코드로 변경하였다.
    }
}
