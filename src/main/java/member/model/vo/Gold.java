package member.model.vo;

public class Gold extends Member implements Buyable{

    public Gold() {
    }

    public Gold(String name, String grade, int point) {

        super(name, grade, point);
    }
    @Override
    public double calculateInterest() {
        double pointResult = getPoint() * 0.05;
        return pointResult;
    }
    @Override
    public int buy (int price) {
        double discount = price * 0.05;
        return (int)(price - discount);
    }
}
