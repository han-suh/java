package com.tj703.study; //클래스를 관리하는 폴더(package : 클래스 명을 유일하게 만들어준다.)
//패키지명을 보통 도메인으로 하는데 도메인은 세상에 하나뿐인 유일한 이름이기 때문에 내부에 존재하는 클래스명 역시 유일한 이름이 된다.

public class L01HelloJava { //클래스 : 객체 테이터의 타입이다.
    // public class : 자바는 문서를 무조건 class 로 만드는데 public class 는 문서명과 같은 class 이면서 외부 라이브러리로도 사용 가능
    public static void main(String[] args){
        // 어플리케이션에 오직 1개만 존재하는 함수로 해당 어플의 실질적인 실행을 명시한다.
        // public : 공유가능, static : 메모리영역, void : 반환하는 것이 없는 함수, (String[]args) : 매개변수로 어플 설정의 초기값
        System.out.println("안녕 자바~!");
    }
}
class User{ //외부에서 사용할 수 없는 class 면서 해당 java 문서에 포함된 class 이다. 하지만 class 문서로 컴파일은 된다.
     }
    // out - production - java_study - com - th703 - study 의 L01HelloJava 에 두 개의 클래스가 존재. => L01HelloJava, User
    // 클래스가 2개 일지라도 실제 문서는 1개이다.
//한 줄 주석
/*여러 줄 주석*/
