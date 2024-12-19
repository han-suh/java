package com.tj703.study;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class L15ArrayList {
    public static void main(String[] args){
        // 자바의 배열
        // 1. [] Array : 가볍고 심플하게 정의되어 길이를 수정할 수 없고 타입이 명확한 배열 타입(자료형)
        // 2. ArrayList, LinkedList ... : pop->remove, push->add 처럼 배열의 길이를 수정할 수 있고 배열의 처리를 지원하는 함수가 다수 존재하는 배열 타입


        // 1. [] Array
        int [] numArr={11,22,33}; // Array

        // 1-1. 인덱스 데이터 변경 가능
        numArr[1]=222;
        System.out.println(numArr[1]); // 배열의 특정 인덱스의 데이터를 바꾸는 것은 가능!!
        System.out.println(numArr);

        // 1-2. 길이 수정 불가 - index[4], push
        // numArr[3]=444; // Array Index Out Of Bounds Exception => 배열 색인이 범위를 벗어났습니다.
        // index : 순서, 색인(목자)
        // 배열 길이를 벗어난 것츨 참조(대입)할 때 오류 발생
        // numArr.push(444);


        // 2. ArrayList
        ArrayList numList=new ArrayList();
        numList.add(11);
        numList.add(22);
        numList.add(33); // 리터럴하게 값을 대입할 수 없다.
        // == js : numList.push(44);
        // == java : numList.add(44);
        // push == add : 배열의 마지막에 값을 추가하는 것
        // pop : 배열의 마지막 값을 빼는 것
        System.out.println(numList); // Object.toString 을 재정의

        // 2-1. 인텍스 추가(길이 수정)
        numList.add(44);
        System.out.println(numList); // [11, 22, 33, 44]
        numList.add(1,100); // 특정 인덱스에 데이터 추가
        System.out.println(numList); // [11, 100, 22, 33, 44]

        // 2-2. 인텍스 삭제(길이 수정)
        numList.removeLast(); // ==pop ()
        System.out.println(numList); // [11, 100, 22, 33]
        numList.remove(1); // 특정 인덱스 데이터 삭제
        System.out.println(numList); // [11, 22, 33]
        numList.remove(Integer.valueOf(22)); // 특정 데이터를 찾아서 삭제
        System.out.println(numList); // [11, 33]


        // 3.
        ArrayList<Integer> objNumList=new ArrayList<>(); // <Integer> : 강제로 Integer 형변환 하겠다는 의미
        objNumList.add(Integer.valueOf(11));  // objNumList.add(11) : 자동형변환
        objNumList.add(Integer.valueOf(22));
        objNumList.add(Integer.valueOf(33));
        System.out.println(objNumList); // [11, 22, 33]

        // 3-1. 인텍스 삭제(길이 수정)
        objNumList.remove(Integer.valueOf(22)); // 특정 데이터를 찾아서 삭제
        System.out.println(objNumList); // [11, 33]


        // 동등비교연산
        Integer objInt=Integer.valueOf(22);
        Integer objInt2=Integer.valueOf(22);
        // System.out.println(objInt);
        System.out.println(objInt==objInt2); // true
        System.out.println(objInt.equals(objInt2)); // true => 기본형 비교 확인
        // System.out.println(objInt.intValue()==objInt2.intValue());
        // 기본형 랩퍼클래스는 동등 비교 연산 시 기본형을 반환해서 비교
        // == 동등비교연산은 자료형은 할 수 없기에 랩퍼클래스 대신 기본형으로 반환해서 자동으로 연산(비교)을 진행


        // 4. 문자열 배열
        // ArrayList strList=new ArrayList(); // object
        ArrayList<String> strList=new ArrayList(); // string
        strList.add("자바");
        strList.add("자바스크립트");
        strList.add("파이썬");
        strList.add("스프링");
        System.out.println(strList); // [자바, 자바스크립트, 파이썬, 스프링]

        // 4-1. 문자열 배열 삭제
        strList.remove("파이썬");
        System.out.println(strList); // [자바, 자바스크립트, 스프링]


        // 5. ArrayList 의 내부 반복문 : 함수(callback func)를 반복 실행할 함수(forEach)를 제공
        // int i=0; => 불가!!!
        AtomicInteger i=new AtomicInteger(0); // == int i=0;

        // 5-1. 화살표함수
        // 자바의 람다식 : ()->{}
        strList.forEach((item)->{
            System.out.println(item); // 자바 , 자바스크립트, 스프링  // index 를 제공하지 않음
            // System.out.println((i++)+":"+item); => 불가!!!
            System.out.println((i.getAndIncrement())+":"+item); // 0:자바  1:자바스크립트  2:스프링    // == i++
        });


        // 6. 외부반복문
        // 모든 배열 객체는 Iterable 하다. => iterator 반복문 사용 가능
        // js 에서 for(let str of strList){}
        int n=0;
        for(String str : strList){
            System.out.println((n++)+":"+str); //  0:자바  1:자바스크립트  2:스프링
        }



    }
}
