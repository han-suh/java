package com.tj703.study;

public class L20InheritanceConstruct {
    class A{
        int a;
        A(int a){
            this.a=a;
        }
    }
    // 이 때 생기는 문제를 해결
    class B extends A{
        int b;
        B(int b){
            super(a);
            this.b=b;
        }
    }
    class C extends B{
        // C가 B를 상속받았기 때문에 생성자 규칙을 따라야한다. => false
        C(){ // 생성자 규칙을 따라야 하는거면 (int b)를 작성해야한다.(재정의) => 보통 재정의하기 때문에 위에 말이 맞는 것처럼 보인다...
            // => B 를 객체로 만들기 위해 C의 생성자에서 B의 생성자를 꼭 호출해야한다.
            super(12);
        }
    }

    public static void main(String[] args) {

    }
}
