package com.tj703.advance;

import javax.swing.*;
import java.awt.*;

interface ConstInterface{
    // 추상메소드만 작성 가능

    int a=10; // 인터페이스는 객체가 될 수 없기 때문에 필드도 정의할 수 없다.

    // 때문에 자동완성으로 static 필드를 정의하는데 보통 static 필드로 공유되는 자원은 상수이기 때문에 public final static 을 작성해준다.
    public final static int b=20;
    double PI=3.142154635413621; // 앞에 자동으로 public final static 가 작성되는 것

    void add(); // == public abstract void add() (앞에 작성되는 것과 같이 작동됨)
}

final class Math{
    int a=10;
    public final static double PI=3.142145678135486456;
    private Math(){} // 작성 시 객체 생성을 막을 수 있음 // private void Math(){} 는 가능. void 가 함수
    // static 필드만 갖는 클래스는 객체 생성을 막을 수도 있다.
}

public class L13Constant2 {
    public static void main(String[] args) {
        // Integer 의 경우도 객체 생성 불가
        // Integer objI=new Integer(13);


        // System.out.println(14*14*new Math().PI);
        // System.out.println(31*31*new Math().PI);
        // System.out.println(31*2*new Math().PI);
        // PI를 호출하기 위해서 객체를 만들어서 호출하는 것은 메모리에 부담이 된다.
        System.out.println(Math.PI*8*8); // 객체를 만들 필요가 없음
        // Math.PI=4.14; // 값 변경 시도 => 불가
        // com.tj703.advance.Math.PI


        JFrame frame=new JFrame();
        frame.add(new JButton("버튼"), BorderLayout.SOUTH);
        // BorderLayout.SOUTH : 상수의 진정한 사용 목적


        // 반지름이 2인 원의 넓이 2*2*3.14*****
        System.out.println(2*2*Math.PI);
        // PI 를 상수로 정의했기 때문에 바꿀 수 없다. => **공유되는 약속된 자원을 정의할 때는 꼭 final 상수로 정의한다.(바꿀 수 없게)
        // PI 와 같은 상수를 정의할 때 규칙 => public static final
        // 자주 공유되는 자원은 static 필드로 정의해서 객체 생성을 하지 않아도 되게 한다.
        // public 접근지정자를 사용해야 공유되고 사용될 수 있다.(누구나)


        System.out.println(java.lang.Math.PI*8*8);
        // 같은 이름인 상황
        // 패키지명을 도메인으로 사용하기 때문에 주민번호처럼 사용된다.


    }
}
