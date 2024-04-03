// Find the index of two array elements whose sum is equal to the give
 import java.util.*;

class TwoSumIndices {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSumIndices(array, target);

        if (result != null) {
            System.out.println("Indices of elements whose sum is " + target + ": " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two elements found whose sum is " + target);
        }
    }

    public static int[] findTwoSumIndices(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(array[i], i);
        }

        return null;
    }
}