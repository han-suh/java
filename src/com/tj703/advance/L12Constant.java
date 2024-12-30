package com.tj703.advance;

class ConstTest{
    int a;
    int b; // 바뀌는 것은 소문자
    // final int c; // 필드는 상수의 초기값을 지정해야한다.
    final int C=30; // 개발자간의 약속으로 상수의 이름은 변수와 구분하기 위해 대문자 스네이크 문법을 사용
    final String SAY_HELLO="안녕"; // sayHello(카멜) SayHello(파스칼)
    // say-hello html class 이름 작성법 : 권장하지 않는다. // html 에서는 -가 마이너스 연산의 예약어가 아님
    // String say-hello="안녕"; // - 마이너스 연산의 예약어이기 때문에 사용 불가

    // const obj={}  // js가 동적 타입으로 변수의 객체를 참조하기 때문에 상수로 처음 대입한 것을 바꾸지 않고 사용
    // let obj={}
    // obj="안녕";
    // obj.a=10;
    Object obj=new Object();
    String str="잘가";
    public void L12Constant() {
        obj="안녕";
        obj=10; // Integer.valueOF(10)
        // str=20;
        // 자바는 타입이 명확한 언어이기 때문에 상수를 무분별하게 사용할 일이 없다.
    }
}

public class L12Constant {
    public static void main(String[] args) {
        // const let a=10;
        final int a=10;
        // a=20; // 처음 대입한 값을 다른 것으로 바꿀 수 없는 것을 변수X 상수O
        final ConstTest ct=new ConstTest(); // ConstTest ct=new ConstTest(); => final 로 상수 지정
        ct.a=10; // 대입 가능 => 내부적 필드 변경 가능
        // 상수의 정의는 참조하는 것의 전체가 바뀌지 않는 것을 의미한다.(필드 변경 가능)
        // ct=new ConstTest(); // 상수이기 때문에 전체 변경 불가
        final String s; // 지역변수는 상수의 초기값을 비워둘 수 있다.
        s="안녕"; // 함수에서 지역 변수는 이 때부터 s의 값 변경 불가.
        // s="잘가";
    }
}
