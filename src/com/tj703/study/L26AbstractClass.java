package com.tj703.study;

import java.util.Scanner;

abstract class AbstractRemotecon implements Remotecon{
    /**
     * 전원버튼
     */
    @Override
    public void powerBtn() {
        System.out.println("전원 on");
    }

    /**
     * 방향키
     *
     * @param arrow
     */
    @Override
    public int arrowBtn(String arrow) {
        System.out.println("위 아래");
        return 0;
    }

    // 추상클래스로 공통된 부분은 구현하고
    // class 마다 다르게 구현해야하는 부분은 구현을 강제할 수 있다.
    abstract void smartBtn();
}


// 추상 클래스는 상속해야한다.
class SamsungRemotecon extends AbstractRemotecon{
    @Override // 생략 가능
    public void smartBtn(){
        System.out.println("삼성 tv");
    }
}
class LgRemotecon extends AbstractRemotecon{
    public void smartBtn(){
        System.out.println("LG tv");
    }
}
class AppleRemotecon extends AbstractRemotecon{
    public void smartBtn(){
        System.out.println("Apple tv");
    }
}


// 인터페이스와 추상클래스를 사용하면 공통된 코드를 재사용 및 구현하기 용이(추상화와 객체지향 문법)
public class L26AbstractClass {
    // interface 뼈대만 있는 설계도(청사진), 명세서 : (public) 추상메소드만 작성
    // abstract class 뼈대, 더 정확하게 설명되어 있는 설계도 : 메소드와 추상메소드 모두 작성 가능
    // class 건물, 완벽한 설계도 : 메소드만 작성 가능
    public static void main(String[] args) {
        // 추상클래스와 인터페이스는 둘 다 추상메소드를 포함하는 설계도이기 때문에 객체가 될 수 없다.
        // 추상메소드가 없는 클래스만 객체가 될 수 있다.
        // AbstractRemotecon remotecon=new AbstractRemotecon();
        // Remotecon remotecon=new Remotecon();



        //
        // main smartTings => 삼성 Lg Apple 리모콘을 핸드폰으로 조작
        SamsungRemotecon samsungRemotecon=new SamsungRemotecon();
        LgRemotecon lgRemotecon=new LgRemotecon();
        AppleRemotecon appleRemotecon=new AppleRemotecon();
        // 변수가 3가지이기 때문에 3가지 방식으로 리모콘 자동 조작 코드를 작성해야한다. => 변수가 통일되지 않았기 때문
        appleRemotecon.powerBtn();
        lgRemotecon.powerBtn();
        samsungRemotecon.powerBtn();



        // 타입의 다향성을 이용해 코드의 생산성을 높이는 방법 2
        // 타입의 다형성으로 변수를 작성하는 경우
        AbstractRemotecon remotecon=null;
        String input=new Scanner(System.in).nextLine();
        if(input.equals("samsung")){
            remotecon=new SamsungRemotecon();
        }else if(input.equals("LG")){
            remotecon=new LgRemotecon();
        }else if(input.equals("Apple")){
            remotecon=new AppleRemotecon();
        }else{ // 예외 처리 한 방법
            System.out.println("잘못된 입력입니다.");
            return; // main 함수 종료
        }

        // remotecon 변수는 3개의 객체 중 하나를 참조
        remotecon.powerBtn();
        remotecon.arrowBtn("up");
        remotecon.smartBtn();



        // 타입의 다향성을 매개변수로 이용해 코드의 생산성을 높이는 방법 2
        // => L27ParamTypePolimorphism
    }
}
