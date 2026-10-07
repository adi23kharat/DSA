public class nTimesName {
  static void name(int i,int n){
    if(i>n){
      return;
    }

    System.out.println("Ashok");
    name(i+1,n);
  }
  public static void main(String[] args) {
      int i = 1;
      int n = 5;
      name(i,n);
  }
}
