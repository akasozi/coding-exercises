package co.ke.cloudflow.codingexercises.twopointer;

public class NonDuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {2, 3, 3, 3, 6, 9, 9 };
        int result = moveDuplicates(arr);
        System.out.println("The length is: " + result);

        int[] arr2 = {2, 2, 2, 11};
        result = moveDuplicates(arr2);
        System.out.println("The length is: " + result);
    }

    public static int moveDuplicates(int[] arr) {
        int nextNonDuplicate = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[nextNonDuplicate - 1] != arr[i]) {
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }
}
