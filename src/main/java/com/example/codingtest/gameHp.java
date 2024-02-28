package com.example.codingtest;

import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/250137
class gameHp {
    public static void main(String[] args) {
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {
                {2, 10},
                {9, 15},
                {10, 5},
                {11, 5}
        };

        System.out.println(solution(bandage, health, attacks));
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {

        // 공격 타이밍과 데미지를 저장할 맵 생성
        Map<Integer, Integer> attackMap = new HashMap<>();
        for (int[] attack : attacks) {
            attackMap.put(attack[0], attack[1]);
        }

        // 마지막 공격 타이밍을 얻음
        int totalTime = attacks[attacks.length - 1][0];

        // 최대 체력을 저장
        int maxHealth = health;

        // 가독성을 높이기 위해 변수로 저장
        int recoveryTime = bandage[0];
        int recoveryHealth = bandage[1];
        int recoveryBonus = bandage[2];

        // 연속된 공격을 세기 위한 변수
        int 연속카운트 = 0;

        // 인덱스 1부터 totalTime까지 반복
        for (int i = 1; i <= totalTime; i++) {

            // 현재 타이밍에 공격이 있는지 확인
            if (attackMap.containsKey(i)) {
                // 있다면 체력 감소
                health -= attackMap.get(i);

                // 체력이 0 이하로 내려가면 더 이상 회복 불가능
                if (health <= 0) {
                    return -1;
                }

                // 연속된 공격 카운트 초기화
                연속카운트 = 0;
            } else {
                // 공격이 없다면 연속된 카운트 증가
                연속카운트++;

                int tempHealth = health + recoveryHealth;

                // 보너스 회복을 할 시기인지 확인
                if (연속카운트 == recoveryTime) {
                    연속카운트 = 0;
                    tempHealth += recoveryBonus;
                }

                // 체력은 최대 체력을 넘을 수 없음
                health = Math.min(maxHealth, tempHealth);
            }
        }

        // 체력이 0보다 크면 체력을 반환, 그렇지 않으면 -1 반환
        return health > 0 ? health : -1;
    }
}