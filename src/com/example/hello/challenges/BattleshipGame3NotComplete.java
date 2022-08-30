package com.example.hello.challenges;

import java.util.Arrays;

public class BattleshipGame3NotComplete {

    public static void main(String[] args) {

        final int size = 5;

        BattleshipGame2NotComplete map = new BattleshipGame2NotComplete(size);

        map.validatePos();


        System.out.println(Arrays.deepToString(map.getMap()));

        for (int i2 = 0; i2 < size; i2++) {
            for (int j = 0; j < size; j++) {
                System.out.print(map.getMap()[i2][j]);
            }
            System.out.println();
        }

    }
}

//☀, ●

//gets a random number from 0 to 25 and then loops through the map to see if that empty space is available if not repeat
//another random number from 0 to 1 will give our ship type and if it is a short ship it will go though a loop to see if there are ships adjacent
//if it is a large ship then it will loop to check if any adjacent space around the first char is empty if not it will place it there and check for adjacent ships