package com.tj703.study;

class SmartThings{
    // 모든 종류의 tv 를 모바일로 자동 조작(모든 종류의 tv 리모콘을 가져와야 한다.)
    // 매소드는 한 개인데 매개변수가 달라서 다르게 동작하는 Overload => 다형성
    public void remotePower(SamsungRemotecon remotecon){
        remotecon.powerBtn();
    }
    public void remotePower(LgRemotecon remotecon){
        remotecon.powerBtn();
    }
    public void remotePower(AppleRemotecon remotecon){
        remotecon.powerBtn();
    }


    public void remoteArrowBtn(AbstractRemotecon remotecon, String arrow){
        remotecon.arrowBtn(arrow); // 방향 작성
    }


    // 타입의 다형성을 잘못 사용한 예
    public void allRemotePower(Object remotecon){ // object 는 모든 타입의 부모여서 모든 타입을 받을 수 있음
        AbstractRemotecon abstractRemotecon=(AbstractRemotecon) remotecon;
        // (AbstractRemotecon(remotecon)).powerBtn();
        // 부모 타입을 참조하던 변수를 자식타입의 변수로 참조하는 것은 강제 형변환(casting)
        // remotecon 가 자식타입인지 부모타입인지 확인할 방법이 없기에 컴파일 된다.
        // 매개변수를 조상으로 작성하면 Casting 형변환 시 오류가 발생할 수 있다.
        // 부득이하지 않는 경우 매개변수의 타입으로 Object 작성을 권장하지 않는다.
        abstractRemotecon.powerBtn();
    }
    /*
    * js 에서의 예 : Object remotecon 와 같은
    * let a=10;
    * Object a=10; // 타입이 없는 경우 => java) int a=10;
    *
    * let date=new Date();
    * date=10; // 실수로 중간에 바꿈
    * date.toTimeLocaleString(); // undefined or 오류 발생
    *
    * const date=new Date();
    * date=10; // const 로 선언했기 때문에 최초에 대입한 값이나 객체를 바꿀 수 없다 => 오류 발생 ==> 오류를 막기 위해 작성
    * date.toTimeLocaleString(); // 실행되지 않음
    *
    * js 에서 각 객체를 참조하는 변수를 상수로 하는 이유: (const 로 선언하는 이유)
    * 동적타입 언어라 없는 필드를 참조하면 오류가 발생하기 때문에 바뀌지 않도록 데이터를 고정한다.
    * => js를 type script(js 를 정적 타입으로 만드는 언어) 로 사용하는 이유
    *
    * Date date=new Date();
    * date=10; -> 컴파일 불가능(타입을 명시하는 정적타입 언어이기 때문)
    * date.getMonth();
    *
    * // 모두 동적타입으로 선언 => Object
    * Object date=new Date();
    * date=10;
    * ((Date)date).getMonth(); // Integer(10) 은 getMonth 메소드가 없기 때문에 실행 중에 오류(심각한 오류)
    */
}

public class L27ParamTypePolimorphism {
    // 매개변수의 타입을 타입의 다향성을 이용해 생산성 높이기
    public static void main(String[] args) {
        SmartThings smartThings=new SmartThings();
        // SamsungRemotecon remotecon=new SamsungRemotecon();
        String remotecon="삼성 리모콘"; // 가짜리모콘 : string 은 AbstractRemotecon 을 구현하는 자식타입이 아니기 때문에 캐스팅 형변환 시 오류 발생 => classCastException
        // 강제 형변환으로 인한 오류
        smartThings.allRemotePower(remotecon);
        // smartThings.remotePower(remotecon);
    }
}
