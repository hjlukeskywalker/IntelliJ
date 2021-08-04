package com.company;

public class ClaculatorDemo3 {

    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
    public static void sum(int left, int right){
        System.out.println(left+right);
    }

    public static void main(String[] args){
        int left, right;

        left=10;
        right=20;

        sum(left, right);
        avg(left, right);

        left=20;
        right=40;

        sum(left, right);
        avg(left, right);
    }
    /*
    평균을 계산하는 메소드 avg를 추가했고, 두개의 메소드(sum, avg)에서 동일한 입력값(10, 20)을 사용하고 있기 때문에 변수를 이용해서 좌항(left)과 우항(right)에 값을 담았다.
    코드가 복잡해지기 시작한다.
    상상력을 이용해서 위의 코드를 더욱 복잡하게 만들어보자.
    실행 메소드인 main 에는 계산과 관련된 로직 밖에 없지만, 만약에 위의 코드에 직원 정보를 데이터베이스에서 가져오는 로직이나, 계산된 결과를 그래프로 표시하는 로직과 같은 것이 함께 위치한다면 코드는 점점 복잡해 질 것이다.
    그러다 누군가 변수 left, right의 의미를 계산을 위한 좌항과 우항이 아니라 그래프의 디자인을 변경하는 코드로 사용했거나, 메소드 sum을 더하기가 아니라 요약(summary) 정보를 그래프로 표시하는 의미로 사용하게 되었다면 어떻게 될까?
    하나의 프로그램 안에서 메소드나 변수의 의미가 달라지게 되는 것이다.

    코드가 복잡해짐에 따라서 버그는 많아지고, 팀웍은 서서히 깨지기 시작할 것이다.
    여러분이 언어의 설계자라면 이런 상황을 완화하기 위한 고민을 시작할 것이다.
    이런 맥락에서 객체 지향이라는 개념이 등장하기 시작하는 것이다.

    객체 지향의 핵심은 연관되어 있는 변수와 메소드를 하나의 그룹으로 묶어서 그룹핑하는 것이다.
    위의 예제를 분석해보자. 연관되어 있는 부분과 반복적인 부분을 찾아 볼 수 있다.
    메소드 sum과 avg는 변수 left와 right와 서로 연관 되어 있다.
    또한 합계와 평균을 구하는 작업은 다른 에플리케이션에서도 사용할 수 있는 기능이다.
    이것들을 그룹핑해서 하나의 부품으로 만들면 필요할 때마다 반복적으로 사용할 수 있을 것이다.
    객체를 만들 때가 된 것이다.



     */
}
