package com.example.codingtest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//  https://school.programmers.co.kr/learn/courses/30/lessons/176963 추억점수
public class memoryScore {

    public static void main(String[] args) {
        String name[] = {"may", "kein", "kain", "radi"};
        int yearning[] = {5, 10, 1, 3};
        String photo[][] = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name, yearning, photo)));

    }


    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        //정답 변수
        int[] answer = new int[photo.length];
        //{?,?,? }
        //해시맵을 통하여 이름(키) : 점수(밸류) 설정.
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            String nameItem = name[i];
            int point = yearning[i];
            map.put(nameItem, point);
        }
        //{위의 예시의 경우 [ may=5 , kein = 10 ... ]

        for(int i = 0; i < photo.length; i++){
            for (String item: photo[i]) {

                //getOrDefault ( key , default 값 )
                //key에 may가 들어가면 밸류값으로 가지고 나옴. 즉 5
                answer[i] += map.getOrDefault(item, 0);
                System.out.println(i + "=" + map );
                System.out.println(item);
                System.out.println(Arrays.toString(answer));
            }
        }
        return answer;
    }
}