//Write a program to find a missing number in an array.
class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // Array with one missing number
        int n = 10; // Assuming the array should contain numbers from 1 to 10

        int missingNumber = findMissingNumber(array, n);

        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array, int n) {
        // Calculate the sum of first n natural numbers
        int sumOfFirstNNumbers = n * (n + 1) / 2;

        // Calculate the sum of elements in the array
        int sumOfArrayElements = 0;
        for (int num : array) {
            sumOfArrayElements += num;
        }

        // The missing number will be the difference between the sum of first n numbers
        // and the sum of elements in the array
        int missingNumber = sumOfFirstNNumbers - sumOfArrayElements;

        return missingNumber;
    }
}
