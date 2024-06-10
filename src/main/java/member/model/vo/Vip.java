package member.model.vo;

public class Vip extends Member implements Buyable{
    public Vip() {
    }

    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    public double calculateInterest() {
        return 0;
    }

    public int buy (int price) {
        return 0;
    }
}
