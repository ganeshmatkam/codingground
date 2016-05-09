import java.util.Scanner;

public class Array2D {
  public static void main (String[] args){
    int i, j, m,n, arr[][];
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size of the array(m n): ");
    m = scan.nextInt();
    n = scan.nextInt();
    arr = new int[m][n];
    for(i=0;i<m;i++){
      for(j=0;j<n;j++){
        arr[i][j] = scan.nextInt();
      }
    }
    printArray(arr);
    SwapArray(arr);
    printArray(arr);
  }
  public static void SwapArray(int[][] arr){
    int i,j,temp[];
    temp = arr[0];
    for(i=1;i<arr.length;i++){
      arr[i-1] = arr[i];
    }
    arr[i-1] = temp;
  }
  public static void printArray (int[][] arr){
    int i,j;
    System.out.println("-----------------");
    for(i=0;i<arr.length;i++){
      for(j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.print("\n");
    }
  }
}