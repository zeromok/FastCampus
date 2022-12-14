package JCF.HashSet;

import java.util.HashSet;

public class Member extends HashSet {
    // Member 를 JCF 로 관리 해보자

    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

    public Member(int memberId, String memberName){ //생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {  //
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString(){   //toString 메소드 오버로딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }


    // HashSet : Set 의 구현클래스
    // HashSet 을 사용하기 위해(중복을 제거하기 위해) 오버라이드 해서 설정해줘야 한다.
    /*
        HashSet 은 객체를 저장하기 전에 hashCode() 를 호츨해서 해시코드를 얻어낸다, 그리고
        이미 저장되어 있는 객체들의 해시코드와 비교한다. -> equals()
    */
    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Member) {

            Member member = (Member) obj;

            if (this.memberId == member.memberId) {

                return true;

            } else {

                return false;

            }// if - else

        }// if

        return false;

    }// equals()


    @Override
    public int hashCode() {

        return memberId;

    }// hashCode()


}// class
