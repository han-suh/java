package com.tj703.study;

import java.util.Date;

public class L05ReferenceType {
    public static void main(String[]args){
        // 참조형 데이터(==자료형 데이터, 객체)
        Object o=new Object(); // 자료형을 생성하는 방법
        // new 연산자 : 자료형 데이터(객체)를 생성하는 연산자
        // Object() : Object 타입(class)의 생성자
        // new 연산자로 생성자를 호출 => 객체 생성
        // Object o : o 변수가 참조하는 타입이 Object 객체다.


        // 객체는 꼭(!) 필드가 존재한다. : 참조형, 자료형의 뜻은 필드가 존재하는 데이터이다.
        // . : 필드접근자

        System.out.println(o.toString()); // java.lang.Object@b4c966a
                                        // @b4c966a 메모리 주소에 저장된 Object 자료형 데이터
        // 모든 자료형은 Object 를 부모로 가지고 있다 => 모든 자료형은 object type를 가지고 있다.
        // Object.toString() : 해당 데이터를 설명하기 위해 존재

        Object o2=new Object();
        System.out.println(o.equals(o2)); // false
        // Object.equals(자료형) : 자료형간의 비교를 위해 존재(재정의하지 않으면 무조건 false)


        // 문자열
        // 자바에서 대표적인 자료형 데이터
        String str=new String("안녕");
        str="안녕";
        // 자바에서 문자열은 리터럴 표기법을 지원한다.
        // ** 데이터가 리터럴하지는 않다.
        System.out.println(str.toString());
        System.out.println(str); // java.lang.String@eef123 => "안녕"(String Object.toString() 재정의 했다)
        // toString() : 생략 가능(물결 표시)
        System.out.println(str.equals("안녕")); // true
        System.out.println(str.equals("잘가")); // false
        // Object(부모) 를 포함하는 String(자식) 에서 equals() 재정의해서 비교연산이 가능

        str="hello";
        System.out.println(str.toUpperCase()); // HELLO   //원본을 바꾸지 않는다.
        System.out.println(str); // hello
        System.out.println(str.charAt(1)); // e   // 문자열은 배열이기 때문에 index 를 참조할 수 있다.
        System.out.println(str.length()); // 5


        // js 자료형 데이터인데 리터럴표기법을 지원하는 것 : {key:value}, [1,2,3]

        // 순서(index)와 길이가 존재하는 자료 : 배열
        int [] arr={1,2,3}; // 배열자료형을 리터럴하게 표기
        String [] strArr={"자바","웹앱","마스터"};
        System.out.println(strArr[0]); // 자바
        System.out.println(strArr[1]); // 웹앰
        System.out.println(strArr[2]); // 마스터
        System.out.println(strArr.length); // 3

        Schedule s=new Schedule("");
        // js 는 매개변수를 생략하면 undefined 가 되지만
        // 자바는 매개변수를 생략할 수 없다.(강제)
        System.out.println(s.name);
        System.out.println(s.date);
    }

}
    // 객체의 타입을 정의하는 방법
    class Schedule{
        // 필드 정의
        Date date=new Date();
        String name="객체 이름";
        public Schedule(String name){ // 생성자
            this.name=name; // 필드를 초기화(재정의)
        }

        // class 의 전체 영역({}중괄호, scope 의 제일 밖)에 변수 선언

        // constructor(name){
        //      this.date=new Date();
        //      this.name=new name;
        // }
    }