package com.tj703.advance;

import java.awt.event.ActionListener;
import java.util.function.Function;

public class L06Lambda {
    public static void main(String[] args) {
        // 람다식은 함수를 타입(객체)처럼 사용할 수 있게 하는 문법적 설탕
        // (매개변수1, 매개변수2, ...) -> { 실행할 코드 }
        // 람다식은 익명클래스로 만들어진 객체 => 함수형언어처럼 사용할 수 있게 하기 위해서(간결성, 함수와 메소드 객체 취금, 콜백함수 및 이벤트처리 유용)
        Runnable fun=()->{};
        Function<Integer,Integer> fun2=(a)->{return a*10;};
        // Function<Integer: 매개변수의 타입,Integer: 반환값의 타입>
        fun2=a->a*10; // {} body 를 생략하면 자동으로 반환된다.

        fun=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 매개변수와 리턴이 없는 함수 run");
            }
        };
        fun=()->{
            System.out.println("안녕 람다식");
        }; // 위에 코드와 같다 : 함수를 객체로 만드는 것이 아니라 코드를 자동 완성해줘서 객체처럼 사용할 수 있게 해주는 것
        // 함수형 언어는 fun=()->{}; 자체가 객체가 된다.
        ActionListener fun3=(a)->{}; // 매개변수 꼭 작성.
        // fun3=new
    }
}
