public class RemoveDup {
  public static void main(String[] args) {
      int[] n = {1,1,2,2,3,3,4,4,5};
      int k=0;

      for(int i=0 ; i<n.length ; i++){
        if(n[i] != n[k] ){
          k++;
          n[k] = n[i];
        }
      }
      for(int i=0 ; i<k+1; i++){
        System.out.println(n[i]);
      }
  }
}
