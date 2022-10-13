package JCF.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;
    // 필드

    public MemberHashSet() {

        hashSet = new HashSet<Member>();

    }// 기본 생성자


//    --- 메소드 ---
    public void addMember(Member member) {

        hashSet.add(member);

    }// addMember()

    public boolean removeMember(int memberId) {

        Iterator<Member> ir = hashSet.iterator();
        /*
            set 은 객체 전체를 대상으로 한번씩 반복해서 가져오는 iterator() 제공
        */

        while (ir.hasNext()) {
            /*
                hasNext() : 가져올 객체가 있으면, true 없으면, false 리턴
            */

            Member member = ir.next();
            /*
                next() : 컬렉션에서 하나의 객체를 가져온다.
            */

            int temId = member.getMemberId();

            if(temId == memberId) {

                hashSet.remove(member);
                /*
                    remove() : Set 컬렉션에서 객체를 제거
                */
                return true;

            }// if

        }// while

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;

    }// removeMember()

    public void showAllMember() {

        for(Member member : hashSet){

            System.out.println(member);

        }// for

        System.out.println();


    }// showAllMember()

}// class
