package com.tj703.homework;

import java.util.Scanner;

public class H01RandomNumMatch {
    public static void main(String[] args) {
        boolean game=true;
        gameLoop : while (game) {
            System.out.println("랜덤하게 생성한 수를 맞추세요!(1~50)");
            // 기본 셋팅
            double random = Math.random(); // java.lang 패키지는 자동으로 Import(String, Integer)
            System.out.println(random); // 0.559031356882157
            double num1 = random * 10;
            System.out.println(num1); // 5.5903135688215695
            int num = (int) (random * 50) + 1;  // 소수점을 int 로 강제 형변환 => (int)  // 더 큰 수 => 작은 수 강제형변환 casting
            System.out.println(num); // 0 => (random*10)에 괄호 하기 전 => random(0)을 int 하고 *10 이여서   // 40
            // int num=(int) => 버림 : 실수 타입이 정수가 될 때는 소수점 버림이 발생 : 0.1111 -> 0 / 49.1234 -> 49 => 0~49 가 되기 때문에 +1 해야 1부터 시작 가능
            // int num=Math.ceil();  => 올림
            // int num=Math.floor(); => 내림  1.4 -> 1 , -1.4 => -2
            // js 에서의 버림 : let num=Math.trunc(-1.4)
            // js 에서의 버림 : let num=Number.parseInt(-1.4) 정수로 만들면서 강제로 버림


//        Scanner scanner=new Scanner(System.in);
//        String inputNumStr=scanner.nextLine(); // enter(line 개행)를 입력할 때까지 문자열을 받는다.  // 콘솔에서 문자열을 입력하고 enter 를 입력할 때까지 jvm 대기
//        System.out.println("당신이 입력한 수는 : "+inputNumStr);

            //반복문으로 실행
/*        while (true){
            Scanner scanner=new Scanner(System.in);
            String inputNumStr=scanner.nextLine();
            try {
                int inputNum=Integer.parseInt(inputNumStr);
                // Integer.parseInt : "13" => 13 (Number() or Number.parseInt())
                // "아13" => 오류
            }catch (NumberFormatException e){
                System.out.println("수 만 입력하세요");
                continue; // 아래 코드는 무시하고 다시 반복문을 실행
            }
            System.out.println("당신이 입력한 수는 : "+inputNumStr);
            // break; // 반복문을 종료
        }
*/


/*        // false
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String inputNumStr = scanner.nextLine();
            try {
                int inputNum = Integer.parseInt(inputNumStr);
                // 다음 코드부터는 inputNum 은 무조건 존재함.
                if (inputNum == num) {
                    System.out.println("정답"); // break;
                } else if (inputNum > num) {
                    System.out.println("down");
                } else {
                    System.out.println("up");
                }
            } catch (NumberFormatException e) {
                System.out.println("수 만 입력하세요");
            }
        }
*/

            //정답을 5번 안에 맞추도록 하세요! => count 를 통해서 횟수 제한 및 종료
            //입력이 5번을 넘기면 졌습니다. 종료! **1 => count 를 if 문으로 종료
            //game 을 무한히 반복시키세요! 2 => 전체 내용을 while 로 반복 실행
//        boolean game=true;
            int count = 0;
            inputLoop : while (true) {
                Scanner scanner = new Scanner(System.in);
                String inputNumStr = scanner.nextLine();
                try {
                    // 1+(--count) : 1을 먼저 더하고 count 을 1 빼라
                    // 1-(count--) : count 을 1빼고 1을 더하라
                    int inputNum = Integer.parseInt(inputNumStr);
                    // 다음 코드부터는 inputNum 은 무조건 존재함.
                    ++count;
                    if (inputNum == num) {
                        System.out.println(count + "시도 : 정답");
                        // break; => else 블럭 지울 수 있음.. if - if 연결 가능
                        game = false; // 게임 종료

                    } else {
                        if (count == 5) {
                            System.out.println("졌습니다");
                            break; // 게임 종료 => else 지울 수 있음.. if - if 연결 가능
                            // game = false; // 게임 종료 => else 있어야 함.
                        } else {
                            if (inputNum > num) {
                                System.out.println("down");
                            } else {
                                System.out.println("up");
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    if(inputNumStr.equals("exit")){
                        System.out.println("게임을 종료합니다");
                        // game=false; // 전체 while 을 break 할 수 없어서 game=false 로 종료
                        // break; // 내부 while break
                        break gameLoop;
                        // break inputLoop; // 부모 loop 종료하면 자식은 자동을 종료
                    }
                    System.out.println("숫자만 입력하세요");
                }
            }


//        int n=0;
//        int m=5;
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            String inputNumStr = scanner.nextLine();
//            int n=0;
//            int m=5;
//            while (n<5) {
//                try {
//                    int inputNum = Integer.parseInt(inputNumStr);
//                    // 다음 코드부터는 inputNum 은 무조건 존재함.
//                    if (inputNum == num) {
//                        System.out.println("정답"); // break;
//                        // game = false;
//                    } else if (inputNum > num) {
//                        System.out.println("down");
//                    } else {
//                        System.out.println("up");
//                    }
//                } catch (NumberFormatException e) {
//                    System.out.println("수 만 입력하세요");
//                }
//                n++;
//            }
//        }


        }

    }
}