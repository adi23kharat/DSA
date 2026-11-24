import java.util.HashSet;

class longestConsecutive{
  public static Boolean linearSearch(int[] n,int target){
    for(int i:n){
      if(i==target){
        return true;
      }

    }
    return false;
  }
  public static void main(String[] args) {
    int[] nums = {100,4,200,1,3,2};
    // o/p = 4

    // brute
    // int longest = 0;
    // for(int i=0 ; i<nums.length ; i++){
    //   int current = nums[i];
    //   int count = 1;
    //   while(linearSearch(nums,current+1)){
    //     current++;
    //     count++;
    //   }
    //   longest = Math.max(longest,count);
    // }
    // System.out.println(longest);

    // better
    // int longest = 1;
    // int count = 1;
    // Arrays.sort(nums);
    // for(int i=1 ; i<nums.length ; i++){
    //   if(nums[i] == nums[i-1]){
    //     continue;
    //   }
    //   else if(nums[i] == nums[i-1]+1){
    //     count++;
    //   }
    //   else{
    //     count = 0;
    //   }
    //   longest = Math.max(longest, count);
    // }
    // System.out.println(longest);

    // optimal
    HashSet<Integer> set = new HashSet<>();
    for(int i:nums){
      set.add(i);
    }
    int longest = 0;

    for(int i:set){
      if(!set.contains(i-1)){
        int current = i;
        int count = 1;
        while(set.contains(current+1)){
          count++;
          current++;
        }

        longest = Math.max(longest,count);
      }
    }
    System.out.println(longest);

    
  }
}