package com.company;
// 아래의 예제는 의미적으로 연관된 로직들을 물리적으로 응집된 하나의 객체로 만드는 법을 설명하는 예제다.
class Calculator {
    int left, right;

    public void setOprands(int left, int right){
        this.left=left;
        this.right=right;
    }

    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }

}
public class CalculatorDemo4{
        public static void main(String[] args){

            Calculator c1= new Calculator();
            c1.setOprands(10,20);
            c1.sum();
            c1.avg();

            Calculator c2= new Calculator();
            c2.setOprands(20,40);
            c2.sum();
            c2.avg();
        }
        /*
        변수: 상태 , 메소드 : 행동
        하나의 클래스를 바탕으로 서로 다른 상태를 가진 인스턴스를 만들면 서로 다른 행동을 하게 된다는 것을 알 수 있다
         */
}
