package co.ke.cloudflow.codingexercises.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

    public static void main(String[] args) {
        // [1, 2, 3, 4, 6], target=6
        // Output: [1, 3] and [2, 4]

        int[] result = search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        result = search(new int[] { 2, 5, 9, 11}, 11);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] searchOptimized(int[] input, int targetSum) {
        int i = 0, j = input.length - 1;
        while (i < j) {
            int currentSum = input[i] + input[j];
            if (currentSum == targetSum) {
                return new int[] {i, j};
            }

            if (currentSum < targetSum)
               i++;
            else
               j--;
        }
        return new int[] {-1, -1};
    }

    // Naive solution
    public static int[] search( int[] input,  int targetSum) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == targetSum) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] searchWithHashTable(int[] input, int targetSum) {
        Map<Integer, Integer> hashTable = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            hashTable.put(input[i], i);
        }

        for (int i = 0; i < input.length; i++) {
            int complement = targetSum - input[i];
            if (hashTable.containsKey(complement))
        }
    }
}
