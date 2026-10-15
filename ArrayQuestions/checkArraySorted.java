public class checkArraySorted {
  public static void main(String[] args) {
      int[] n = {1,2,3,4,4,6};
      boolean flag = true;
      for(int i=0 ; i<n.length-1 ; i++){
        if(n[i] > n[i+1]){
          flag = false;
        }
      }
      System.out.println(flag);
  }
}
