import java.util.*;
class Solution{
  
  public static List<Integer> getDivisors(int n){
    List<Integer> l = new ArrayList<>();
    for(int i=1 ; i<Math.sqrt(n) ; i++){
      if(n%i == 0){
          l.add(i);
          
          if(n/i != 0){
            l.add(n/i);
          }
      }
    }
    return l;
  }
}

class divisors{
  public static void main(String[] args) {
      int n = 36;
      List<Integer> l = new ArrayList<>();
      
      l = Solution.getDivisors(n);
      l.sort(null);
      System.out.print(l); 
      
  }
}