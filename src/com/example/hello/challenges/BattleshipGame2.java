package com.example.hello.challenges;

public class BattleshipGame2 {

    public static void main(String[] args) {

        int size = 5;

        char[][] map = new char[size][size];

        char[][] around = new char[size][4];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = '○';
            }
        }
//        int ran1 = 0;
//        int ran2 = 0;
        for (int i4 = 0; i4 < 10; i4++) {
            for (int i = 1; i < size; i++) {
                for (int j = 1; j < size; j++) {
                    int ran1 = ran(size - 1);
                    int ran2 = ran(size - 1);
                    System.out.println(i + " " + j);
                    if (map[i][j] == map[i][j]) {
                        if (ran(1) == 0) {

                            if ( ran1 == 0 ){

                            }

                        }

                    }

                }
                for (int i2 = 0; i2 < size; i2++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(map[i2][j]);
                    }
                    System.out.println();
                }
            }
        }
        }


    static int ran(int max){
        return (int)Math.floor(Math.random()*(max-0+1)+0);
    }
}

//☀, ●

//gets a random number from 0 to 25 and then loops through the map to see if that empty space is available if not repeat
//another random number from 0 to 1 will give our ship type and if it is a short ship it will go though a loop to see if there are ships adjacent
//if it is a large ship then it will loop to check if any adjacent space around the first char is empty if not it will place it there and check for adjacent ships