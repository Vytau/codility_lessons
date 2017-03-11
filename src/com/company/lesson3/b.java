package com.company.lesson3;


import java.util.stream.IntStream;

public class b {

    private int y;

    public b() {

        System.out.println(solution2(new int[]{2, 3, 1, 5}));
        System.out.println(solution2(new int[] {}));
        System.out.println(solution2(new int[] {2, 3, 1, 5, 4, 6, 7, 9}));
        System.out.println(solution2(new int[] {0, 3, 10, 5, 4, 6, 7, 9}));
    }

    private int solution(int[] A) {

//        for(int i = 0; i < A.length; i ++){
//            boolean found = false;
//            for(int j = 0; j < A.length; j++){
//                if (i+1 == A[j]){
//                    found = false;
//                    break;
//                }
//                found = true;
//            }
//            if(found){
//                return i+1;
//            }
//        }
        for (int i = 0; i < A.length; i++) {
            int finalI = i + 1;
            if (!IntStream.of(A).anyMatch(x -> x == finalI)) {
                return finalI;
            }
        }

        return 1;
    }

    private int solution2(int A[]) {
        int N = A.length + 1;
        //triangle calculation formula eg. 1 + 2 + 3 + .... + n+1
        int sum = N * (N + 1) / 2;
        int sumA = IntStream.of(A).sum();


        return sum - sumA;
    }
}
