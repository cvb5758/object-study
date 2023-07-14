package ch1.hyungjun._01;

public class Audience {   // 관람객
    private Bag bag;

    public Audience(Bag bag) {   //관람객이 소지품을 보관할 수 있는 가방   여기서 왜 꼭 this.을 해주는지?? 여기서 this의 의미가 무엇인지??
        this.bag = bag;
    }

//  public Bag getBag() {  // 이 Audience 클래스 안의 getBag() 함수를 이용해서 관람객의 가방에 접근한다고 받아들이면 되나요???
//      return bag;
//  }
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}

// 이제 Audience는 자신의 가방안에 초대장이 있는지 직접확인한다. 외부의 제 3자가 가방을 열도록 허용하지 않는다.
