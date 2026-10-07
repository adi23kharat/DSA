public class LeftMove {
  public static void reverse(int[] a,int l,int r){
    while(l<r){
      int temp = a[l];
      a[l] = a[r];
      a[r] = temp;

      l++;
      r--;
    }
  }
  public static void main(String[] args) {


    // left move by 12
      int[] n={1,2,3,4,5,6,7};
      int k = 3;
      k = k%n.length;
      System.out.println(k);

      reverse(n,0, n.length-1);
      reverse(n,0, n.length-k-1);
      reverse(n,n.length-k, n.length-1);

      for(int i:n){
        System.out.print(i+" ");
      }
      
      

      
  }
}
