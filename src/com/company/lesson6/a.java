package com.company.lesson6;

import java.util.Arrays;

public class a {

    public a() {
        System.out.println(solution2(new int[]{2, 1, 1, 2, 3, 1}));
        System.out.println(solution2(new int[]{}));
        System.out.println(solution2(new int[]{2}));
    }

    //100% correctness and performance
    private int solution(int[] A){
        if(A.length == 0){
            return 0;
        }
        Arrays.sort(A);
        int counter = 1;
        int lastValue = A[0];

        for(int i = 1; i < A.length; i ++){
            if(A[i] != lastValue){
                lastValue = A[i];
                counter++;
            }
        }

        return counter;
    }

    //slightly a better performance (not tested)
    private int solution2(int[] A){
        if(A.length == 0){
            return 0;
        }

        Arrays.sort(A);
        int counter = 1;

        for(int i = 1; i < A.length; i ++){
            if(A[i] != A[i-1]){
                counter++;
            }
        }

        return counter;
    }
}
