package com.tj703.advance;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class L09StreamAPI {
    public static void main(String[] args) {
        // StreamAPI 반복문 작성을 편하게 하고 반복 함수(콜백함수)를 재사용하기 위한 내부 반복문
        List<Integer> nums=new ArrayList();
        nums.add(11);
        nums.add(21);
        nums.add(31);
        nums.add(41);
        nums.add(51); // {11,21,31,41,51}

        // index 로 조회 : 속도가 느리다.
        for(int i=0; i<nums.size(); i++){
            System.out.println(nums.get(i)+", ");
        }
        System.out.println("");

        // iterator : 외부반복문, 속도가 더 빠르다.
        for(int num : nums){
            System.out.println(num+", ");
        }
        System.out.println("");

        // iterator : 내부반복문, 함수 재사용
        // => 내부적으로 반복 호출하는 콜백함수를 재사용할 수 있기 때문
        /* nums.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer+", ");
            }
        });
        */

        // 익명함수표기법
/*        Consumer callBack




 */

/*        // 람다식
        callBack=(num)->{
            System.out.println(num+", ");
        };
        nums.forEach(callBack);
        int [] numArr={44,55,66,77};
        // [] Array 가볍기 때문에 forEach 가 없다.
        // js Array 같은 타입없이 대부분의 배열 타입은 forEach 가 존재 HtmlCollection
        // java Array 내부반복문이 안됨
        // 빠른 반복문용 자료형을 만들어서 모든 자료형 내부반복문을 사용할 수 있게 만든 것 => Stream
        Stream numStream=nums.stream(); // Stream : 자료형 전용 => forEach 가능
        IntStream numArrStreams= Arrays.stream(numArr); // (byte,short,int,...)Stream : 기본형 전용 => forEach 가능
        numStreams.forEach((n)->{});
*/        // numArrStreams.forEach((n)->{}); // Stream 은 한 번 사용 다시 사용 불가 => 일회용 자료
        // filter, map, allMatch
/*        OptionalDouble avg=numArrStreams.average();
        avg.ifPresent((n)->{
            System.out.println("평균값 : "+n);
        });
*/




    }
}
