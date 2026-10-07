public class Insertion {
  static int[] sorting(int n[]){
  
    for(int i=0 ; i<n.length ; i++){
      int j = i;

      while(j>0 && n[j-1] > n[j]){
        int temp = n[j-1];
        n[j-1] = n[j];
        n[j] = temp;

        j--;
      }
    }
    return n;
  }
  public static void main(String[] args) {
      int[] n ={7,6,4,3,2,1};
      sorting(n);
      for(int i:n){
        System.out.println(i);
      }
  }
}
