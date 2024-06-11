package member.run;

import member.controller.MemberRepository;
import member.controller.OverMemberException;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;

public class Run {
    public static void main(String[] args) {

        MemberRepository mr = new MemberRepository();
        try {
            mr.insertMember(new Silver("홍길동", "Silver", 1000));
            mr.insertMember(new Silver("고길동", "Silver", 2000));
            mr.insertMember(new Silver("홍동민", "Silver", 3000));
            mr.insertMember(new Gold("김회장", "Gold", 1000));
            mr.insertMember(new Gold("이회장", "Gold", 2000));
            mr.insertMember(new Gold("오회장", "Gold", 3000));
            mr.insertMember(new Vip("이순신", "Vip", 10000));

            System.out.println("=========================== 회원 포인트 적립 정보 ===========================");
            mr.printData();
            System.out.println("=========================== 회원 물품 금액 정보 ===========================");
            int price = 10000;
            mr.printBuyInfo(price);

        } catch (OverMemberException e) {

            e.printStackTrace();
        }


    }
}
