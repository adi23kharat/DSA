import java.util.Arrays;
import java.util.HashMap;

class Two_Sum{
  public static int[] twosum(int[] n, int target){
    HashMap<Integer,Integer> map = new HashMap<>();

    for (int i = 0; i < n.length; i++) {
          if(map.containsKey(target-n[i])){
            return new int[] {map.get(target-n[i]) , i};
          }
          map.put(n[i],i);
    }
    return new int[] {};
  }
  public static void main(String[] args) {
    int[] n = {2,7,11,15};   // leetcode 1
    int target = 9;
    int[] result = Two_Sum.twosum(n, target);
    System.out.println(Arrays.toString(result));

  }
}