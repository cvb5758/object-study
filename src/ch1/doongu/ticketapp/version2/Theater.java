package ch1.doongu.ticketapp.version2;

// 소극장을 구현하는 클래스
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        ticketSeller.selloTo(audience);
    }

}
