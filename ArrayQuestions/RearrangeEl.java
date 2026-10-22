class RearrangeEl{
  public static int[] arrange(int[] n){
    int p=0;
    int e=1;
    int[] ans = new int[n.length];
    for(int i:n){
      if(i>0){
        ans[p] = i;
        p+=2;
      }else{
        ans[e] = i;
        e+=2;
      }
    }
    return ans;
  }
  public static void main(String args[]){
    int[] n= {3,1,-2,-5,2,-4};
    int[] ans = arrange(n);
    for(int i:ans){
      System.out.print(i+" ");
    }

  }
}