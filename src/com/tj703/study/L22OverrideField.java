package com.tj703.study;

public class L22OverrideField {
    class A{
        int a=10;

        @Override
        public String toString(){
            return "A";
        }
    }
    class B extends A{
        int a=20; // a가 재정의
    }
    class C extends B{
        int a=100; // a가 다시 재정의

        @Override
        public String toString(){
            return "클래스 C이다.";
        }
    }

    // main L22OverrideField 에 존재하지 않는 별개의 영역(static)
    public static void main(String[] args) {
        L22OverrideField o=new L22OverrideField();
        A a=o.new C();
        System.out.println(a.a); //10   // 정적 디스패치
        System.out.println(a); // == a.toString()  //Object.toString()
        //com.tj703.study.L22OverrideField$C@1d81eb93  => 클래스 C이다.
        // C toString 재정의(Override) 했기 때문에 동적 디스패치로 재정의된 것을 호출
        // 변수 a가 참조하는 객체를 C 타입의 변수가 참조하고 그 변수에 필드 a를 호출
        // casting => 필드의 범위를 늘려서..
         C c=(C)a;
         System.out.println(c.a);
         Object objC=c; // 자식타입의 객체를 부모타입의 객체로 참조하는 것은 자연스럽다.
        // 부모타입으로 참조하던 변수를 자식타입으로 참조하는 것은 위험하다.
        // String s=(String)a; // 이전버전의 컴파일러가 오류를 찾지 못했다. -> 위험

    }


}
