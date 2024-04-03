//Write a program to find common elements between two arrays in java
import java.util.*;

class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        
        List<Integer> commonElements = findCommonElements(array1, array2);
        
        System.out.println("Common elements: " + commonElements);
    }
    
    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : array1) {
            set1.add(num);
        }
        
        for (int num : array2) {
            set2.add(num);
        }
        
        List<Integer> commonElements = new ArrayList<>();
        
        for (int num : set1) {
            if (set2.contains(num)) {
                commonElements.add(num);
            }
        }
        
        return commonElements;
    }
}
