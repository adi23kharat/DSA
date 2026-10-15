public class SecSmallest {
  public static void main(String[] args) {
      int[] n = {2,3,1,35,65,3,8};

      int smallest = n[0];
      int sec = Integer.MAX_VALUE;

      for(int i=0 ; i<n.length ; i++){
        if(n[i]<smallest){
          sec = smallest;
          smallest = n[i];
        }
        else if(n[i] > sec && n[i] < smallest){
          sec = n[i];
        }
      }
      System.out.println(sec);
  }
}
