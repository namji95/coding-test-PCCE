package com.namji.codingtestpcce;

import java.util.Scanner;

public class PCCE_기출문제_3번_나이_계산 {
  public static void main(String[] args) {
    /*
    입력 값 정수 year와 문자열 age_type이 매개변수로 주어집니다.
    나이를 세는 방법은 여러 가지가 있습니다.
    그중 한국식 나이는 태어난 순간 1살이 되며 해가 바뀔 때마다 1살씩 더 먹게 됩니다.
    연 나이는 태어난 순가 0살이며 해가 바뀔 때마다 1살씩 더 먹게 됩니다.
    각각 나이의 계산법은 다음과 같습니다.
      한국식 나이 : 현재 연도 - 출생 연도 + 1
      연 나이 : 현재 연도 - 출생 연도
    출생 연도를 나타내는 정수 year와 구하려는 나이의 종류를 나타내는 문자열 age_type이 주어질 때,
    2030년에 몇 살인지 출력하도록 빈칸을 채우는 문제입니다.
    age_type이 "Korea"라면 한국식 나이를, "Year"라면 연 나이를 출력합니다.

    입출력 예
    입력 #1 2000 / Korea
    출력 #1 31
    입력 #2 1999 / Year
    출력 #2 31

    입출력 설명
    #1
    2030년에 2000년생의 한국식 나이는 2030 - 2000 + 1 = 31살입니다.
    #2
    2030년에 1999년생의 연 나이는 2030 - 1999 = 31살입니다.
     */
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    String age_type = sc.next();
    int answer = 0;

    if (age_type.equals("Korea")) {
      answer = 2030 - year + 1 ;
    }
    else if (age_type.equals("Year")) {
      answer = 2030 - year;
    }

    System.out.println(answer);
  }
}
