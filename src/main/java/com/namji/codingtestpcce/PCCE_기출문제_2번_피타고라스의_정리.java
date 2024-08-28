package com.namji.codingtestpcce;

import java.util.Scanner;

public class PCCE_기출문제_2번_피타고라스의_정리 {
  public static void main(String[] args) {
    /*
    정수 a와 c의 입력 값이 매개변수로 주어집니다.
    직각삼각형이 주어졌을 때 빗변의 제곱은
    다른 두 변을 각각 제곱한 것의 합과 같습니다.
       |\
       | \
    b  |  \ c
       |   \
       |____\
         a
     a^2 + b^2 = c^2
    직각삼각형의 한 변의 길이를 나타내는 정수 a와
    빗변의 길이를 나타내는 정수 c가 주어질 때,
    다른 한 변의 길이의 제곱, b_square을 출력할 수 있게
    코드를 수정하여 완성하는 문제입니다.
    입출력 예
    입력 #1 : 3 / 5
    출력 #1 : 16

    입력 #2 : 9 / 10
    출력 #2 : 19

    입출력 설명
    입출력 예 #1
    a2 = 9, c2 = 25 이므로 16을 출력합니다.
    입출력 예 #2
    a2 = 81, c2 = 100 이므로 19를 출력합니다.
     */

//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int c = sc.nextInt();
//
//    int b_square = (int) (Math.pow(c, 2) - Math.pow(a, 2));
//
//    System.out.println(b_square);

//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int c = sc.nextInt();
//
//    int b_square = (c - a) * (c + a);
//
//    System.out.println(b_square);

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int c = sc.nextInt();

    int b_square = (c * c) - (a * a);

    System.out.println(b_square);
  }
}
