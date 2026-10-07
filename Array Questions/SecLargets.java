public class SecLargets {
  public static void main(String[] args) {
      int[] n = {2,3,6,1,1,4};
      int largest = n[0];
      int sec = Integer.MIN_VALUE;
    
      for(int i=0 ; i<n.length ; i++){
        if(n[i]>largest){
          sec = largest;
          largest = n[i];
        }
        else if(n[i]>sec && n[i] < largest){
          sec = n[i];
        }
      }
      System.out.println(sec);

  }
}
