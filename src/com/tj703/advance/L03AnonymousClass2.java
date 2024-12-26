package com.tj703.advance;
interface A{
    void test(); // 추상메서드(미완성된 설계도)
}

public class L03AnonymousClass2 {
    // L03AnonymousClass2$Aable.class
    class Aable implements A{ // 컴파일러가 1,2,3,4... 클래스를 생성
        // 추상메서드를 가질 수 없음. 미완성된 것을 class 는 가질 수 없기 때문
        @Override
        public void test(){ // 구현을 해야한다 => A a=new A(){};

        }
    } // 자주 쓸 것은 class 로 정의해서 재사용
    public static void main(String[] args) {
        // 인터페이스(interface), 추상클래스(abstract class) : 미완성된 설계도여서 구현이 덜 된 추상메서드가 있어서 객체가 될 수 없다.
        // 클래스 : 완성된 설계도
        // A a=new A();
        A a=new A(){
            @Override
            public void test(){ // $1.class 에 정의되며 생성과 동시에 메서드를 구현

            } // 한 번 쓸 것(재사용 없음) 익명클래스로 사용
        }; // 객체 생성  // 컴파일러가 아래의 과정을 대신한다. 이 때 Aable 의 이름은 임의의 숫자가 되고 임의의 숫자 클래스를 익명 클래스라고 한다.
        // 실행을 하게 되면 out 이라는 폴더에 임의의 클래스가 생성된다. => L03AnonymousClass2$1.class

        // 익명클래스는 생성과 동시에 구현되는 메소드가 재사용 될 가능성이 없을 때 정의한다.
        // 익명클래스의 장점 :메소드를 매개변수로 작성하기 위해 매번 클래스를 작성할 필요가 없다. => 코드 생산성 상승
        // **주의! 여러 번 사용될 함수를 정의할 때는 클래스를 작성하고

        L03AnonymousClass2 o=new L03AnonymousClass2();
        A a2=o.new Aable();
    }
}
