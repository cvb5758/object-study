package ch1.cvMax._02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 할인정책
 * discountPolicy 를 상속받은 2개의 정책이 있는데
 * movie 가 걔네랑 어떻게 연결되는가?
 * movie 의 생성자에 discountPolicy 타입의 인자를 받는다
 * 그 인자를 이용해서 discountPolicy 의 자식클래스의 인스턴스를 전달한다.
 */

public abstract class DefaultDiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    /**
     * Movie 에서 메세지 받음
     * @param conditions 메세지 보냄
     */

    public DefaultDiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    /**
     * Movie 클래스에서 정해지지 않은 할인 정책을 상속 받은 자식클래스가 구현하게 만들어놓았다
     * 이처럼 기본적인 알고리즘의 흐름은 부모클래스에서 구현하고
     * 중간에 필요한 처리를 자식클래스에게 위임하는것을
     * TEMPLATE METHOD 패턴 이라고 한다
     */
    abstract protected Money getDiscountAmount(Screening Screening);
}
