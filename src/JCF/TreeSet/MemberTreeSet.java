package JCF.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {

        treeSet = new TreeSet<>();

    }// 생성자


//  --- 메소드 ---

    public void addMember(Member member){

        treeSet.add(member);

    }// addMember()

    public boolean removeMember(int memberId){

        Iterator<Member> ir = treeSet.iterator();

        while( ir.hasNext()){

            Member member = ir.next();

            int tempId = member.getMemberId();

            if( tempId == memberId){

                treeSet.remove(member);
                return true;

            }
        }// while()

        System.out.println(memberId + "가 존재하지 않습니다");
        return false;

    }// removeMember()

    public void showAllMember(){

        for(Member member : treeSet){

            System.out.println(member);

        }

        System.out.println();

    }// showAllMember()


}// class
