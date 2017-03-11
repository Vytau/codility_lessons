package com.company.lesson4;

import java.util.stream.IntStream;

public class c {

    public c() {
        System.out.println(solution2(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution2(new int[]{1}));
        System.out.println(solution2(new int[]{2}));
    }

    private int solution(int[] A) {

        for (int i = 0; i < A.length; i++) {

            int finalI = i + 1;
            if (IntStream.of(A).noneMatch(x -> x == finalI)) {
                return finalI;
            }
        }

        return -1;
    }

    //better solution performance wise
    private int solution2(int[] A) {
        int N = A.length;
        int[] tmp = new int[N];

        for (int i = 0; i < N; i++) {
            if (A[i]-1 < N && tmp[A[i]-1] == 0) {
                tmp[A[i] - 1] = 1;
            }
        }

        for (int i = 0; i < N; i++) {
            if (tmp[i] == 0) {
                return i + 1;
            }
        }

        return -1;
    }
}
