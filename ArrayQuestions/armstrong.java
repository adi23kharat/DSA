class armstrong{
  public static void main(String args[]){
    int n = 1634;
    
    int sum=0;
    int t = n;
    int count=0;
    int original = n;
    do { 
        count++;
        t = t/10;
    } while (t!=0);
    while(n>0){
      sum+=Math.pow(n%10 , count);
      n=n/10;
    }
    if(sum == original){
      System.out.println("given no is armstrong");
    }

  }
}