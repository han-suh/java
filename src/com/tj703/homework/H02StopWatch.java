package com.tj703.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StopWatch extends JFrame {
    private JButton startBtn;
    private JButton stopBtn;
    private JButton resetBtn;
    private JLabel screen;
    private JPanel p; // 버튼들을 한 줄에 정렬하기 위해서
    private long sec=0; // =0; 하지않아도 자동 0
    // private double sec=0; // double 연산 오류가 발생 1/10 -> 0.1  0.999999...
    // private long millSec=
    private boolean isRun;
    private StopWatch(){
        super("스톱워치");
        this.setBounds(700,500,300,300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 화면이 꺼지니깐 종료
        // this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // 강제 종료
        screen=new JLabel("스톱워치");
        screen.setHorizontalAlignment(SwingConstants.CENTER);
        startBtn=new JButton("start");
        stopBtn=new JButton("stop");
        resetBtn=new JButton("reset");
        this.add(screen);
        startBtn.addActionListener(new StartBtnHandler());
        stopBtn.addActionListener((e)-> {isRun = false;});
        resetBtn.addActionListener((e)->{
            // isRun=false;
            stopBtn.doClick(); // stopBtn 강제 실행 => Action 발생
            screen.setText((sec=0)+"");
            // screen.setText((milSec=0)+"");
        });
        p=new JPanel(); // 패널 넣기
        p.add(startBtn); // p에 버튼 3개 넣기 위해서
        p.add(stopBtn);
        p.add(resetBtn);
        this.add(p, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    class StartBtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) { // 콜백함수로 사용
            new Thread(()->{
                isRun=true;
                while (isRun){
                    //screen.setText(sec+"");
                    screen.setText(Long.toString(++sec));
                    // screen.setText(((++millSec)*0.0001)+""); // 실수의 연산 오류가 발생
                    // screen.setText(String.format("%.3f",(++millSec)*0.001)); // 실수로 출력되게 하기 위해서 %f, 그리고 double 로 형변환해야함.
                    // String.format 은 원하는 만큼 잘라서 보여줌 => .3 : 소수점 3자리
                    try{Thread.sleep(1000);}catch (Exception ex){
                        // try{Thread.sleep(1);}catch (Exception ex){

                    }
                }
            }).start();
        }
    }

}

public class H02StopWatch {
    public static void main(String[] args) {
        // new StopWatch();
    }
}
