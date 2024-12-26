package com.tj703.study;

interface Remotecon{
    // interface 는 간단한 설계도로 구현({body or scope})이 불가능
    // interface 는 외부(public)에서 사용 가능한 기능만 명세 가능
    // 바디가 구현되지 않은 메소드를 추상 메소드라 부른다.
    /**
     * 전원버튼
     */
    void powerBtn(); // public void powerBtn(); 이라고 작성 불필요. public 이 자동 완성
    /**
     * 방향키
     */   // arrowBtn 에 대한 설명 주석 작성 가능 /** */
    int arrowBtn(String arrow);
}

class SmartRemotecon implements Remotecon{
    /**
     * 전원버튼
     */
    @Override
    public void powerBtn() {
        System.out.println("tv 전원");
    }

    /**
     * <p style="color:red">방향키</p>
     * @param arrow "up" ,"down","left","right"
     * @return int 전기적 신호
     */
    @Override  // interface 의 메소드를 재정의하는 것도 Override
    // 엉성하지만 공통된 틀을 제공해서 함수를 굳이 재정의하지 않아도 사용할 수 있게끔해준다 => Remotecon remotecon=new SmartRemotecon();
    // Remotecon remotecon=new Remotecon(); 을 하지 않아도 되는 이유
    public int arrowBtn(String arrow) {
        int arrowBtn=0;
        switch (arrow){
            case "up":
                System.out.println("위로 이동");
                arrowBtn=1;
                break;
            case "down":
                System.out.println("아래로 이동");
                arrowBtn=2;
                break;
            case "left":
                System.out.println("왼쪽 이동");
                arrowBtn=3;
                break;
            case "right":
                System.out.println("오른쪽 이동");
                arrowBtn=4;
                break;
        }
        return arrowBtn;
    }
    // class 는 완성된 타입으로 미완성된 함수로 존재할 수 없기 때문에 꼭 바디를 구현해야한다.
    // implements 해당 class 가 interface 를 구현하겠다고 명시하는 것 => 바디의 구현을 강제(마우스 올려서 메소드 구현)
}




public class L25Interface {
    public static void main(String[] args) { // main => class 의 실제 사용자
        // 개발 디자인 => 추상화!
        Remotecon remotecon=new SmartRemotecon(); // interface 는 타입이 될 수 있다.
        remotecon.powerBtn();  // tv 전원
        remotecon.arrowBtn("up"); // 위로 이동
        String s=new String("안녕");
    }
}
