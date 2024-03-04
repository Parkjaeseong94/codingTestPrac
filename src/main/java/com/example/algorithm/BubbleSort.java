package com.example.algorithm;

public class BubbleSort extends SortDefault {

    //구현 너무 쉽고 간단함. 그냥 인덱스 1번부터 근접한 파라미터 비교하여 스왑
    //

    public static void main(String[] args) {
        int[] arr = generateShuffledArray(100000);
        long startTime = System.currentTimeMillis();
        sortByBubbleSort(arr);
        long endTime = System.currentTimeMillis(); // 종료 시간 기록
        long elapsedTime = endTime - startTime; // 실행 시간 계산
        System.out.println("Bubble Sort took " + elapsedTime + " milliseconds");
    }


    public static void sortByBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}
