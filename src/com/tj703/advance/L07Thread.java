package com.tj703.advance;

import java.util.Scanner;

public class L07Thread {
    public static void main(String[] args) {
        // 스레드 : 일을 하는 단위(일꾼)
        // 모든 프로그램밍 언어는 main thread 1개를 제공 - 메인 스레드를 독점하게 되면 다른 일은 할 수 없게 된다.
        /*final*/ boolean game=true; // 자바를 속이기 위한 작업 => 게임이 언젠가는 false 이 될테니 그다음 코드가 실행 될 수도 있음
        // final 상수 == const : 처음 대입한 데이터를 바꿀 수 없음



        // 자바에서의 스레드 생성 방법
        // 새로 생성된 일꾼이 실행할 콜백함수 정의
        Thread gameThread=new Thread(()->{
            while (game){
                System.out.println("게임 시작");
                String inputStr=new Scanner(System.in).nextLine();
                System.out.println("입력한 글자는 : "+inputStr);
            }
        });


        // 실제 일꾼 생성 run
        gameThread.run(); // 일꾼이 생성되면서 재정의된 runable 콜백함수를 실행


/*        while (game){
            System.out.println("게임 시작");
            String inputStr=new Scanner(System.in).nextLine();
            System.out.println("입력한 글자는 : "+inputStr);
        } // 메인 스레드가 while 에 의해서 무한 반복을 하게 됨으로 그 다음 코드가 실행되지 않음.

 */
        System.out.println("안녕");


        // js 에서 스레드 생성 방법
        // js.window.setInterval(()=>{},1000) : 1초마다 콜백함수를 실행하는 일꾼 생성
        // js.window.setTimeout(()=>{},0) : 1초 뒤에 콜백함수를 실행하는 일꾼 생성
    }
}
