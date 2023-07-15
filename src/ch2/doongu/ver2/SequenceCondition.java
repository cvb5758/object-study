package ch2.doongu.ver2;

public class SequenceCondition implements DiscountCondition {
    private int squence;

    public SequenceCondition(int sequence){
        this.squence = sequence;
    }


    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(squence);
    }
}
