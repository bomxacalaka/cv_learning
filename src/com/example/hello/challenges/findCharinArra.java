package com.example.hello.challenges;

public class findCharinArra {
    public static void main(String[] args) {

        char[][] arr = new char[][]{
                {'D', 'E', 'Y', 'H', 'A', 'D'},
                {'C', 'B', 'Z', 'Y', 'J', 'K'},
                {'D', 'B', 'C', 'A', 'M', 'N'},
                {'F', 'G', 'G', 'R', 'S', 'R'},
                {'V', 'X', 'H', 'A', 'S', 'S'}
        };

        char search = 'D';

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==search){
                    num++;
                }
            }
        }
System.out.println(num);
    }
}
