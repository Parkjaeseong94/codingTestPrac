package com.example.codingtest;

// https://school.programmers.co.kr/learn/courses/30/lessons/161989
public class overPainting {

    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        System.out.println(solution(n, m, section));
    }

    public static int solution(int n, int m, int[] section) {

        int cnt = 1;
        int first = section[0];
        for (int sec : section) {
            if (first + m > sec) {
                continue;
            }
            first = sec;
            cnt++;
        }
        return cnt;
    }
}