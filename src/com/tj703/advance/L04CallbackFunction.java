package com.tj703.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Function;

class CallbackBtn{
    public int a=10;
    class Event{

    }
    public void click(){
        this.onclick(new Event());
    }
    public void onclick(Event e){

    } // js 의 button 요소의 타입을 흉내
    public void addEventListener(String event, Function callBackFun){ // addEventListener 경우 여러 개를 정의 가능
//        onclick=function(){
//            onclick();
//            callBackFun();
//        } // java 에서는 불가능
    }
}

// 3. static => 정적 중첩 클래스
// static == 정적
// static clas  : 정적 중첩(내부) 클래스 => 외부의 클래스와 별개로 인스턴스화 가능
// final : 바뀌지 않는 수 static final JFrame frame=new frame;
public class L04CallbackFunction {
    static JFrame frame=null;
    static JButton btn=null;
    static JLabel label=null;
    static class BtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText(label.getText()+"클릭");
        }
    }

    // main 완전히 다른 영역(static) => 2. 클래스의 필드를 사용하려면 인스턴스화(객체 생성) => L04CallbackFunction 을 객체화
    // static : 미리 메모리에 저장해 놓는 것
    // *************
    // static class One

    public static void main(String[] args) {
        L04CallbackFunction o=new L04CallbackFunction();
/*        // 콜백함수 : 정의 시 바로 실행되지 않고 호출 시 실행되는 함수
        // js btn.onclick=function(e){}; // 버튼을 클릭하면 실행되는 콜백함수를 재정의
        // 함수 필드를 다른 함수로 교체 가능(함수형 언어의 특징) => js
        // js btn.addEventListener("click",function(e){});
        // 함수의 매개변수로 함수를 작성 가능(함수형 언어의 특징 => 함수가 타입이기 때문)
        // 객체지향언어 자바는 메서드 필드의 교체가 불가능하고 매개변수로 함수를 작성하는 것도 불가능하다.
        CallbackBtn btn=new CallbackBtn();
        // btn.onclick=function(){};  // 자바에서는 불가능 => 함수 필드를 다른 함수로 교체 불가능
        // btn.onclick=public void onclick(){};  // 자바에서는 불가능
        // btn.addEventListener("click",public void onclick(){});  // 자바에서는 불가능 => 매개변수로 함수를 작성하는 것도 불가능
        btn.a=30; // 가능
*/

        frame=new JFrame();
        // frame.setSize(300,300); // setBounds 를 쓰게 되면 setSize 는 필요없어짐
        frame.setBounds(500,500,300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료
        // jButton btn=new JButton("버튼"); // innertext 와 label 생성
        btn=new JButton("버튼");
        // <html><p id="container><button></></></>
        // container.append(btn);


        frame.add(btn, BorderLayout.NORTH); // add 는 매개변수로 component 를 작성해야 한다. add(Component c) => component 를 부모로 가지고 있어서
        // 상수의 개념 : 바뀌지 않는 수로 저장된 정보를 호출하기 위해 사용됨.

        label=new JLabel("라벨");


        // 2. 외부에서 만든 handler (위치 btn=new JButton("버튼"); 아래) == 3. (위치: label=new JLabel("라벨"); 아래)
        // btn.addActionListener(new BtnHandler());
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("익명클래스의 콜백함수 click");
                // 같은 main 의 자식영역(scope)에서 참조하는 것 같지만 main 의 형제인 class 1에서 label 을 참조하는 중이다.
                // class 1의 부모 class 영역에 static 필드로 정의(컴파일러가)
            }
        });

        // 원래는 이렇게 해야하는데 btn.addActionListener(new BtnHandler()); 가능
        // btn.addActionListener(new L04CallbackFunction.BtnHandler());
        // btn.addActionListener(new L04CallbackFunction().new BtnHandler());


        frame.add(label); // 센터의 경우 작성 안해도 됨


        // 1. 콜백함수 및 익명클래스로 handler
/*        // 버튼을 눌렀을 때 실행 => 콜백함수 정의 및 익명클래스
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String txt=label.getText();
                txt+="\n클릭";
                label.setText(txt);
            }
        }); // Action == click
        // 인스턴스 == 객체
        // ActionListener() 를 인스턴스 해야함 => 바디 구현
*/

        frame.setVisible(true); // 보이게 하는 것

    }
}
