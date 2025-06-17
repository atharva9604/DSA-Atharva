// //Brute Force Approach
// // Time Complexity: O(n log n) due to sorting
// // Space Complexity: O(n)
// import java.util.*;
// public class LargestElement {
//   public static void main(String[] args) {
//     int[] arr1 = {1, 2, 3, 4, 5};
//     System.out.println("Largest element in arr1: " + sort(arr1));
//     int[] arr2 = {7, 2, 1, 4, 9};
//     System.out.println("Largest element in arr2: " + sort(arr2));

//   }

//  static int sort(int[] arr) {
//       Arrays.sort(arr);
//       return arr[arr.length - 1];
//  }
// }

//Optimized Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
public class LargestElement {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    System.out.println("Largest element in arr1: " + findLargest(arr1));
    int[] arr2 = {7, 2, 1, 4, 9};
    System.out.println("Largest element in arr2: " + findLargest(arr2));
  }

  static int findLargest(int[] arr) {
    int largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }
}

