package com.tj703.study;

public class L17TwoArray {
    public static void main(String[] args) {
        // 2차원 배열에 대해 알아보자
        int[] arr = {12, 13, 14};
        int[][] twoArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[] strArr = {"123", "456", "789"};
        String str = "안녕하세요~"; // {'안','녕','하','세','요'} 로 저장된 상태
        System.out.println(str.charAt(2)); // str[2]  // 하
        // for(char c :str){}
        char [] cArr=str.toCharArray();
        System.out.println(cArr); // 안녕하세요~
        for(char c: cArr){
            System.out.println(c+",");
        }
        System.out.println("\n {\"123\", \"456\", \"789\"} 반복실행");
        for(String s: strArr){
            char [] cs=s.toCharArray();
            System.out.println(s); // 123
            for(char c : cs) {
                System.out.println(c + ","); // 1, 2, 3, ..
            }
            System.out.println();
        }


        // twoArr 의 모든 데이터를 출력해서 더하세요.
        int sum=0;

        for(int[] ns : twoArr){
            for(int n : ns){
                sum+=n;
                System.out.println(n);
            }
            System.out.println(ns);
        }
        System.out.println(sum);

    }
}
