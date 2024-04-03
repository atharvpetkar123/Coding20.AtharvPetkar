//Program to rotate array elements left by 1 position
class RotateArrayLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(array);

        rotateLeft(array);

        System.out.println("\nArray after rotating left by 1 position:");
        printArray(array);
    }

    public static void rotateLeft(int[] array) {
        if (array.length <= 1) {
            return; // No need to rotate if the array has 0 or 1 element
        }

        int firstElement = array[0];

        // Shift elements to the left
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }

        // Move the first element to the end
        array[array.length - 1] = firstElement;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
