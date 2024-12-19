package com.tj703.study;

public class L04PrimitiveDataType {
    public static void main(String[]args){
        // java 는 숫자 데이터만 기본현으로 저장함
        // 수 : 정수(실수가 아닌, 소수점이 없는)
        byte b=127; // 1byte
        short s=12345; // 2byte
        int i=1234567890; // 4byte
        long l=12345678912L; // 8byte


        // 실수 : 소수점이 있는 수(지수부 가수부로 데이터 저장)
        float f=13.1234F; // 4byte
        Double d=13.123456789; // 8byte


        boolean result=true; // 1  // 1bit : 데이터지만 크기가 1byte(주소의 가장 작은 단위가 byte)
        result=false; // 0  // 1byte  // 참조하는 데이터가 변할 수 있음 => 변수
        char c='a'; // 문자표의 번호(정수)


        // 기본형 데이터
/*      * 1. 데이터 자체가 리터럴한 것(메모리상에 저장된 데이터가 한 번에 파악 가능한 것)
             => 컴퓨터의 메모리는 0, 1로 된 비트 정보를 저장하고 그것을 수로 표현 가능
             => 모든 기본형은 수 데이터뿐
             => char 가 기본형인 이유 : char 문자표(encoding, utf-8, euc-kr)의 번호인 수를 참조
             => boolean 이 기본형인 이유 : 0, 1 로만 된 데이터이기 때문
             => ** js 에서 문자열을 기본형으로 지정할 수 있는 이유 : 배열이지만 수 로된 배열로 데이터를 한 번에 파악 가능한 리터럴 데이터이기 때문
                   -> 'abc' => @fd8 저장 / [97,98,99] => 979899 => 011000010110001001100011
             => 자바에서는 한 번에 파악 가능해도 배열이기 때문에 원시데이터로 보기 힘들다고 판단 => 문자열 제외
        * 2. 이미 저장된 데이터가 있다면 새로 만들지 않고 만들어져 있는 데이터를 참조(데이터 재사용, 성질)
             => 보통 프로그래밍 언어가 기본형으로 재사용하게 설계된다.
        * 3. 자바에서 데이터를 참조하는 변수는 소문자로 타입을 명시 (Int X / int O)
        * 4. 데이터를 항상 리터럴(눈에 보이는 그대로)하게 표시
        * 5. 기본형 데이터는 그 데이터를 보조하는 자료형 데이터 타입인 랩퍼클래스가 존재
        *
 */
        Integer objI=13; // 13 자료형
        Byte ogjB=13;
        Short objS=13;
        Long objL=13L;
        Float objF=13.0F;
        Double objD=13.0;

        Boolean objResult=true;
        Character objC='A';

        // parse(parsing) : 강제로 형변환(오류가 발생할 수 있음)
        // thread : 실행 단위(Exception in thread "main" : main 을 실행하는 도중에 오류가 발생)
        System.out.println(Integer.parseInt("55")+1); // 56이면 "55"가 정수 55로 변환
        System.out.println(Double.parseDouble("55.55")*2);
        // System.out.println(Integer.parseInt("오십오")); // 실행 시 오류(심각한 오류-jvm 이 종료)
            // 컴파일 오류는 문법적 오류 시 발생

        // 오류 발생 방지
        try{
            System.out.println(Integer.parseInt("오십오")); // 실행 시 오류(심각한 오류)
            // js => Number("오십오") == NaN
            // isNaN("오십오") == true
            // NaN(수가 아닌데 수로 형변환을 한 상태): 웹상에서 문자열을 수로 형변환하는 일이 굉장히 많아서 오류를 발생시키지 않고 상태를 만들었다.
            // html 에 출력된 정보는 모두 문자열이기 때문(<div data-num='55'>13</div>)

            // JSON.parse("{13:'안녕'}") : 오류 (잘못된 형식)
            // JSON.parse("{\"13\":\"안녕\"}")
            // JSON.parse("{"13":"안녕"}")
        }catch (NumberFormatException e){ // NumberFormatException : 오류를 알고 있어서 그 오류를 잡을 때
                                          // Exception : 모든 오류를 잡을 때
            // e.printStackTrace(); // 오류 로그를 콘솔에 출력
            System.out.println(e.toString()); // 오류 출력 방법 변경
        }
        System.out.println("어플종료"); // 실행된다면 발생한 오류를 예외 처리하여서 jvm 이 종료되지 않음
    }

}
