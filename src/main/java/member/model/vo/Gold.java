package member.model.vo;

public class Gold extends Member implements Buyable{

    public Gold() {
    }

    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }

    public double calculateInterest() {
        return 0;
    }

    public int buy (int price) {
        return 0;
    }
}
