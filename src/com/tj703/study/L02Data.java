package com.tj703.study;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class L02Data {
    public static void main(String[] args) {
        System.out.println(14); // 정수(js 에는 없음)
        System.out.println(14.0); // 실수
        System.out.println("문자열"); // 문자열(자료형)
        System.out.println('a'); // 문자(js 에는 없음)
        System.out.println(false); // 0
        System.out.println(true); // 1
        // System.out.println(null); // null : 비어있음(출력X, js 'null')
        System.out.println(new ArrayList()); // 배열자료형(출력 가능)



        int [] arr={1, 2, 3}; //리터럴하게 표기한 배열자료형(출력X)
        System.out.println(arr); // [I@b4c966a : 객체가 저장된 주소
        System.out.println(Arrays.toString(arr)); // java.util.Arrays : 리터럴하게 표기한 배열의 지원 클래스
        Mem m=new Mem(); //{age:20,name:"나"}
        System.out.println("멤버의 나이는 :"+m.age); // "." : 필드접근자
        System.out.println("멤버의 나이는 :"+m.name);
        System.out.println("멤버의 :"+m); //js와 같은 객체명세서가 없다.(com.tj703.study.Mem@312b1dae)

    }
}

// 동일한 패키지에 같은 이름의 클래스가 2개 존재할 수 없다.
// class User{}

class Mem{ // java의 경우 타입을 꼭 명시!!
    int age=20;
    String name="나";
}