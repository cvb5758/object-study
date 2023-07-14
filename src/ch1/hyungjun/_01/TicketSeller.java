package ch1.hyungjun._01;

import ch1.hyungjun._01.Audience;
import ch1.hyungjun._01.TicketOffice;

public class TicketSeller {
    public TicketOffice ticketOffice;  // ticket office의 가시성이 private 이고 접근 가능한 public 메서드
    // 가 더이상 없어서 ticketOffice에 대한 접근은 이제 TicketSeller만 가능하다.
    // 여기서 접근 가능한 public method의 예시는???

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

//  public TicketOffice getTicketOffice() {   // 티켓 셀러는 티켓 오피스를 알고있어야 한다를 왜 이렇게 구현하는것인가??
//        return ticketOffice;
//  }

    public void sellTo(Audience audience) {
//        if(audience.getBag().hasInvitation()) {
//            Ticket ticket = ticketOffice.getTicket();
//            audience.getBag().setTicket(ticket);
//        } else {
//            Ticket ticket = ticketOffice.getTicket();
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketOffice.plusAmount(ticket.getFee());
//            audience.getBag().setTicket(ticket);
//        }

        ticketOffice.sellTicketTo(audience);
    }
}

// 응집도(cohesion) 가 높은 객체란?
// 자신과 밀접하게 연관된 작업만을 수행하고 연관성 없는 작업은 다른 객체에게 위임하는 객체 (자기주도성 높은 객체)


// 이렇게 되면 TicketOffice에 대한 접근이 가능한 클래스는 TicketSeller밖에 없기 때문에 TicketOffice내부에서 실행
//되는 일들은 오직 TicketSeller 스스로를 통해서 할 수 밖에 없다.

// 이처럼 개념적이나 물리적으로 객체 내부의 세부적인 사항을 감추는 것을 캡슐화(Encapsulation)이라고 한다.
// 캡슐화의 목적은 변경이 용이한 코드를 만드는 것이다.
// 캡슐화를 통해 객체 내부로의 접근을 제한 하면 객체와 객체 사이의 결합도를 낮출수 있어 설계를 좀 더 쉽게 변경할 수 있다.

// 이 코드에서 캡슐화가 일어나게 하는 원인이 1. ticketOffice가 private으로 가시성이 설정된점 , 2. 다른 접근가능한 public
// 메서드가 존재하지 않는점 때문이 맞는지??? 아니면 캡슐화를 시켜주는 다른 특별한 방식이 존재하는것인지???



//--------------------------------------------------------------------------------------------

// 절차적 프로그래밍 (Procedural Programming)
// 프로세스 (Process) 와 데이터(Data)를 별도의 모듈에 위치시키는 방식 -> 책임이 한 객체에 집중

// 객체지향 프로그래밍 (Object-Oriented-Programming)
// 프로세스와 데이터가 동일한 모듈 내부에 위치 하도록 하는 방식 -> 책임이 각 개별 객체에 분산


// 책임의 이동(shift of responsibility) => 객체지향세계의 용어 '기능' 같은 느낌

// 각 객체에 핵심적인 기능(책임) 을 부여(할당)해주는 것이 중요하다!!!