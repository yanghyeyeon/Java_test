package member.controller;

import member.model.vo.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private int memberMax = 10;
    private List<Member> Members = new ArrayList<>(memberMax);

    public MemberRepository() {

    }

    public void insertMember (Member m) throws OverMemberException {
        Members.add(m);

        if(Members.size() > 10) {
            throw new OverMemberException("Member List is full");
        }

    }
    public void printData(){

        for (Member member : Members) {
            System.out.println(member.getGrade() + "등급 회원 " + member.getName() + "의 포인트는 " + member.getPoint()
            + "이고, 이자 포인트는 " + member.calculateInterest() + "입니다.");
        }

    }

    public void printBuyInfo (int price) {

        for (Member member : Members) {
            System.out.println(member.getGrade() + " 등급 회원 " + member.getName() + "는 " + price +
                    "원  상품을 " + member.buy(price) + "원에 구매합니다.");
        }

    }
}
