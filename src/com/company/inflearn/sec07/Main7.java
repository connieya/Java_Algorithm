package com.company.inflearn.sec07;

public class Main7 {
    public static void main(String[] args) {

        long sum = 0;

        for (long i=1; i< 1000000000; i++){
            sum +=i;
        }

        System.out.println(sum);
    }
}