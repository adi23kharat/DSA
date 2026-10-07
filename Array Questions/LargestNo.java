class LargestNo{

  public static void main(String[] args) {
      int[] n = {2,1,4,5,6,7};

      int max = n[0];
      for(int i=1 ; i<n.length ; i++){
        if(n[i] > max){
          max = n[i];
        }
      }
      System.out.println(max);
  }
}