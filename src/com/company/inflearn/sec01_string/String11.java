package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String11 {

    public String solution(String str) {

        String answer = "";

        int count = 1;
        str += " ";
        for (int i = 0; i < str.length()-1; i++) {

                if (str.charAt(i) == str.charAt((i+1))) {
                    count++;
                } else {
                    if (count == 1) {
                        answer += str.charAt(i);
                    } else {
                        answer += str.charAt(i);
                        answer += count;
                    }
                        count = 1;

                }

            }


        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String next = sc.next();

        String11 T = new String11();
        System.out.println(T.solution(next));
    }
}
