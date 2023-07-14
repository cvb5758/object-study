package ch1.cvMax._02;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    /**
     *와
     */

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return discountAmount;
    }
}
