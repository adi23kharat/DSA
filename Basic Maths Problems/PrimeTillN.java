public class PrimeTillN {
  public static void main(String[] args) {
      int n = 6;
      int p=0;
      // 2,3,5
      for(int i=2 ; i<n ; i++){
        for(int j=2 ; j<i ; j++){
          if(i%j==0){
            p=1;
          }
        }
        if(p==0){
          
        }
      }
  }
}
