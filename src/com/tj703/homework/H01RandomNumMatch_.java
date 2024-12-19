package com.tj703.homework;

import java.util.Scanner;

public class H01RandomNumMatch_ {
    public static void main(String[] args) {
        boolean game=true;
        // 전체 게임 반복
        gameLoop : while (game) {
            System.out.println("랜덤하게 생성한 수를 맞추세요!(1~50)");

            // 기본 셋팅
            double random = Math.random();
            // System.out.println(random);
            int num = (int) (random * 50) + 1;
            System.out.println(num);

            // 한 게임에 대한 횟수 반복
            int count = 0;
            inputLoop : while (true) { // while 안에 count 관련해서 넣으려고 하면... 안에 내용이 count 만큼 반복됨.
                Scanner scanner = new Scanner(System.in);
                String inputNumStr = scanner.nextLine();
                try {
                    int inputNum = Integer.parseInt(inputNumStr);
                    ++count;
                    if (inputNum == num) {
                        System.out.println(count + "시도 : 정답");
                        break;
                    }

                        if (count == 5) {
                            System.out.println("졌습니다");
                            break;
                        }

                            if (inputNum > num) {
                                System.out.println("down");
                            } else {
                                System.out.println("up");
                            }

                } catch (NumberFormatException e) {
                    if(inputNumStr.equals("exit")){
                        System.out.println("게임을 종료합니다");
                        break gameLoop;
                    }
                    System.out.println("숫자만 입력하세요");
                }
            }






        }

    }
}