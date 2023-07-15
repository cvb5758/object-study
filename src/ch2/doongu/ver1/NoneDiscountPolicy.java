package ch2.doongu.ver1;

public class NoneDiscountPolicy extends DiscountPolicy {
    public NoneDiscountPolicy(DiscountCondition... conditions) {
        super(conditions);
    }


    //movie에 넣지않고 별도의 자식으로 관리한다.
    // 추상화를 중심으로 유연하고 확장가능한 설계가 된다
    // 이렇게 하면 Movie는 특정한 할인 정책에 묶이지 않는다.
    // 또한 DiscountPolicy는 어떤 클래스와도 협력이 가능하다.

    // 이 클래스 개발자는 DiscountPolicy의 내부 구현을 알고 있다. 그 가정하에 해당 메소드를 작성한 것
    // getDiscountAmount()가 호출되지 않을 경우 DiscountPolicy가 0원을 반환할 것이라는 사실을 가정하고 있다.

    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return Money.ZERO;
    }
}
