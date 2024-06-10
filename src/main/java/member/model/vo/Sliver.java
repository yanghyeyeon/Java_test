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

    public int buy (int price) {
        return 0;
    }
}
