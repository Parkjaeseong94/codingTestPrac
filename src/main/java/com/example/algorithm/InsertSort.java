package com.example.algorithm;

public class InsertSort extends SortDefault {


    public static void main(String[] args) {
        int[] arr = generateShuffledArray(100000);
        long startTime = System.currentTimeMillis();
        sortByInsertionSort(arr);
        long endTime = System.currentTimeMillis(); // 종료 시간 기록
        long elapsedTime = endTime - startTime; // 실행 시간 계산
        System.out.println("Insert Sort took " + elapsedTime + " milliseconds");
    }

    // 3 2 1 4면 두번째 인덱스(key 기준점)부터 기준을 잡고 비교한다음 바로 왼쪽 인접한 인스턴스랑 비교후
    // 작으면 key 기준점에 왼쪽인스턴스를 넣고 왼쪽 인덱스에 key를 넣는다.. 무한반복
    public static void sortByInsertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
