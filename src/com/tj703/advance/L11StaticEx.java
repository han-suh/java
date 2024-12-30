package com.tj703.advance;

class StaticTest{
    public int a=10; // 절대 혼자서 그냥 호출되지 않음. 컴파일 자체도 안됨
    public static int b=20; // main 이 실행되는 동시에 클래스가 로드되는 시점에 객체로 생성됨

    public void add(){
        System.out.println(a+b); // a는 객체면 호출, b는 언제든 호출
    }

    public static void staticAdd(int a, int b){
        // System.out.println(a+b); // static 을 작성하면 a를 사용 불가
        // a는 StaticTest 가 객체가 되었을 때만 존재하기 때문에 main 이 실행될 때 객체로 생성되는 static 필드에서는 호출될 수 없다.
        // 변수로 a, b를 받아서 호출
        System.out.println(a+b);
    }
}


public class L11StaticEx {// main 의 이름이 필요해서 존재하는 class
    public static void main(String[] args) {
        System.out.println(StaticTest.b); // 호출할 때 변수 앞에 클래스명을 작성해서 클래스 변수라고도 한다.

        // System.out.println(StaticTest.a); // => 객체로 만들어서 호출
        System.out.println(new StaticTest().a); // 자료형, 인스턴스 객체의 필드
        System.out.println(new StaticTest().b); // com. tj703.advance. StaticTest. b == StaticTest.b : 참조를 하고는 있는데 실제로는 static 필드를 참조하고 있음.
        // static 필드롤 객체로 참조할 수 있지만 실제로는 static 필드를 참조한다. 객체로 참조했다면 수정하는 것을 권장한다.

        StaticTest.staticAdd(20,55); // 75 : 20+55
        new StaticTest().add(); // 30 : 10+20 // 인스턴스 객체의 필드
    }
}
