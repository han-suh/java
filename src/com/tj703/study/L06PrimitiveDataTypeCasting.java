package com.tj703.study;

public class L06PrimitiveDataTypeCasting {
    public static void main(String[]args){
        // 기본형 데이터의 형변환
        int i=10;
        System.out.println(i); // 10
        double d=1; // 10이 double 로 형변환
        // 4byte 로 표현 가능한 수가 8byte 로 표현 가능한 수로 변환하는 것은 아무런 이상이 없다.
        // ** 실수는 지수부가 존재하기 때문에 정수타입이 표현하는 데이터보다 훨씬 크기 때문에 아무런 문제가 없다.
        System.out.println(d); // 1.0
        System.out.println(i); // 10
        d=13.415;
        System.out.println(d); // 13.415
        // i=d; // 컴파일 시 발견되는 오류
        System.out.println(Integer.MAX_VALUE); // int 로 작성할 수 있는 가장 큰 수  2147483647
        // i=3147483647; // jvm 은 정수를 21억 이상 표기할 수 없다.(표기와 대입 둘 다 불가능)
        // i=3147483647L; // 21억 이상 작성 시에는 long 의 정수를 표기한다고 명시해야한다.(대입 불가능)
        System.out.println(Double.MAX_VALUE); // 1*(10*308)  (1.7976931348623157E308)
        // double 15개의 지수부 -308 ~ 308
        // float 7개의 지수부
        System.out.println(Float.MAX_VALUE); // 3.4028235E38

        long l=1; // int 정수를 l에 대입
        // l=1E11; // 실수표기법
        // l=1E11L; // 실수표기법 X
        l=10000000000L;
        System.out.println(Long.MAX_VALUE); // 3.4028235E38
        // l=9223372036854775807; // 992경 보다 큰 정수를 표기할 수 없다.

        float f=9223372036854775807.0F;
        d=9223372036854775807.0;


        // 자바는 정수를 리터럴하게 표기하면 int 로 작성된다.
        // 자바는 실수를 리터럴하게 표기하면 double 로 작성된다.
        // 자바에서 21억보다 큰 정수를 리터럴하게 표기하려면 정수 끝에 l을 붙여서 long 타입 정수임을 명시해야 한다.
        // 자바에서 4byte 의 작은 실수를 리터럴하게 표기하려면 실수 끝에 f를 붙여서 float 타입 실수임을 명시해야 한다.


        System.out.println(f);
        // 9223372 036854775807.0 => 9.223372E18
        // 9.223372 : 가수부
        // 18 : 지수부
        // 9223372 000000000000
        System.out.println(d);
        // 9223372036854775 807.0 => 9.223372036854776E18
        // 9.223372036854776 : 가수부
        // 18 : 지수부
        // 실수의 가수부가 long 보다 작아서 가수부의 탈락이 발생한다 => 정확도가 떨어지게 된다.
        // 가수가 작으면 정확도가 떨어져서 자바는 실수표기의 기본을 Double 로 지정

        // ** 작은 수는 큰 정수 타입의 변수에 바로 대입 가능
        // 큰 정수 타입은 작은 정수 타입에 대입 불가능
        // 모든 정수는 실수 타입의 변수에 대입 가능 하지만 가수부보다 큰 정수는 탈락이 발생하여 정확도가 떨어진다.
        // float 실수는 double 에 바로 대입 가능 하지만 double 실수는 float 에 대입 불가능
        // f=1E308; // 대입 불가능
        // f=1e308f; // float 보다 큰 수는 정의 불가능  // float 가 정의할 수 있는 큰 수는 작성 불가능


        // 불가능한 것을 Casting 으로 강제 형변환
        // parsing 과 유사 - parsing 은 완전히 다른 타입의 데이터를 반환
        // Casting 은 부모자식 또는 기본형이면 수끼리 형변환 String=>int , String=>Object
        // (Object(String 객체)) => String : 자료형, int->byte : 기본형)
        // byte b=128; // byte -128 ~ 127
        byte b=(byte)128;
        // 1. byte 가 표현할 수 있는 가장 큰 수로 표현 or Infinity
        // 2. 자바는 수를 순환 반복시켜서 정수를 뽑아낸다.
        System.out.println(b); // -128
        b=(byte)130; //??
        System.out.println(b); //-126


        // 실수 데이터를 강제 형변환
        b=(byte)130.0;
        System.out.println(b); //-126

        b=(byte)1E308;
        System.out.println(b); // -1

        b=(byte)0.123; // 1보다 작은 수
        System.out.println(b); // 0


        // 정수 변수에 더 큰 수(더 큰 정수, 실수)를 casting 형변환 후 대입(byte, short, int / long 제외)

        i=(int)2147483648L;
        System.out.println(i); // -2147483648
        i=(int)2147483649L;
        System.out.println(i); // -2147483647


        // l=9223372036854775808L;
        l=(long)9223372036854775808.0;
        System.out.println(l); // 9223372036854775807 (가장 큰 수)
        l=(long)19223372036854775808.0;
        System.out.println(l); // 9223372036854775807 (가장 큰 수)
        // long 으로 casting 형변환하면 long 으로 표현할 수 없는 큰 수(작은 수)가 대입되었을 때 long 의 가장 큰 수(작은 수)를 반환한다.


        f=(float)(1e308*1e308); // 308제곱 이상의 실수를 표기하는 것 자체가 컴파일 오류가 발생
        // 곱한 뒤에 값을 대입하는 것은 컴파일 이후 실행하면서 발생하는 일이기 때문에 컴파일 오류를 무시
        System.out.println(f); // (float 가 표현할 수 있는 가장 큰 수 or ) Infinity
        f=(float)1e308; // float 입장에서 double 의 크기도 무한대
        System.out.println(f); // Infinity
        f=(float)1e40; // => float 의 최대 수는 1e39
        System.out.println(f); // Infinity
        f=(float)-1e40;
        System.out.println(f); // -Infinity

        d=1e308*1e308;
        System.out.println(d); // Infinity

        // 실수 타입이 표현할 수 있는 수보다 크면 무한대



        }
}
