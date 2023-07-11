package ch1.doongu.ticketapp.version2;

// 관람객 클래스, Bag을 소지할 수 있음
public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Bag getBag(){
        return bag;
    }
}
