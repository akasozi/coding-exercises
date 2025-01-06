package co.ke.cloudflow.codingexercises.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = {{1,2}, {3,5}, {6,7}, {8,10}, {12, 16}};
        int[] newInterval = {4, 8};

        int[][] result = insert(intervals, newInterval);
        printArray(result);
    }

    public static void printArray(int[][] intervals) {
        System.out.println("{");
        for (int[] interval : intervals) {
            System.out.println(" { " + interval[0] + ", " + interval[1] + " } ");
        }
        System.out.println("}");
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> output = new ArrayList<>();
        for (int[] row: intervals) {
            output.add(row);
        }
        output.add(newInterval);
        int[][] intervalsInternal = output.toArray(new int[output.size()][]);
        Arrays.sort(intervalsInternal, (arr1, arr2) -> arr1[0] - arr2[0]);
        output.clear();
        int[] current = intervalsInternal[0];
        output.add(current);

        for (int[] interval : intervalsInternal) {
            if (current[1] >= interval[0]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                current = interval;
                output.add(current);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}
