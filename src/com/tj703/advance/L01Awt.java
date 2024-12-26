package com.tj703.advance;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class L01Awt {
    class WindowHandler extends WindowAdapter{
        @Override
        // 종료 버튼을 누룰 때 콜백함수
        public void windowClosing(WindowEvent e) {
            System.exit(0); // JVM 을 실행하고 있는 콘솔을 종료
        }
    }
    public static void main(String[] args) {
        L01Awt o=new L01Awt();
        Frame frame=new Frame("자바의 GUI AWT"); // frame 이름 작성 가능
        frame.addWindowListener(o.new WindowHandler()); // frame 종료 버튼 활성화 => new 로 명시 불가 => type 을 위해서 class 명시 => new 가능
        // java : 객체지향언어로 객체나 기본형 데이터만 매개변수로 작성할 수 있다. -> o.new WindowHandler()를 해야하는 이유
        // => 함수는 데이터가 아니기 때문에 매개변수로 사용할 수 없고 타입을 객체로 만들어야 함수를 매개변수로 전달할 수 있다.

        // js : 함수가 타입인 함수형 언어이기 때문에 함수를 매개변수로 작성할 수 있다.
        // => 객체에 명시된 함수를 교체할 수 있다.
        // js 에서 이벤트를 할 때 사용하는 것과 유사


        frame.setSize(200,200);
        frame.setLocationRelativeTo(null); // null : 모니터를 기준으로 중간에 위치
        frame.setVisible(true); // setVisible : 윈도우가 모니터에 출력되는 모드
    }
}
