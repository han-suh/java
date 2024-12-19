package com.tj703.study;

public class L16ForWhile {
    public static void main(String[] args){
        // 어떤 분기를 반복 실행할 때 사용하는 for while 반복문
/*        while(true){ // 계속 반복
            System.out.println("안녕!");
        }
 */

        // 어떤 분기를 조건을 주어 반복 실행 (선언문, 조건문, 증감문)
        int n=0; // 조건의 선언문
        while (n<3){ // 조건문
            System.out.println(n+": 안녕!");
            n++; // 증가문
        }

        // 감소문으로 작성
        int t=2;
        while (t>=0){
            System.out.println(t+": 안녕");
            t--;
        }


        // for 반복문 : 선언문, 조건문, 증감문을 한 코드에 작성
        for(int i=0; i<3; i++){
            System.out.println(i+": 잘가");
        }
        String [] strArr={"class","String","for","while","+","-"};
        // 증가문
        for(int i=0; i<strArr.length; i++){
            System.out.println(i+" : "+strArr[i]);
        }
        // 감소문
        for(int i= strArr.length-1; i>=0; i--){
            System.out.println(i+" : "+strArr[i]);
        }
        // 시작점부터 끝지점까지만 반복 실행할 수 있는 Iterator 와 달리 for 문으로 직접 작성하면 복잡한 분기나 역순을 참조할 수 있다.





    }
}
