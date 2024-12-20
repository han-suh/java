package com.tj703.study;

import java.lang.reflect.Array;

public class L18Inheritance {
    public static void main(String[] args){
        // 상속이란 객체가 다른 객체를 포함하도록 정의하는 방식
        // 모든 객체는 object 객체를 포함하고 있다.
        String s=new String("안녕");
        int [][] arr=new int[4][3]; // [[],[],[]]  [] Array 는 object 객체를 포함
        Object objS=s;
        Object objArr=arr;
        // 모든 객체의 타입은 부모 타입으로 object 을 상속하고 있기 때문에 객체 생성 시 object 를 객체로 생성해서 참조(super)하고 있다.
        // object 변수가 객체를 참조할 수 있는 이유이다.
        // object 는 모든 객체의 조상 : 언어에서 객체의 default 상태를 정의


        // 객체 생성 방식 - js 와 java
        // js 는 object 프로토타입(미완성 객체)을 만들어 놓고 다른 객체를 만들 때마다 __proto__ 로 참조
        // __proto__ 는 자바의 super 와 같다.(상속의 개념)
        // function User(){} => User.prototype 이 __proto__ 이용해 Object.prototype 을 참조하면서 객체를 생성한다.
        // const user=new User(); User 객체가 User.prototype 을 __proto__ 로 참조하면서 생성된다.

        // new User()의 부모는 User.prototype ??? true
        // new User()의 부모는 function User ??? false (자바와 동일)
        // new User()의 조상은 function Object ??? Object.prototype ??? Object.prototype
        // Object.prototype 을 기준으로 객체를 생성하고 User.prototype 이 부모 객체
        // function 은 선언해놓은 단지 문자열인 것 뿐이고 그것을 기준으로 만든 prototype 이 객체의 부모나 조상이 된다.
        // const user=new User();
        // user.__proto__ == 상속 받고 싶은 프로토타입이나 객체 (Mem.prototype)
        // class User extends Mem{} : js가 java 의 문법을 따라한다. 문법적 설탕

        // java 는 프로토타입이라는 미완성 객체를 미리 만들어 놓지 않고 정의된 타입(class) 를 보고 객체를 생성한다.
        Member mem=new Member();
        // new Member 부모는 class Member 인가요??? false
        // => 자바에서 객체 자신의 class 가 객체의 타입인 것 뿐이지 부모가 될 수 없다
        // new Member 조상은 class Object 인가요??? true
        // 자바에서는 객체를 조상 취급하지 않는다. type class 를 조상 취급한다.
        // js는 프로토타입이 객체이기 때문에 객체가 조상이 될 수 있다. => 자바에서는 불가!!!

        Parent p=new Member(); // new Member() 를 만들 때 new Parent() 와 new Object() 가 만들어지기 때문
        Object o=new Member();
        // new Member().super=new Parent().super=new Object()

        Parent p2=new Parent();
        // p2(new Parent())가 p에 조상??? true
        // p.super=p2; p.__proto__=p2, p2.prototype

        System.out.println(p.age); // Parent p=new Member();
        // System.out.println(p.name);

        System.out.println(mem.age);
        System.out.println(mem.name);
        // 기본형 큰 타입을 작은 타입으로 변경 => 강제
        // Parent < Member (강제: 부모타입이 자식보다 더 작게 정의되어 있기 때문)
        // Casting : 강제 형변환
        System.out.println(((Member)p).name);
        //User s2=(User)p;
        Member upMem=(Member) p;
        //User u=(User)p;
        //java 의 저버전에서는 p의 자식이 Member 인지 User 인지 몰라서 실행시 오류
        //현재버전에서는 p의 자식이 누구인지 확인하고 자식이 아니면 캐스팅을 못하게
        //컴파일 시 오류를 발생

    }
}
class Parent{ // => == class Parent extends Object{}
    int age=38;
}


class Member extends Parent{ // new Member() 하면 Member 와 Parent 객체가 동시에 생성된다.
    String name="me";
    public Member(){
            // Member.prototype.__proto__=Parent.prototype; // js 에서 함수 내부에서 상속
            // super=Parent; X (자바에서는 js 처럼 되지 않음)
            // super=new Parent(); X (자바에서는 js 처럼 되지 않음)
    }
}

// new Member() => Member 와 Parent 객체가 동시에 생성된다.

// js 에서
// function A(){this.a="안녕"} function B(){B.prototype.__proto__=A.prototype;}
// function A(){this.a="안녕"} function B(){B.prototype.__proto__=new A()}

// new B().a  =>"안녕"