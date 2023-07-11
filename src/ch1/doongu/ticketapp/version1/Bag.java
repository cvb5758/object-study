package ch1.doongu.ticketapp.version1;

// 관람객이 소지품을 보관할 Bag 클래스 / 초대장(invitation), 티켓(ticket), 현금(amount)를 가짐
public class Bag {
    private Long amount; // long은 null이 안들어가지고 Long은 객체타입이여서 NULL이 가능합니다
    // long에 null들어가면 nullexcepiton뜨면서 예외처리
    // 안해주면 프로그램 종료될수도있는데 Long은 NULL이 들어가집니다
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount){
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }

    // 초대장 소유 여부 판단 hasInvitation
    public boolean hasInvitation(){
        return invitation != null;
    }

    // 티켓 소유 여부 판단 hasTicket
    public boolean hasTicket(){
        return ticket != null;
    }

    // 초대장을 티켓으로 교환하는 setTicket 보유
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }
    
    // 현금 감소
    public void minusAmount(long Amount){
        this.amount -= amount;
    }
    
    // 현금 증가
    public void plusAmount(long Amount){
        this.amount += amount;
    }
    
}
