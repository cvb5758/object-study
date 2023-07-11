package ch1.doongu.ticketapp.version2;

// 판매원
// 판매원은 매표소를 알고 있어야함
public class TicketSeller {
    private TicketOffice ticketOffice;

    // 초대장을 티켓으로 교환
    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice(){
        return ticketOffice;
    }

    public void selloTo(Audience audience){
        // 초대장을 가지고 있다면 이벤트에 당첨된 관람객
        // 판매원에게 받은 티켓을 관람객에게 넣음
        if (audience.getBag().hasInvitation()){
            Ticket ticket = ticketOffice.getTIcket();
            audience.getBag().setTicket(ticket);
        } else { // 가지고 있지 않다면?
            // 티켓을 판매하고 가방에 넣음
            Ticket ticket = ticketOffice.getTIcket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
