package com.example.hello.enums;

public class Main {
    public static void main(String[] args) {
        difficulty gameDifficulty = difficulty.HARD;
        gameDifficulty = difficulty.MEDIUM;

        ToolTier tool = ToolTier.DIAMOND;
        System.out.println(tool.getAttackMultiplier());
    }
}
