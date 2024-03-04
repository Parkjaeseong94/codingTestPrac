package com.example.algorithm;

public class SelectionSort extends SortDefault {

    public static void main(String[] args) {
        int[] arr = generateShuffledArray(100000);
        long startTime = System.currentTimeMillis();
        sortBySelectionSort(arr);
        long endTime = System.currentTimeMillis(); // 종료 시간 기록
        long elapsedTime = endTime - startTime; // 실행 시간 계산
        System.out.println("Selection Sort took " + elapsedTime + " milliseconds");
    }

    //선택정렬 -> 인덱스 전체 순회후 가장 작은 값을 0인덱스랑 변경, 고정
    // 1인덱스부터 전체 순회후 가장 작읍값을 1인덱스랑 변경 ~ 무한반복

    public static void sortBySelectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int minIdx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }
}
