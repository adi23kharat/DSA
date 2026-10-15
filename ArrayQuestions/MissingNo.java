public class MissingNo {
  public static void main(String[] args) {
      
    int[] num = {1,2,3,5};

    int result = 0;

    for(int i=1 ; i<num.length ; i++){
      result ^= i^num[i];
    }
    System.out.println(result);
    


    
  }
}
