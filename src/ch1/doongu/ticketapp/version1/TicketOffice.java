package ch1.doongu.ticketapp.version1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 매표소, 판매하거나 교환해 줄 티켓의 목록(tickets), 판매 금액(amount) 가짐
// 티켓 판매 메소드 getTicket()
// 판매 금액을 더하거나 차감하는 plusAmount(), minusAmount()
public class TicketOffice {
    private long amount;
    private List<Ticket> tickets = new ArrayList<>();

    // 생성자, ...문법 뭐지
    public TicketOffice(long amount, Ticket ... tickets){
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    // 티켓 차감
    public Ticket getTIcket(){
        return tickets.remove(0);
    }

    // 판매 금액 차감
    public void minusAmount(long amount){
        this.amount -= amount;
    }

    // 판매 금액 더함
    public void plusAmount(long amount){
        this.amount += amount;
    }
}
