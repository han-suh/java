package com.tj703.study;

public class L21Override {
    class A{
        String str="A.str 안녕";
        public int add(int a, int b){
            int add=0;
            add=a+b;
            return add;
        }
    }

    /*
    B b=new B()
    b.str; // "B.str 안녕"
    A a=b;
    a str; // "B.str 안녕" => 동적 디스패치 (X)
    a str; // "A.str 안녕" => 정적 디스패치 (0)

    a.add(10,20); // B.add(10,20) => 동적 디스패치 (X)
    // 이미 B의 add 를 메모리에 저장해서 호출하는 것
    a.add(10,20); // A.add(10,20) => 정적 디스패치 (0)
     */

    class B extends A{
        String str="B.str 안녕";
        // A의 add 가 마음에 들지 않아서 재정의(==Override) 하기로 함
        @Override // 컴파일러가 부모의 함수를 재정의하고 있는지 검사하고 컴파일하게 하는 어노테이션
        // @ 어노테이션 : 컴파일러에게 검사나 자동완성을 시키는 것
        public int add(int a, int b){ // 부모의 add 보다 우선순위를 가지게 된다.
            // public int add(int a, int b, int c) => int c는 부모가 가지고 있지 않아서 어노테이션이 없다고 확인!
            // int add=a+b;
            int add=super.add(a,b); // new A().add(a,b) =>  부모껄 한 번 호출 후 재정의
            System.out.println(add);
            return add;
        }
    }

    public static void main(String[] args) {
        L21Override o=new L21Override();
        B b=o.new B(); // innerClass 수업
        // System.out.println(15,19);
        b.add(30,55);
        System.out.println(b.str); // B.str 안녕   // 부모의 필드 str 을 재정의 / 동적 디스패치
        A a=o.new B(); // == A a=b;
        System.out.println(a.str); // A.str 안녕   // 정적 디스패치
        // A a=b; // 부모의 필드만 필요하지 B의 필드는 필요없음.
        // b가 참조하는 객체가 A로 형변환 했다. (X)
        // b를 참조하던 객체를 타입이 A인 변수 a가 참조했다. (O)
        int add=a.add(33,88);
        // 원래는 A.add(33,88)가 호출되어야 하는데 호출되지 않는 이유는 자바가 동적 디스패지를 이용해 재정의된 add 가 호출되도록 하였다. => 프로그래머의 편의성(유연성,재사용성)을 위해
        // 정적 디스패치 : 컴파일 시점에 함수나 필드의 위치(눈에 보이는 그대로)
        // 동적 디스패치 : 객체를 생성했을 때 할당된 메모리(V-Table)에서 함수나 필드를 호출 (자바에서 함수만...)
        // V-Table(Virtual Method Table) : 객체를 생성하면 정의된 메서드의 주소를 저장하는 목자(index)로 재정의된 함수만 존재한다.(부모의 함수가 존재하지 않음.)
        // V-Table

        // 다형성 : 하나의 이름으로 여러 역할을 하는 객체지향 문법
        // override : 부모와 자식이 같은 이름의 함수를 갖지만 자식이 재정의하면 자식의 함수가 호출된다 => 객체지향 문법의 다형성에 해당
        // 타입 다형성, Overload, Override (면접 질문)
    }


}
