package ch2.doongu.ver2;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class CallExample {
    Movie avater = new Movie("아바타", Duration.ofMinutes(120), Money.wons(10000),
            new AmountDiscountPolicy(Money.wons(800), // AmountDiscountPolicy instance를 전달하기만 하면 금액 할인 정책이 적용된다. Movie 생성자에서
                                                      // DiscountPolicy 타입의 객체를 인자로 받기 때문에 가능하다.
                                                      // '실행 시' Movie의 '인스턴스'는 AmountDiscountPolicy '인스턴스'에 의존하게 된다.

                                                      // 할인 비율을 적용하고 싶다면 PercentDiscountPolicy를 전달하면 된다.
                                                      // 코드의 의존성과 실행 시점의 의존성이 서로 다를 수 있다. => 클래스 사이의 의존성과 객체 사이의 의존성은 동일하지 않을 수 있따.
                                                      // 확장 가능한 객체지향 설계가 가지는 특징은 코드의 의존성과 실행 시점의 의존성이 다르다.
                                                      // 하지만 이는 양날의 검이다. 확장가능하면 의존성을 연결하는 부분을 찾아봐야한다. 설계가 유연해질수록 코드를 이해하고 디버깅하기는 점점 더 어려워진다.
                                                      // 반대로 코드를 이해하기 쉽고 디버깅하기 쉽다면 재사용성과 확장 가능성은 낮아진다. | 정답은 없다. 이것이 객체지향 설계가 어려우면서도 매력적인 이유다 ;;;;
                    new SequenceCondition(1),
                    new SequenceCondition(10),
                    new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10,0), LocalTime.of(11,59)),
                    new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10,0), LocalTime.of(20,59))

                    ));
}
