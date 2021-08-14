package com.java.scope;

import java.util.Scanner;

public class GuGuDan {

    public static void main(String [] args){
        //import
        Scanner sc= new Scanner(System.in);

        //변수선언
        int dan;

        //입력문
        while(true){
            System.out.println("단을 입력해주세요(종료:0)");
            dan=sc.nextInt();

            if(dan==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if(dan<2||dan>9){
                System.out.println("잘 못 입력하셨습니다.");
                continue;
            }

            System.out.println("["+dan+"]");
                for(int i=1;i<=9;i++){
                    System.out.println(dan+"*"+i+"="+dan*i);
                }
                System.out.println();
        }
    }
}
