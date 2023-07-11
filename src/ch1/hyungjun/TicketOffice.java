package ch1.hyungjun;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {   // 여기서 ... 전개연산자의 역할로 쓰인것 맞나요??
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));       // tickets 라는 ArrayList에 모두 넣어준다??
    }

    public Ticket getTicket() {
        return tickets.remove(0);   // 배열의 첫번째 인덱스 (첫번째 순서의 티켓)을 제거한다. 반환되는 값이 무엇일까???
    }

    public void minusAmount(Long amount) {   // 이 함수들은 이미 Audience 클래스에 있는데 중복해서 써야할 필요가 있을까???
        // 가져다 쓸수 있는방법은 무엇일까???
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
