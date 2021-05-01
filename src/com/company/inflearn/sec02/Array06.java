package com.company.inflearn.sec02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array06 {

    public ArrayList<Integer> solution(int n , String [] arr){

       ArrayList<Integer> answer = new ArrayList<>();
        for (int j=0; j<n; j++){
            String st = new StringBuilder(arr[j]).reverse().toString();
            int number = Integer.parseInt(st);
            if (isPrime(number)){
                answer.add(number);
            }

        }

        return answer;

    }

    public static void main(String[] args) {

       Array06 A = new Array06();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String [] array = new String[num];

        for (int i=0; i<array.length; i++){
            array[i] = sc.next();
        }

        for (int x : A.solution(num, array)){
            System.out.print(x+" ");
        }

    }
    public static boolean isPrime(int n){
        if (n==4 || n==1) return false;
        for (int z=2; z<n/2; z++){
            if (n % z ==0){
                return false;
            }
        }
        return true;
    }
}
