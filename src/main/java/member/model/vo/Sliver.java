package member.model.vo;

public class Sliver extends Member implements Buyable {
    public Sliver() {
    }

    public Sliver(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        double pointResult = getPoint() * 0.02;
        return pointResult;
    }

    @Override
    public int buy (int price) {
        double discount = price * 0.02;
        return (int)(price - discount);
    }
}
