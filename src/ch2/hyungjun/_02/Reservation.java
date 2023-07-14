package ch2.hyungjun._02;

public class Reservation {
    private Customer customer;   // 고객, 상영정보, 예매 요금, 인원 수
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation (Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}

// 협력(Collaboration) : 시스템의 어떤 기능을 구현하기 위해 객체들 사이에 이뤄지는 상호작용

// 객체의 상호 작용 : 1. 메세지 전송 2. 메세지 수신
// 수신된 메세지를 처리하기위한 자신만의 방법 => 메서드

// 메시지와 메서드를 구분하는 것은 매우 중요!! 메세지는 (다른 객체로부터) 메서드는 (나만의 고유의 것)
//메세지와 메서드의 구분에서부터 다형성의 개념이 출발
