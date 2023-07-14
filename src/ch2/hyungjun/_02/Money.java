package ch2.hyungjun._02;

import java.math.BigDecimal;

public class Money {  // 금액을 구현하기 위해 1장과 다르게 Long이 아닌 Money를 썼다. 객체지향의 장점 객체를 이용해 도메인의 의미를 풍부하게 표현 가능
    public static final Money ZERO = Money.wons(0); // 개념이 하나의 인스턴스 변수만을 포함하더라도 개념을 명시적으로 표현하는것이 좋다.

    private final BigDecimal amount;    // static의 의미??

    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));      // .valueOf??? / 자료 타입 double 쓰는 이유??
    }

    Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money plus(Money amount) {  //더하기
        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(Money amount) {    // 빼기
        return new Money(this.amount.subtract(amount.amount));
    }

    public Money times(double percent) {         // 곱해주기 (퍼센트)
        return new Money(this.amount.multiply(
                BigDecimal.valueOf(percent)
        ));
    }

    public boolean isLessThan(Money other) {     // 값 비교
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other) {      // 값 비교 크거나 같으면
        return amount.compareTo(other.amount) >= 0;
    }
}
