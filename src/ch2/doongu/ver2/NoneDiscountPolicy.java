package ch2.doongu.ver2;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening){
        return Money.ZERO;
    }
}
