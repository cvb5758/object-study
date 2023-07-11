package ch1.doongu.ticketapp.version3;

// 판매원
// 판매원은 매표소를 알고 있어야함
public class TicketSeller {
    private final TicketOffice ticketOffice;

    // 초대장을 티켓으로 교환
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

//    public TicketOffice getTicketOffice(){
//        return ticketOffice;
//    }

    //캡슐화
    //변경하기 쉬운 코드를 만들어줌
    public void sellTo(Audience audience) {
        // 초대장을 가지고 있다면 이벤트에 당첨된 관람객
        // 판매원에게 받은 티켓을 관람객에게 넣음
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTIcket()));
    }
}

