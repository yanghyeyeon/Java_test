package member.model.vo;

public class Sliver extends Member implements Buyable {
    public Sliver() {
    }

    public Sliver(String name, String grade, int point) {
        super(name, grade, point);
    }

    public double calculateInterest() {
        return 0;
    }

    public int buy (int price) {
        return 0;
    }
}
