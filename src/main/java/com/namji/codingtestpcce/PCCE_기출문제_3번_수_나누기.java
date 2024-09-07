package com.namji.codingtestpcce;

import java.util.Scanner;

public class PCCE_기출문제_3번_수_나누기 {
  public static void main(String[] args) {
    /*
    2자리 이상의 정수 number가 주어집니다.
    주어진 코드는 이 수를 2자리씩 자른 뒤,
    자른 수를 모두 더해서 그 합을 출력하는 코드입니다.
    코드가 올바르게 작동하도록 한 줄을 수정해 주세요.

    입출력 예
    입력 #1
    4859
    출력 #1
    107
    입력 #2
    29
    출력 #2
    29

    입출력 설명
    #1
    입력된 수를 2자리씩 나눠 합치면 다음과 같습니다.
    48 + 59 = 107
    #2
    입력된 수를 2자리씩 나눠 합치면 다음과 같습니다.
    29  = 29
     */
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int answer = 0;

    while (number != 0){
      answer += number % 100;
      number /= 100;
    }

    System.out.println(answer);
  }
}
