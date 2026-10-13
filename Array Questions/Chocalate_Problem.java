import java.util.*;
public class Chocalate_Problem {

  public static int findmin(int[] a, int m){
    int minDiff = Integer.MAX_VALUE;
    Arrays.sort(a);

    for(int i=0 ; i<=a.length-m ; i++){
      int diff = a[i+ m - 1] - a[i];
      minDiff = Math.min(diff,minDiff);
    }

    return minDiff;

  }
  public static void main(String[] args) {
    
    // Input: arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 3 
    // Output: 2 
    int[] arr = {7, 3, 2, 4, 9, 12, 56};
    int m = 3;
    System.out.println(findmin(arr,m));
  }
}
