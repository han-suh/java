package com.tj703.advance;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class L02AnonymousClass {
    public static void main(String[] args) {
        Frame frame=new Frame("익명클래스");
        // 인터페이스나 추상클래스는 사용 불가
        WindowListener windowHandler=new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }; // WindowHandler class 와 동일한 구조의 익명 클래스(1,2,3... 임의의 수)가 생성됨.
        // L02AnonymousClass.class
        // $ : 내부 클래스
        // 1: 익명 클래스(interface 나 abstract class 를 객체로 만들 때 자동 생성된 익명 클래스의 이름)

        // {} =>
        // new AbstractClass(){};
        // new Interface(){};
        // 익명의 클래스를 만들어서 그것을 구현하는 클래스를 객체로 생성하겠다.
        frame.addWindowListener(windowHandler);
        // frame.addWindowListener((e)->{}); // lambda 식

    }
}
