package com.tj703.study;

public class L08BooleanOperator {
    public static void main(String[]args){
        /*
        비교연산자
        * js: ==, !=, !, >, <, >=, <=, ===(형변환 없이 완전히 동등한지 비교), !==
        * java(동등 비교 시 자동형변환이 없다.) : ==, !=, !, >, <, >=, <=
         */

        int i=1;
        System.out.println(i==1); // true
        System.out.println(i!=1); // false
        System.out.println(i>0); // true
        System.out.println(i<0); // false

        // System.out.println(!i);
        // js 1 ==> true ==> !true ==> false
        // !"문자열" => boolean("문자열") ==> !true
        // boolean 만 !(not) 연산을 사용할 수 있다.
        System.out.println(!(i==1)); // false

        boolean b=true;
        // b=(boolean)0; // java는 정수를 boolean으로 바꿀 수 없다.


        // ** 어려운 이야기지만 면접!
        // ** 자바에서는 자료형은 동등비교를 할 수 없다. 무조건 false(완전히 동등한 객체를 비교하지 않는 이상)
        Object o=new Object();
        Object o2=new Object();
        System.out.println(o==o2); // false
        System.out.println(o==o); // true
        String s="안녕"; // {'안','녕'}
        String s2="안녕";
        System.out.println(s==s2); // true
        // 리터럴하게 선언된 문자열은 기본형 데이터처럼 똑같은 문자열이 존재하면 그것을 참조한다
        // ** 자주 사용하기 때문에 매번 새롭게 만들면 메모리에 부담이 가기 때문

        // ***** 예외!!
        // 통신을 하는 상황에서는 똑같은 문자열을 참조하기 힘들기 때문
        // 메모리에 데이터가 너무 많음
        // => 종종 새롭게 만들어진다.
        String s3=new String("안녕"); // {'안','녕'} 통신으로 받아온 데이터를 문자열로 생성(전제)
        System.out.println(s==s3); // false
        // 때문에 문자열을 ==가 아닌 equals 를 사용해야 한다. (js는 무조건 ==로 비교하고 equals 가 없다)
        // equals : 자료형의 필드를 비교해서 이정도면 같다고 볼 수 있지 않나라는 결과를 boolean 으로 반환
        // 쌍둥이(유전 정보가 99.9% 같다.)
        // equals 정의 :  유전 정보가 대충 90%이상 같은 존재야~ => true
        // == : 완전히 같지 않는 이상 무조건 false
        System.out.println(s.equals(s3)); // true {'안','녕'}.equals({'안','녕'}) => 인덱스별 들어간걸 비교 String.equals

        // 자바의 문자열은 자료형인가요? 자료형
        // 자바의 문자열을 동등비교할 수 있나요? 자바의 문자열은 기본형이 아닌 자료형이여서 동등비교할 수 없지만 기본형처럼 데이터를 취급하기 때문에 동등비교해서 true 라는 값을 반환할 때가 많다.
        //                                 하지만 자료형이기 때문에 equals 로 비교하는 것이 맞다.


        // 기본형(수)의 동등비교
        // 값을 크기를 비교(랩퍼클래스일지라도)
        System.out.println(10==10.0); // true
        i=10;
        double d=10.0;
        System.out.println(i==d); // true

        Integer objI=new Integer(10);
        Integer objI2=10;
        System.out.println(objI==objI2); // false => true 일 때야 랩퍼클래스 동등비교연산...
        // 랩퍼클래스로 객체를 생성해도 랩퍼클래스의 동등비교연산은 값으로 연산한다.
        System.out.println(objI.intValue() == objI2.intValue()); // true

        Integer objI3=10;
        Integer objI4=10;
        System.out.println(objI3==objI4); // true





    }
}
