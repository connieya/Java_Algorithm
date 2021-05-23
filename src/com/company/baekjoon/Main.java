package com.company.baekjoon;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        arr[1] = 1;
        arr[2] = 1;
        for (int i=3; i<=n; i++){
            for (int j=1; j<=2; j++){
                arr[i] += arr[i-j];
            }
        }
        System.out.println(arr[n]);

    }
}