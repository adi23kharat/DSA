class ProductExceptItself{
  public static void main(String[] args) {
      
    int[] n = {1,2,3,4};
    int[] ans = new int[n.length];
    // o/p : { 24,12,8,6}

    // optimal solution

    ans[0] = 1;

    for(int i=1 ; i<n.length ; i++){
      ans[i] = ans[i-1] * n[i-1];
    }

    int suffix = 1;

    for(int i=n.length-2 ; i>=0 ; i--){
      suffix = suffix * n[i+1];
      ans[i] = ans[i] * suffix;
    }



    // better solution

    // int[] prefix = new int[n.length];
    // int[] suffix = new int[n.length];
    // prefix[0] = 1;
    // for(int i=1 ; i<n.length ; i++){
    //   prefix[i] = prefix[i-1] * n[i-1];
    // }
    // suffix[n.length-1] = 1;
    // for(int i=n.length-2 ; i>=0 ; i--){
    //   suffix[i] = suffix[i+1] * n[i+1];
    // }
    // for(int i=0 ; i<n.length ; i++){
    //   ans[i] = prefix[i] * suffix[i];
    // }


    // brute solution

    // for(int i=0 ; i<n.length ; i++){
    //   int product = 1;
    //   for(int j=0 ; j<n.length ; j++){
    //     if(i!=j){
    //       product = product * n[j];
    //     }
    //   }
    //   ans[i] = product;
    // }

    for(int i:ans){
      System.out.print(i+" ");
    }
  }
}