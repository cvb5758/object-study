package ch1.hyungjun;

public class Bag {
    private Long amount;           //소지금
    private Invitation invitation;   // 초대장
    private Ticket ticket;      // 티켓

    public boolean hasInvitation() {
        return invitation != null;
        //초대권을 가지고 있는지 여부 판별
    }

    public boolean hasTicket() {
        return ticket != null;
        // 티켓을 가지고 있는지 여부 판별
    }

    public void setTicket(Ticket ticket) {        // (이게 왜 초대장을 티켓으로 변경해주는 내용인가???)
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {      // 소지금 감소
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {    // 소지금 증가
        this.amount += amount;
    }

    public Bag(long amount) {
        this(null, amount);    // 소지금만 들고있는 고객의 가방 상태 그런데 이 코드 왜 이렇게 표현???
    }

    public Bag(Invitation invitation, long amount) {   // 소지금과 초대권을 들고있는 고객의 가방 상태
        this.invitation = invitation;
        this.amount = amount;
    }
}

// Bag의 인스턴스를 생성하는 시점에 이 제약을 강제할 수 있도록 생성자를 생성하자 라고 되어있는데
// public Bag(long amount) {}; 과 public Bag(Invitation invitation, long amount){};를 생성자로
// 만들어 준것은 이해가 갔는데 그러면 이것을 어떤 상황에 어떤방식으로 활용하게 되는지가 궁금합니다.


