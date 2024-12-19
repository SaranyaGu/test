package com.example.DSChallenges;

import java.util.Arrays;

public class ArrayPairSum {

    public static void main(String[] args) {
        int[] intArray = new int[]{-5, -2, 3, 3, 4, 8, 10};
        int target = 7;
        int[] resultArray = sumOfArrayIndex(intArray, target);
        System.out.println("Index of array with sum 7" + Arrays.toString(resultArray)) ;
        //return resultArray;
    }

    public static int[] sumOfArrayIndex(int[] array, int target) {
        int j = array.length-1;
        for (int i = 0; i < array.length && j > 0;) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            } else if (array[i] + array[j] < target) {
                  i++;
            } else {
                  j--;
            }
        }
        return new int[]{};
    }
}
