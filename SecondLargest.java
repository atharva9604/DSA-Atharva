//Brute Force
// Time Complexity: O(n log n) due to sorting
// Space Complexity: O(n)

// import java.util.Arrays;
// public class SecondLargest {
//   public static void main(String[] args){
//     int[] arr = {4};
//     int n = arr.length;
//     getElements(arr, n);
//   }

//   static void getElements(int[] arr, int n){
//     if (n < 2) {
//       System.out.println("Array should have at least two elements");
//       return;
//     }

//     Arrays.sort(arr);
//     int secondLargest = arr[n - 2];
//     int secondSmallest = arr[1];
//     System.out.println("Second largest element: " + secondLargest);
//     System.out.println("Second smallest element: " + secondSmallest);
//   }

// }

//Better Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public static void main(String[] args) {
    int[] arr = {4, 2, 5, 1, 3};

}

static void findSecondLargestAndSmallest(int[] arr) {
    if (arr.length < 2) {
        System.out.println("Array should have at least two elements");
        return;
    }

    int largest = arr[0];
    int secondLargest = -1;

    for(i=1;i<arr.lenth;i++){
      if(arr[i] > largest){
        largest = arr[i];
      }
    }

    for(int i = 0; i < arr.length; i++) {
        if (arr[i] != largest) {
            if (secondLargest == -1 || arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
    }

    if (secondLargest == -1) {
        System.out.println("No second largest element found");
    } else {
        System.out.println("Second largest element: " + secondLargest);
    }
}