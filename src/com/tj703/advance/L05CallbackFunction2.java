package com.tj703.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ClickGameFrame extends JFrame {
    // JFrame frame=null;  // 필드로 프레임을 가지는 방법 => 하면 frame=new frame("클릭게임프레임"); / frame.setSize(400,400); 로 작성 가능


    JButton northBtn;  // =null 자동으로 대입
    JButton southBtn; // 초기화 버튼
    JLabel label; // 객체로 만들어서 this 에 대입


    // 생성자 재정의
        // 내가 필드로 프레임을 가져도 되고
        // 선택) 자신이 프레임을 되어도 됨
    // static class 1 implements ActionListener{} => northBtn handler 가 만들어지는 것
    public ClickGameFrame(){
        // frame=new frame("클릭게임프레임");
        super("클릭게임프레임"); // 프레임 제목. this 안됨.


        // btn, label 객체화
        northBtn=new JButton("클릭");
        southBtn=new JButton("초기화");
        label=new JLabel("라벨");


        // northBtn handler => 콜백함수로 정의해서 한 번만 사용
        northBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text= label.getText();
                text+="클릭 완료";
                label.setText(text);
            }
        });

        // southBtn handler
        // southBtn.addActionListener(new ResetBtnHandler());


        // 자바도 함수형 언어처럼 매개변수를 함수로 보낼 수 있음을 문법적 섩탕으로 보여줌. 코드를 간단하게 작성할 수 있음을 보여주기 위해서 => 람다식
        southBtn.addActionListener((e)->{
            label.setText("");
        });
        // 자바에서 콜백함수를 정의해서 매개변수를 쓰려면 코드가 길고 복잡하다 => 익명클래스 사용 => 그럼에도 길다 => jvm->문법이 다른 코틀린
        // 그래서 나온 것이 람다식


        // this 에 대입
        this.add(northBtn, BorderLayout.NORTH);
        this.add(southBtn, BorderLayout.SOUTH);
        this.add(label, BorderLayout.CENTER);


        this.setSize(400,400); // super.setSize(400,400); 도 가능
        this.setLocation(700,500);
        // this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    // 내부클래스로 자주 사용할 southBtn handler 정의
    class ResetBtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText(""); // 초기화
        }
    }

}

public class L05CallbackFunction2 {
    public static void main(String[] args) {
        new ClickGameFrame(); // 생성만 하면 화면에 프레임이 뜨게 작성
    }
}
