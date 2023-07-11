package ch1.hyungjun;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }

//    public void enter(Audience audience) {
//        if(audience.getBag().hasInvitation()) {
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().setTicket(ticket);
//        } else {
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
//            audience.getBag().setTicket(ticket);
//        }
//    }     ----> 이곳의 기능을 Theater에서 TicketSeller에게 옮겨 주었다.

    // 1. 초대권을 가진경우 2. 초대권을 가지지 않은경우
    // 1 -> 매표소 직원한테 티켓을 받아서 관람객의 가방에 티켓을 넣는다.
    // 2 -> 관람객의 소지금에서 티켓의 가격만큼의 돈을 빼준다.
    // 그리고 나서 티켓 직원의 소지금에 티켓가격을 더해준다. 그리고 관람객의 가방에 티켓을 넣는다.
}

// ----------------------------------------------------------------------------------------------

//모듈 이란? => 크기와 상관없이 클래스나 패키지, 라이브러리와 같이 프로그램을 구성하는 임의의 요소

// 로버트 마틴의 모듈의 세가지 원칙
// 1. 제대로 실행되어야한다.
// 2. 변경이 용이해야한다.
// 3. 이해하기 쉬워야한다.

// 여기까지 코드의 문제점은 변경의 용이성이 떨어진다는것과 (코드를 해석했을때) (통상적으로) (상황을) 이해하기 어렵다는 것이다.

// 소극장이 관람객과 판매원을 통제하는 상황 -> 통상적으로는 의지를 가지고 있는 존재인 판매원과 관람객이 주도적으로 어떤 일을 행해야
// 맥락에 맞는데 소극장이 능동적이고 판매원과 관람객이 수동적인 상황이 코드를 해석했을때 펼쳐지고 있다.

// 이해 가능한 코드 => 우리가 상식적으로 생각했을때 크게 이상한 부분이 없는 상황을 구현한 코드
// 우리의 정상적인 행동 자체를 그대로 코드로 반영하는것이 이해가 쉬운 코드일 것이다.

// 이 코드의 가장 큰 문제점 : 변경에 취약하다.
// 그 이유 : 하나의 클래스 안에 너무 많은 세부사항을 다루고 있다. Ex) Theater 클래스 안의 인스턴스 변수로 선언된
// Audience, TicketSeller 클래스 -> 이것들을 변경하면 Theater 클래스도 함께 변경해야만 한다.
// 애초에 기본상태의 변동사항이 많을 수 있는 Audience와 TicketSeller는 Theater처럼 실제 상황으로는 수동적 이어야
//하는 class 내에서 변동사항 없이 모든 조건들을 통제하기가 힘들어 보인다.

// 객체 사이의 의존성(dependency) 관련 문제 -> 변경에 대한 영향 암시
// 객체 사이의 의존성이 과한경우 -> 결합도(coupling) 이 높다 라는 표현을 사용한다.
// 객체 사이의 의존성이 합리적일경우 -> 결합도가 낮다 라는 표현을 사용한다.

// 필요한 의존성만을 최소한으로 유지하고 객체간에 협력하는 기능을 구현하는것이 객체지향 설계의 궁극적인 목표이다.
// 그리고 목표 객체사이의 결합도를 필요수준으로 낮춰 변경이 용이한 설계를 하는것이 목표이다.

// 이 문제의 해결법 -> Theater 이 ticketSeller와 Audience의 세부한 정보까지는 알지 못하게 차단하는것이다.
// 풀어서 말하면 코드의 맥락을 다시 상식적인 상황에 맞게 Teather을 수동적으로 만들고 Audience와 ticketSeller가
// 능독적인 존재가 될 수 있도록 만들어 주면 된다. (자율성 높이기)


//-----------------------------------------------------------------------------------------------

// ==> 결국 Theater 클래스의 역할은 단순해졌다.
// sellTo 메서드를 호출해 주는것!
// Theater은 캡슐화로 인해 ticketOffice가 TicketSeller안에 존재한다는 사실을 모른다.
// 단지 ticketSeller가 sellTo 메세지를 이해하고 응답할 수 있다는 사실만 알고있다.


// Theater는 오직 TicketSeller의 인터페이스(interface)에만 의존한다. 포함에 관한 사실은 구현(implementation)이다.
// 객체를 인터페이스와 구현으로 나누고 인터페이스만 공개하는 것은 객체사이의 결합도를 낮추고 변경하기 쉬운 코드를 작성하기 위해 따라야
// 하는 가장 기본적인 설계 원칙이다. ===> 이 말의 의미를 다시 해석해봤으면 좋겠다.
