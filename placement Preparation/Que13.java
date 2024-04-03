//Program to rotate array elements by Kth position left
class RotateArrayLeftK {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2; // Number of positions to rotate left

        System.out.println("Original Array:");
        printArray(array);

        rotateLeftK(array, k);

        System.out.println("\nArray after rotating left by " + k + " positions:");
        printArray(array);
    }

    public static void rotateLeftK(int[] array, int k) {
        int n = array.length;
        k = k % n; // Adjust k in case it's greater than array length

        // Reverse the first k elements
        reverseArray(array, 0, k - 1);

        // Reverse the remaining elements
        reverseArray(array, k, n - 1);

        // Reverse the whole array
        reverseArray(array, 0, n - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
