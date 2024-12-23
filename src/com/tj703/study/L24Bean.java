package com.tj703.study;

public class L24Bean {
    // 완두콩 => Bean : 콩껍질로 캡슐화된 콩들

    // Bean(getter setter) 객체  => Alt + insert 단축키로 사용 가능
/*  * Bean 객체를 작성하는 이유
    * 1. 데이터를 안전하게 보관하기 위해서 캡슐화
    * 2. 코드 작성을 유연하게 할 수 있다.(유효성 검사 추가가 용이)
    * 3. 코드 중복을 막고 유지보수가 용이해진다.(Member bean 을 하나만 만들어 재사용)
    * 4. 생산성 증가(설계의 규약에 따라 작성하기 때문에 개발 툴에서 자동 완성 제공, lombok)
*/

    class Member{
        private String id;
        private String name;
        private int age;
        // id, name, age 가 캡슐화된 콩

        // 캡슐화된 id 에 값을 대입하는 (set)함수
        public void setId(String id){
            if(id.length()>5) {
                this.id = id;
            }
        }

        //  캡슐화된 id 에 값을 반환하는 (get)함수
        public String getId(){
            if(id!=null && id.length()>5) {
                return this.id;
            }else{
                return "아이디 없음";
            }
        }

        // name
        // 설계의 규약 Design Guideline : 개발자간의 약속
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return this.name;
        }

        // age
        public void setAge(int age){
            this.age=age;
        }
        public int getAge(){
            return age;
        }


        public static void main(String[] args) {
            Member mem=new L24Bean().new Member();
            // mem.setId("me");  // 5글자 이상만 입력하도록 오류
            mem.setId("abdcab");
            mem.setName("나");
            mem.setAge(10);
            System.out.println(mem.getId());
            System.out.println(mem.getName());
            System.out.println(mem.getAge());
            //필드에 값을 바로 대입하지 않고 함수로 대입
        }




    }

}
