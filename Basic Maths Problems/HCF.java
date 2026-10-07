class Solution{
  public static int HFactor(int n1,int n2){
    // int hcf = 1;

    // for(int i=2 ; i<=Math.min(n1,n2) ; i++){
    //   if(n1%i == 0  && n2%i == 0){
    //     hcf = i;
    //   }
    // }
    // return hcf;

    while(n1>0 && n2>0){
      if(n1>n2){
        n1 = n1%n2;
      }else{
        n2 = n2%n1;
      }
    }
    if(n1 == 0){
      return n2;
    }else{
      return n1;
    }
  }
}

public class HCF {
  public static void main(String[] args) {
      System.out.println(Solution.HFactor(52, 10));
  }
}
