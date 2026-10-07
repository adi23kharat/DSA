class Solution{
  public static boolean checkPrime(int n){
    int count = 0 ;
    for(int i=1 ; i<=Math.sqrt(n) ; i++){
      if(n%i == 0){
        count++;
        if(n/i != i){
          count++;
        }
      }
    }
    if(count == 2){
      return true;
    }else{
      return false;
    }
  }
}


public class prime {
  public static void main(String[] args) {
    System.out.println(Solution.checkPrime(5)); 
  }
}
