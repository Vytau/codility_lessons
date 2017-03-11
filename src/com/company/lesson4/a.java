package com.company.lesson4;


import java.util.stream.IntStream;

public class a {

    public a() {
        System.out.println(solution3(new int[]{4, 1, 3, 2}));
        System.out.println(solution3(new int[]{4, 1, 3}));
    }

    private int solution(int[] A) {
        int N = A.length;

        for (int i = 1; i <= N; i++) {
            int finalI = i;
            if (!IntStream.of(A).anyMatch(x -> x == finalI)) {
                return 0;
            }
        }
        return 1;
    }

    private int solution2(int[] A) {
        int N = A.length;

        int sum = N * (N + 1) / 2;
        int ASum = IntStream.of(A).sum();

        if(sum == ASum){
            return 1;
        } else {
            return 0;
        }
    }

    private int solution3(int[] A) {
        int[] counter = new int [A.length];

        for(int i= 0; i< A.length; i++){
            if (A[i] < 1 || A[i] > A.length) {
                // Out of range
                return 0;
            }
            else if(counter[A[i]-1] == 1) {
                // met before
                return 0;
            }
            else {
                // first time meet
                counter[A[i]-1] = 1;
            }
        }
        return 1;
    }
}
