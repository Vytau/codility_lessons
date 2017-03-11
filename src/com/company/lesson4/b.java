package com.company.lesson4;


import java.util.Arrays;
import java.util.stream.IntStream;

public class b {

    public b() {
        System.out.println(solution2(5, new int[]{1, 3, 1, 4, 2, 3, 5, 3}));
        System.out.println(solution2(5, new int[]{1, 3, 1, 4, 3, 3, 5, 2}));
        System.out.println(solution2(1, new int[]{1}));
        System.out.println(solution2(1, new int[]{3}));
    }

    //100% correctness but 0% performance
    private int solution(int X, int[] A) {
        int N = A.length;
        int[] checker = new int[X];

        for (int i = 0; i < N; i++) {
            if (A[i] <= X) {
                checker[A[i] - 1] = 1;
                if (!IntStream.of(checker).anyMatch(x -> x == 0)) {
                    return i;
                }
            }
        }

        return -1;
    }

    //not checked but looks like a better solution performance wise
    private int solution2(int X, int[] A) {
        int N = A.length;
        int[] checker = new int[X];
        int counter = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] - 1 < X && checker[A[i] - 1] == 0) {
                checker[A[i] - 1] = 1;
                counter++;
            }
            if (counter == X) {
                return i;
            }

        }

        return -1;
    }
}
