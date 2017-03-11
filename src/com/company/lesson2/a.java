package com.company.lesson2;


import java.util.Arrays;

public class a {

    public a() {
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9, 7, 6, 5, 6}));
        System.out.println(solution(new int[]{23}));
    }

    private static int solution(int[] A) {
        Arrays.sort(A);
        int lng = A.length;

        for (int i = 0; i < lng; i += 2) {
            if (i == lng - 1) {
                return A[i];
            }

            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }

        return -1;
    }

    //another possible solution
    public static int solution2(int[] A) {
        // write your code in Java SE 8
        int elem = 0;

        for (int i = 0; i < A.length; i++) {
            elem ^= A[i];
        }
        return elem;
    }
}
