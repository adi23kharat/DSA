class Leetcode123{
  public static int buyAndSell(int[] n){
    int buy1 = -n[0];
    int sell1 = 0;
    int buy2 = -n[0];
    int sell2 = 0;

    for(int i=1 ; i<n.length ; i++){
      int price = n[i];

      buy1 = Math.max(buy1, -price);
      sell1 = Math.max(sell1 , buy1 + price);
      buy2 = Math.max(buy2 , sell1 - price);
      sell2 = Math.max(sell2 , buy2 + price);
    }
    return sell2;
  }
  public static void main(String[] args) {
    
    // int[] n = {3,3,5,0,3,1,4};
    int[] n = {1,2,3,4,5,6};
    // o/p =6     0-3 , 1-4
    // best time to buy and sell III
    System.out.println(buyAndSell(n));


  }
}