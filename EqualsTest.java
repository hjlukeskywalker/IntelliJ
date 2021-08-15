package com.java.scope;

import java.util.Scanner;

public class EqualsTest {
    public static void main(String args[]) {
        // 문자열의 비교는 관계연산자로 하면 안되고
        //equals라는 메소드를 이용해서 비교한다.

        Scanner sc = new Scanner(System.in);
        String msg;

        System.out.println("영어단어를 입력하세요");
        System.out.println("ex)angel, happy, rose");
        msg = sc.nextLine();

        if(msg.equals("angel"))
            System.out.println("천사");
        else if(msg.equals("happy"))
            System.out.println("행복한");
        else if(msg.equals("rose"))
            System.out.println("장미");
        else
            System.out.println("등록되지 않은 단어입니다.");
    }
}