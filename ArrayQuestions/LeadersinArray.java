import java.util.ArrayList;

class LeadersinArray{
  public static void main(String args[]){
    int[] arr={10,22,12,3,0,6};
    ArrayList<Integer> nums = new ArrayList<>();
    // 22,12,6

    for(int i=0 ; i<arr.length ; i++){
      int max = arr[i];
      for(int j=i+1 ; j<arr.length ; j++){
        if(arr[j] > max){
          max = arr[j];
        }
      }
      if(max == arr[i]){
        nums.add(arr[i]);
      }

    }

    for(int i:nums){
      System.out.print(i);
    }

    
    // ArrayList<Integer> nums = new ArrayList<>();
        
    //     for(int i=0 ; i<arr.length ; i++){
    //         int j = arr.length-1;
    //         int max=0;
    //         while(i<j){
    //             max = Math.max(arr[i],arr[j]);
    //             System.out.print(arr[j]);
                
    //             j--;
    //         }
    //         if(max == arr[i]){
    //             nums.add(arr[i]);
    //         }
    //     }
    //     for(int i:nums){
    //       System.out.println(i);
    //     }
  }
}