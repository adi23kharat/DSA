public class Bubble {
  static int[] sorting(int n[]){
    for(int j=n.length-1 ; j>0 ; j--){
    for(int i=0 ; i<=j-1 ; i++){
      if(n[i]>n[i+1]){
        int temp = n[i];
        n[i] = n[i+1];
        n[i+1] = temp;
      }

    }
  } return n;
  }
  public static void main(String[] args) {
      int[] n={13,46,24,52,20,9};
      sorting(n);
      for(int i:n){
        System.out.println(i);
      }
  }
}
