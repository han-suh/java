package com.tj703.study;

public class L03Variable {
    public static void main(String[] args) {
        // 선언할 때 타입을 명시 해야한다
        // 소문자로 작성하는 모든 타입은 기본형
        // java 는 숫자 데이터만 기본형으로 명시
        // js 변수 : let or var
        // java 변수 : 타입을 명시하고 이름
        System.out.println(13*13); // 일반적으로 변수가 등록되지 않은 데이터는 선언할 때마다 새롭게 만든다.
        int i=13; // int i : 변수 i는 Integer 만 참조하겠다.
        System.out.println(i*i); // 변수로 등록된 데이터는 매번 참조해서 사용한다.(재사용성)

        Integer iObj=13; // == new Integer(13)

        boolean t=true;
        // System.out.println(t+t); // js 에서는 true 가 1로 계산이 되었지만 java 에서는 오직 숫자 타입만 수학적 연산이 가능

        char c='r';
        System.out.println(c+c); // char 는 인코딩 번호이기 때문에 숫자로 취급 가능
        // int, boolean, char => 정수

        // 실수는 double
        double d=13.3; // 8byte 실수
        System.out.println(d);
        System.out.println(d*d);

        float f=13.3f; // 4byte 실수

        // i=13.3; // 오류
            // java 는 컴파일 시 오류가 발견되면 실행되지 않기 위해 class 문서로 컴파일하지 않는다.(컴파일이 오류를 예방)
            // 변수가 선언된 타입으로 데이터를 참조할 수 있다.

        // = : 대입, 참조연산자
        // int i=33.3; => 1) 33.3 데이터를 자바가 생성 -> 2) 타입이 int 인 i가 만들어짐 -> 3) 33.3을 i가 참조

        // System : 콘솔과 관련된 자료형 데이터
        // . : 필드접근자로 객체에 소속된 자료를 참조할 수 있다.
        // out : 시스템에 필드(소속된)로 출력과 관련된 데이터
        // println : out(PrintStream) 의 함수로 콘솔에 문자열을 출력 실행한다.
        // 함수 : 실행하는 무언가!


        // 데이터의 종류
/*         * 기본형(정수(boolean, char), 실수), 자료형(필드가 존재하는 데이터)
           * 자료형(배열(index, length), 객체(필드, 메소드))
 */
        // js 기본형 (실수(number), 문자열(string), Symbol, Boolean, null, undefined, BigInt)

    }
}
