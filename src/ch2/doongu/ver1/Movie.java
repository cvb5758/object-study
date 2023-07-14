package ch2.doongu.ver1;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy){
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee(){
        return fee;
    }


    // Movice 입장에서는 어떤 클래스의 인스턴스인지가 중요한 것이 아니라
    // calculateDiscountAmount 메세지를 수신할 수 있다는 사실이 중요하다.
    // Movie는 동일한 메시지를 전송하지만 실제로 어떤 메서드가 실행될 것인지는 메시지를 수신하는 객체의 클래스가
    // 무엇냐에 따라 달라진다. 이를 다형성이라고 부른다.

    // => 동일한 메시지를 수신했을 때 객체의 타입에 따라 다르게 응답할 수 있는 능력을 의미한다.

    // 프로그램 작성시에는 Movie 클래스는 추상 클래스에 의존하지만
    // 컴파일 시간 의존성은 Movie에서 DiscountPolicy로 향한다.
    // 이처럼 다형성은 컴파일 시간 의존성과실행시간 의존성을 다르게 만들 수 있는 객체지향의
    // 특성을 이용해 서로 다른 메서드를 실행할 수 있게 한다.

    // 지연 바인딩(lazy binding) 또는 동적바인딩 이라는 의미는 메시지와 메서드를 실행 시점에 바인딩 하는 것이고
    // 이는 다형성을 구현 할 수 있다.

    // 전통적인 함수 호출 처럼 컴파일 시점에 실행될 함수나 프로시저를 결정하는 것을
    // 초기 바인딩(early binding) 또는 정적바인딩(static binding)이라고 부른다.

    // 동적바인딩 메커니즘 덕에 하나의 메시지를 선택적으로 서로 다른 메서드에 연결할 수 있다.

    // 상속은 "구현 상속"이 아니라 "인터페이스 상속"을 위해 사용해야한다.
    // 사람들은 코드 재사용을 상속의 주된 목적이라고 생각하지만 이것은 오해다.
    // 인터페이스 상속을 해야하는 이유는 진정한 다형성이 이루어지기 때문이 아닐까?
    public Money calculationMovieFee(Screening screening){
        //스타워즈 허나 아래 코드처럼 작성하면
        // 할인 정책이 없는 경우를 예외 케이스로 취급하기 때문에 지금까지 일관성 있던
        // 협력 방식이 무너지게 된다.
        // 기존 할인정책의 책임은 DiscountPollycy자식 클래스에만 있었는데 Movie에서 결정해버리기 때문
//        if (discountPolicy == null){
//            return fee;
//        }

        return fee.minus(discountPolicy.calculateDiscountAmount(screening)); //
    }

}
