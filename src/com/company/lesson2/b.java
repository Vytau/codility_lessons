package com.company.lesson2;


import java.util.Arrays;

public class b {


    public b() {
        System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 1)));
    }

    private int[] solution(int A[], int K) {
        if (A.length == 0 || A.length == 1 || K == 0)
            return A;

        int module = K % A.length;
        if (module == 0)
            return A;

        int[] first = Arrays.copyOfRange(A, A.length - module, A.length);
        int[] second = Arrays.copyOfRange(A, 0, A.length - module);
        int[] result = new int[A.length];

        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

}
