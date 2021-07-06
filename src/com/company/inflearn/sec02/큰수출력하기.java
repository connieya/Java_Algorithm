package com.company.inflearn.sec02;

import java.util.Scanner;

public class 큰수출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        sb.append(arr[0]+" ");
        for (int i=1; i<N; i++){
            if (arr[i]>arr[i-1]){
                sb.append(arr[i]+" ");
            }
        }
        System.out.println(sb);

    }
}
