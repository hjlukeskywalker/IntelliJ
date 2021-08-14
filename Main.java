package com.java.scope;


public class Main {

    public static void main(String[] args) {
	//
        System.out.println("프로그램 시작");
        fgood(22);
        fgood(27);
    }
    public static void fgood(int age){
        System.out.println("안녕하세요");
        System.out.println("제나이는" + age + "세입니다.");
    }
}
