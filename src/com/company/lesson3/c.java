package com.company.lesson3;


import java.util.stream.IntStream;

public class c {

    public c() {
        System.out.println(solution(new int[] {3, 1, 2, 4, 3}));
    }

    private int solution(int[] A){
        int lSum = IntStream.of(A).sum();
        int rSum = 0;
        int minDif = Integer.MAX_VALUE;
        int N = A.length - 1;

        while (N > 0){
            lSum -= A[N];
            rSum += A[N];
            if(Math.abs(lSum - rSum) < minDif){
                minDif = Math.abs(lSum - rSum);
            }
            N--;
        }

        return minDif;
    }
}
