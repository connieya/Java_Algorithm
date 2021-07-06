package com.company.inflearn.sec08;

import java.util.Scanner;

public class 미로탐색_DFS {
    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,1,0,-1};
    static int [][] board;
    static int answer =0;
    public static void main(String[] args) {
         board = new int[8][8];
         Scanner sc = new Scanner(System.in);
         for (int i=1;i<8; i++){
             for (int j=1; j<8; j++){
                 board[i][j]= sc.nextInt();
             }
         }
         board[1][1] =1;
         DFS(1,1);
        System.out.println(answer);

    }
    static void DFS(int x, int y){
        if (x==7 && y==7){
            answer++;
        }else {
            for (int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny] ==0){

                    board[nx][ny] =1;
                    DFS(nx,ny);
                    board[nx][ny] =0;
                }

            }
        }
    }
}
