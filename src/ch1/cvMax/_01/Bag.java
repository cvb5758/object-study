package ch1.cvMax._01;

/**
 * 관강객이 가지고 올 수 있는 소지품
 * 초대장 -> 이벤트 당첨자 -> Ticket
 * 현금 -> 이벤트 당첨X 직접 구매 -> Ticket
 * 티켓
 */
public class Bag {
    private Long amount; // 현금
    private Invitation invitation; // 초대장
    private Ticket ticket; // 티켓

    /**
     * 이벤트의 당첨된 사람과 당첨되지 않은 사람을 구분하기 위한 생성자
     * 당첨 O -> 현금과 초대장 소유
     * 당첨 X -> 초대장 없이 현금만 보유
     */

    public Bag(Long amount) { // 당첨 X
        this(null, amount); // this 통한 생성자 호출
    }

    public Bag(Invitation invitation, Long amount) { // 당첨 O
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
    public boolean hasInvitation() { // 초대장 보유 여부
        return invitation != null;
    }
//    public boolean hasTicket() { // 티켓 보유 여부
//        return ticket != null;
//    }
    public void setTicket(Ticket ticket) { // 초대장을 티켓으로 교환
        this.ticket = ticket;
    }
    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
//    public void plusAmount(Long amount) {
//        this.amount += amount;
//    }
}
