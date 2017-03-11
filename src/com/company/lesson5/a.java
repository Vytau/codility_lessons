package com.company.lesson5;


public class a {

    public a() {
        System.out.println(solution2(6, 11, 2));
        System.out.println(solution2(5, 11, 2));
        System.out.println(solution2(11, 11, 2));
        System.out.println(solution2(0, 0, 2));
    }

    private int solution(int A, int B, int K) {
        int counter = 0;

        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                counter++;
            }
        }

        return counter;
    }

    private int solution2(int A, int B, int K) {
        if (B < K) {
            return 0;
        }

        int num1 = A / K;
        if (A % K != 0) {
            num1++;
        }

        int num2 = B / K;

        return num2 - num1 + 1;
    }
}
