public class ReverseArray2 {

  static void reverse(int i,int[] n){
    if(i>= n.length-1){
      return;
    }
    int temp = n[i];
    n[i] = n[n.length-i-1];
    n[n.length-1-i] = temp;

    reverse(i+1, n);
  }
  public static void main(String[] args) {
      int[] n = {1,2,3,4,8};
      reverse(0,n);
      for (int i:n) {
          System.out.print(i); 
      }
  }
}
