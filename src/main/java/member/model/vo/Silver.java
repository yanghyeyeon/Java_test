package member.model.vo;

public class Silver extends Member implements Buyable {
    public Silver() {
    }

    public Silver(String name, String grade, int point) {
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
