package member.model.vo;

public class Vip extends Member implements Buyable{
    public Vip() {
    }

    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        double pointResult = getPoint() * 0.1;
        return pointResult;
    }

    @Override
    public int buy (int price) {
        double discount = price * 0.1;
        return (int)(price - discount);
    }
}
