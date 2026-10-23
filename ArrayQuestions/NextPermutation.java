class NextPermutation{

  public static void nextPer(int[] n){
    int i=n.length-2;
    
    // find pivot
    while(i>=0 && n[i] > n[i+1]){
      i--;
    }
    // swap with greater having on right

    if(i>=0){
      int j = n.length-1;
      while(n[i] >= n[j]){
        j--;
      }

      int temp = n[i];
      n[i] = n[j];
      n[j] = temp;
    }

    // reverse el after pivot to last
    reverse(n,i+1,n.length-1);
  }

  private static void reverse(int[] n,int l,int r){
    while(l<=r){
      int temp = n[l];
      n[l] = n[r];
      n[r] = temp;

      l++;
      r--;
    }
  }
  public static void main(String[] args) {
    int[] n = {1,3,5,4,2};
    // find next permutaion
    // o/p : {1,4,2,3,5}
    nextPer(n);
    for(int i:n){
      System.out.print(i+" ");
    }

  }
}