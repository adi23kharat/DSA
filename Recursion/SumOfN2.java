public class SumOfN2 {
  static int sumofn(int n){
    if(n == 0){
      return 0;
    }

    return n+sumofn(n-1);
  }
  public static void main(String[] args) {
      System.out.println(sumofn(5));
  }
}
