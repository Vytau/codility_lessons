package com.company.lesson1;

public class a {

    public a() {

        System.out.println(solution(51712));
    }

    private static int solution(int N) {
        String binary = Integer.toBinaryString(N); //convert integer to binary
        System.out.println(binary);
        int longest = 0; //longest 0's counter
        int current = 0;
        //loop through binary number starting from left to right
        for (int i = 0; i <= binary.length() - 1; i++) {
            if ("0".equals(Character.toString(binary.charAt(i)))) {
                current++;
                if (current > longest) {
                    longest = current;
                }
            } else {
                current = 0;
            }
        }
        return longest;
    }

    //more efficient solution
    private static int solution2(int N) {
        int ptr; //Used for bitwise operation.
        for (ptr = 1; ptr > 0; ptr <<= 1) //Find the lowest bit 1
            if ((N & ptr) != 0)
                break;
        int cnt = 0; //Count the (possible) gap
        int ret = 0; //Keep the longest gap.
        for (; ptr > 0; ptr <<= 1) {
            if ((N & ptr) != 0) { //If it's bit 1
                ret = cnt < ret ? ret : cnt; //Get the bigger one between cnt and ret
                cnt = -1; //Exclude this bit
            }
            cnt++; //Increment the count. If this bit is 1, then cnt would become 0 beause we set the cnt as -1 instead of 0.
        }
        return ret;
    }
}
