package com.tj703.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class L14AdvanceStudy {
    static final JFrame frame=new JFrame(); // 객체로 존재해야함. => main 의 영역 -> static / 정의를 바로해야함.
    // 1번 작성하면 자동으로 이렇게 작성이 됨.

    class One implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            frame.dispose(); // 지역변수여서 참조 불가. => static final JFrame frame=new JFrame(); 해줘야 가능
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }


    public static void main(String[] args) {
        public static int i=0; //  public final static int i=0; 상수로 만들면 i도 안됨
        // 프레임 생성
        JFrame f=new JFrame();
        f.setBounds(500,500,300,300);


        // 프레임 종료
        // addWindowListener - 창에 대한 버튼을 눌렀을 때 실행되게 콜백함수를 정의할 수 있게 된다.
        // 람다식은 콜백함수가 1개 일 때 가능
        // addWindowListener 은 콜백함수가 여러 개(7개) 여서 람다식 불가.


        f.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override // 1번
            public void windowClosing(WindowEvent e) { // x 버튼을 눌렀을 때
                // frame.dispose(); // frame 에 노란 밑줄 : 불가
                // f=new frame(); // f는 상수다. : 익명클래스를 만들면 지역변수 f를 참조할 수 없기 때문에 f를 익명클래스를 포함한 부모클래스에 static final 로 정의해서 참조할 수 있게 만든다.
                f.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        int num=0;
        JButton upBtn=new JButton("+");
        JLabel label=new JLabel(Integer.toString(num));
        // 액션을 재정의
//        upBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        }); // 재정의하는데 너무 힘들어서 하나의 콜백함수만 전달할 수 있도록 재정의하는걸 간단하게 도와주는 것 => 람다식
        upBtn.addActionListener((e)->{
            // num++; // 지역변수를 참조하면 자동으로 람다식을 생성하는 내부클래스의 부모클래스에 static final(상수) 로 정의되기 때문에
            // ++ 연산은 기존의 데이터를 1 더한 데이터로 바꾸는 연산이기 때문에 할 수 없음.
            // label.setText(Integer.toString(num));
            i++;
            label.setText(Integer.toString(i));

        });
        // 람다식: 하나의 콜백함수만 전달해야하는데 클래스를 재정의하는 것이 불편해서 미리 정의한 클래스를 함수를 매개변수로 쓰는 척하는 문법(문법적 설탕)

        f.add(label);
        f.add(upBtn, BorderLayout.EAST);
        f.repaint();
        f.setVisible(true);

    }
}
