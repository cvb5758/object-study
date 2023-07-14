package ch2.doongu.ver1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//DiscountPolicy 안에 "중복 코드"를 두고 AmountDisCountPolicy와 PercentDiscountPolicy가
// 이를 상속받게 함. 그래서 추상클래스로 만듬!


// 이 코드 처럼 부모 클래스에 기본적인 알고리즘 흐름을 구현하고
// 중간에 필요한 처리를 자식 클래스에게 위임하는 디자인 패턴을
// TEMPLATE METHOD 패턴이라고 부른다.

// DiscountCondition은 인터페이스임.
public abstract class DiscountPolicy {

    //하나의 할인 정책은 여러개의 할인 조건을 가질 수 있따.
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {

            // 인터페이스 메소드 호출
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening Screening);
}
