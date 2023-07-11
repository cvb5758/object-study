package ch1.doongu.ticketapp.version3;

// 소극장을 구현하는 클래스
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        // Theater에서는 이제 ticketOffice에 접근하지 않는다.
        ticketSeller.sellTo(audience);

//        // 초대장을 가지고 있다면 이벤트에 당첨된 관람객
//        // 판매원에게 받은 티켓을 관람객에게 넣음
//        if (audience.getBag().hasInvitation()){
//            Ticket ticket = ticketSeller.getTicketOffice().getTIcket();
//            audience.getBag().setTicket(ticket);
//        } else { // 가지고 있지 않다면?
//            // 티켓을 판매하고 가방에 넣음
//            Ticket ticket = ticketSeller.getTicketOffice().getTIcket();
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
//            audience.getBag().setTicket(ticket);
//        }
    }

}
