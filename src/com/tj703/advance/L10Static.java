package com.tj703.advance;

public class L10Static {
    static int g=10;
    // static : static 필드(클래스 변수)
    // 필드 : 데이터가 존재하는 영역

    // 메모리 heap 영역 : new A() 인스턴스 객체가 생성되고 저장되는 곳
    // Garbage Collection : 스레기(사용하지 않는 인스턴스 객체) 수집 후 삭제. heap 메모리에서 동작하며 자동으로 메모리를 정리하기 때문에 개발의 난이도가 하락하고 생산성을 올린다.
    // c pointer : c 언어에서 만들어진 객체를 삭제하거나 직접 참조하기 위해 만들어진 것으로 메모리 정리를 위해 객체를 직접 삭제하는 것은 난이도가 높다.
    // 자바 이후에 등장한 대부분의 언어가 heap 메모리 영역을 사용한다.

    // 메모리 method 영역 : main 함수를 실행하면 실행에 필요한 메소드를 저장하는 메모리
    // static 영역이라고도 부르는데 저장된 데이터가 삭제되지 않고 계속 유지됨
    // 변수나 메소드에 static 이라 명시하면 데이터가 클래스로드 시 생성되어 어디서든 참조 가능하다.
    // method 영역에 static 필드가 저장되는 것(method !== static)

    // 메모리 stack 영역 : 스레드(일의 단위)를 생성하기 위해 stack 에 자료를 스케쥴링하고 연산을 하기 위해(cpu 와 ) 자료를 주고 받는 곳
    // StackOverflowError : 실행할 것이 너무 많을 때 생기는 오류

    // PC(Program Count) 레지스터(스레드가 실행 중인 jvm 명령어 위치 추적)
    // Native Method stack 역역 : java 보다 저급언어 c, c++ 메소드가 저장되는 영역으로
    // 클래스로드 : main 함수를 실행할 때 포함하고 있는 class 를 jvm 이 읽고 저장하는 과정으로 이 때 static 필드와 메소드를 저장한다.

    // 자주 사용하고 공유되어야 하며 삭제할 일이 없는 데이터 / main => method
    // 한 번 사용, 공유될 일이 없고 삭제되도 상관 없는 데이터 => heap
    //


    static int i=0;
    public static void recursive(){
        System.out.println("재귀"+(++i));
        recursive(); // 재귀함수 : 나 자신을 호출하는 함수로 사용 권장하지 않음
    }
    public static void main(String[] args) {
/*        boolean b=true;
        for(i=0; i<100; i++){
            new Thread(()->{
                int n=i;
                while (b){
                    String s=new String("안녕"+n);
                    System.out.println(s);
                }
            }).start();
        }*/
        recursive();

    }
}
