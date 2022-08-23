package com.example.hello.challenges;

public class isHappy {
    public static void main(String[] args){



        for (int i = 0; i < 1000; i++) {
            System.out.println(isHappy(i));

        }


        }

        static boolean isHappy(int i){
            int h = 0;
            for (String a : Integer.toString(i).split("")) {
                h += Math.pow(Integer.parseInt(a), 2);
            }
            while (true) {
                i=h;
                h = 0;
                for (String a : Integer.toString(i).split("")) {
                    h += Math.pow(Integer.parseInt(a), 2);
                }
                if(h==4){
                    return false;
                } else if (h == 0 || h == 1) {
                    return true;
                }

            }
        }



    }

    //3 -> 9 -> 81 -> 65 -> 61 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4

//            true
//            true
//            false
//            false
//            false
//            false
//            false
//            true
//            false
//            false
//            true
//            false
//            false
//            true
//            false
//            false
//            false
//            false
//            false
//            true
//            false
//            false
//            false
//            true
//            false
//            false
//            false
//            false
//            true
//            false
//            false
//            true
//            true
//            false
//            false
//            false
//            false
//            false
//            false
//            false
//            false
//            false
//            false
//            false
