class majority_El{
  public static int majorityEl(int[] n){
    
    for(int i=0 ; i<n.length ; i++){
      int count=0;
      for(int j=0 ; j<n.length ; j++){
        if (n[i] == n[j]){
          count++;
        }

      }
      if(count >= n.length/2){
        return n[i];
      }
    }
    return 0;
  }


  public static void main(String args[]){
    // [1,2,2,3,3,3]
    // o/p : 3
    int[] n = {1,2,2,3,3,3,2,2,2,2};
    System.out.println(majorityEl(n));
  }
}