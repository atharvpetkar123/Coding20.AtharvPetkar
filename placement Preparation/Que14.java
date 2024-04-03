// Program to remove duplicate elements from the array
import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 1};

        System.out.println("Original Array:");
        printArray(array);

        int[] result = removeDuplicates(array);

        System.out.println("\nArray after removing duplicates:");
        printArray(result);
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        // Iterate through the array and add unique elements to the set
        for (int num : array) {
            if (!set.contains(num)) {
                set.add(num);
                list.add(num);
            }
        }

        // Convert the list back to an array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
