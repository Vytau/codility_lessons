package com.company.lesson3;


public class a {

    public a() {
        System.out.println(solution2(10, 85, 30));
        System.out.println(solution2(85, 85, 30));
        System.out.println(solution2(3, 999111321, 7));
    }

    private int solution(int X, int Y, int D) {
        int counter = 0;

        while (X < Y) {
            X += D;
            counter++;
        }

        return counter;
    }

    private int solution2(int X, int Y, int D) {

        return ((Y - X) + D - 1) / D;
    }
}
