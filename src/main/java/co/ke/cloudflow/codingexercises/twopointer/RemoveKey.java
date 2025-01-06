package co.ke.cloudflow.codingexercises.twopointer;

public class RemoveKey {

    public static void main(String[] args) {
        // Remove all instances of Key
        int[] arr = {3, 2, 3, 6, 3, 10,  9, 3 };

        int length = removeKey(arr, 3);
        System.out.println("Size: " + length);
    }

    public static int removeKey(int[] arr, int key) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
