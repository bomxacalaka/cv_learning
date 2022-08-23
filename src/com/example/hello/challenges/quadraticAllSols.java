package com.example.hello.challenges;

public class quadraticAllSols {
    public static void main(String[] args) {

        for (int i = -10; i < 10; i++) {
            for (int i2 = -10; i2 < 10; i2++) {
                for (int i3 = -10; i3 < 10; i3++) {
                    if (i == 0){
                        continue;
                    }
                    int o = solution(i,i2,i3);
                    System.out.println(o);
                    //System.out.println(Math.pow(i2, 2) - 4 * i * i3);
                    //b2 – 4ac
                }
            }
        }

    }

    static int solution(int a, int b, int c){

                if (Math.pow(b, 2) - 4 * a * c == 0){
                    return 0;
                }
                if (Math.pow(b, 2) - 4 * a * c < 0){
                    return 1;
                }
                if (Math.pow(b, 2) - 4 * a * c > 0){
                    return 2;
                }
        return 69;
    }
}


//a x² + b x + c = 0