package com.example.hello.challenges;

import java.util.Arrays;

public class BattleshipGame2NotComplete {

    private char[][] map;
    private int[] pos;

    public int size;

    private final int[][] places = {{0,0},{-1,0},{1,0},{0,-1},{0,1}}; //middle, left, right, up, down

    public BattleshipGame2NotComplete(int size) {
        char[][] map1 = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map1[i][j] = '○';
            }
        }
        this.map = map1;
    }

    public char[][] getMap() {
        return map;
    }

    public void setMap(int size) {

    }

    public int[] getPos() {
        return pos;
    }

    public void setPos(int[] pos) {
        this.pos = pos;
    }

    public void validatePos(){
        char[][] map1 = new char[size][size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                    for (int[] cords : this.places) {
                        if (this.map[i + cords[0]][j + cords[1]] == '○') {
                            map1 = this.map;
                            map1[i][j] = '●';
                            System.out.println(Arrays.deepToString(map1));
                            break;
                        }
                    }


            }
        }
    }
}

//  '☀'  ,  '●'  ,  '○'

//gets a random number from 0 to 25 and then loops through the map to see if that empty space is available if not repeat
//another random number from 0 to 1 will give our ship type and if it is a short ship it will go through a loop to see if there are ships adjacent
//if it is a large ship then it will loop to check if any adjacent space around the first char is empty if not it will place it there and check for adjacent ships