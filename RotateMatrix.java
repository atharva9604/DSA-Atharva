import java.util.*;
public class RotateMatrix {
  public static void main(String[] args){
    int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    rotate(arr);
    System.out.println("Rotated Image");
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr.length; j++) {
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }
  }

  static void rotate(int [][] matrix){
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j<matrix[0].length; j++){
        int temp = 0;
        temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix.length; j++){
        int temp = 0;
        matrix[i][j] = matrix[i][matrix.length - 1 - j];
        matrix[i][matrix.length - 1 - j] = temp;
      }
    }
  }
}
