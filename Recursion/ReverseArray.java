public class ReverseArray {

  static void reverse(int l,int r,int[] n){
    if(l>=r){
      return;
    }
    int temp = n[l];
    n[l] = n[r];
    n[r] = temp;

    reverse(l+1 , r-1 ,n);
  }
  public static void main(String[] args) {
      int[] n = {1,2,3,4,5};
      reverse(0,n.length-1,n);
      for(int i:n){
        System.out.print(i);
      }
  }
}
