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

  public static int[] arrange2(int[] n){
    int p=0;
    int e = 1;
    int[] ans = new int[n.length];
    for(int i=0 ; i<n.length-1 ; i++){
      if(n[i]>0){
        ans[p] = n[i];
        p+=2;
      }
      else{
        ans[e] = n[i];
        e+=2;
      }
    }
    ans[n.length-1] = n[n.length-1];
    return ans;
  }
  public static void main(String args[]){
    // int[] n= {3,1,-2,-5,2,-4};

    // variety 2
    int[] n= {1,2,-4,-5,3,6};

    // o/p = {1,-4,2,-5,3,6}

    int[] ans = arrange2(n);
    for(int i:ans){
      System.out.print(i+" ");
    }

  }
}