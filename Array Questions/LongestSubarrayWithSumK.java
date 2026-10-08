// leetcode 560

class LongestSubarrayWithSumK{

  public static int sum(int k,int[] n){

    int count=0;
    for(int i=0 ; i<n.length ; i++){
      int sum=0;
      for(int j=i ; j<n.length ; j++){
        sum+=n[j];
        if(sum == k){
          count++;
          continue;
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {

    int[] nums = {1,1,1};          // k = 2   op: 2
    int result = sum(2,nums);
    System.out.println(result);
    

  }
}