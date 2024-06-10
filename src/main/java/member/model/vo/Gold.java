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

    public int buy (int price) {

        return 0;
    }
}
