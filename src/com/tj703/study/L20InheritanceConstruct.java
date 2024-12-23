package com.tj703.study;

public class L20InheritanceConstruct {
    class A{
        int a;
        A(int a){
            this.a=a;
        } // A를 상속하여 사용할 수 있도록 재정의
    }
    // 이 때 생기는 문제를 해결
    class B extends A{
        int b;
        B(int a, int b){
            super(a); // == new A(10)
            this.b=b;
        }
    }
    class C extends B{
        // C가 B를 상속받았기 때문에 생성자 규칙을 따라야한다. => false
        int c;
        C(int a, int b, int c){ // 생성자 규칙을 따라야 하는거면 (int b)를 작성해야한다.(재정의) => 보통 재정의하기 때문에 위에 말이 맞는 것처럼 보인다...
            // => B 를 객체로 만들기 위해 C의 생성자에서 B의 생성자를 꼭 호출해야한다.
            super(a, b); // super(10,20); 작성해도 무관
            this.c=c;
        }
    }

    public static void main(String[] args) {
        L20InheritanceConstruct o=new L20InheritanceConstruct();
        C c=o.new C(10,20,30);
        System.out.println(c.c); //C.c  => c.c
        System.out.println(c.b); //B.b  => c.super.b
        System.out.println(c.a); //A.a  => c.super.super.a
    }
}
