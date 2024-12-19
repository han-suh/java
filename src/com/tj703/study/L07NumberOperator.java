package com.tj703.study;

public class L07NumberOperator {
    public static void main(String[]args){
        /*
        * js: +, -, *, /, %, **, >>, <<, ~
        * java: +, -, *, /, %, Math.pow(), >>, <<, ~
         */

        int i=10+20;
        i=10-20;
        i=10*20;
        // i=2**5; // 제곱 오류
        i=(int)Math.pow(2,5); // double 로 반환하기 때문에 (int)로 강제 반환  // 거듭제곱은 큰 수이기 때문에 double 로 반환
        System.out.println(i); // 32

        i=10/3;
        System.out.println(i); // 3.3333333 => 3
        // java 는 정수를 정수와 연산하면 무조건 정수를 반환
        System.out.println(10.0/3); // 실수와 정수를 연산하면 실수를 반환
        double d=10/3;
        System.out.println(d); // 3.0 => 정수끼리 연산하면 3이고 그걸 double 에 대입하기 때문에 3.0으로 반환

        i=10%3;
        System.out.println(i); // 1
        i=10%4;
        System.out.println(i); // 2

        // 비트연산
        i=2>>1; // 0010 => 0001
        System.out.println(i); // 1
        i=2>>2; // 0010 => 0000(1)
        System.out.println(i); // 0
        i=2<<2; // 0010 => 1000  // 31 bit
        System.out.println(i); // 8
        i=2<<30; // ** sign bit 까지 이동
        System.out.println(i); // -21474836481
        i=2<<31;
        System.out.println(i); // 0
        i=~0; // 00000000 => 11111111
        System.out.println(i); // -1



    }

}
