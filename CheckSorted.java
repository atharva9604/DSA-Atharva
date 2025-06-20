import java.util.*;

public class CheckSorted {
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 5, 6};
        boolean result = checkSorted(arr); // Call to checkSorted method
        
        System.out.println("The array is sorted: " + result);
    }
    
    static boolean checkSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

//Better Solut