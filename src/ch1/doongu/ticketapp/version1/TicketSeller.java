package ch1.doongu.ticketapp.version1;

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
}
