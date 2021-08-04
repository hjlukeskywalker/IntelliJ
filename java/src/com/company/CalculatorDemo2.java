package com.company;
//메소드화
public class CalculatorDemo2 {

    public static void sum(int left, int right){
        System.out.println(left+right);
    }
    public static void main(String[] args){
        sum(10,20);
        sum(20,40);
    }
    /*
    그런데 똑같은 수를 이용해서 더하기 뿐 아니라 평균도 구해야 한다면 어떻게 해야할까?
    CalulatorDemo3와 같이 할 수 있을 것이다.
    입력값(left, right)을 변수화시키고 메소드들(sum, avg)가 이 값을 사용하면 코드의 양을 줄일 수 있게 된다
     */
}
