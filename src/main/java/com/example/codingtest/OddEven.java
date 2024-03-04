package com.example.codingtest;
// https://school.programmers.co.kr/learn/courses/30/lessons/12937
public class OddEven {
    public static void main(String[] args) {
        int num = 8;

        System.out.println(solution(num));

    }


    public static String solution(int num) {
        String answer = "";
        if(num == 0){
            answer = "\""+"Even"+"\"";
        }
        if(num % 2 == 0){
            answer = "\""+"Even"+"\"";
        }
        else {
            answer = "\"" + "Odd" + "\"";
        }
        return answer;
        }

}
