// Leetcode 75
class SortColors{
  public static void main(String[] args) {
      int[] n = {2,1,0,0,1,2,0,1,2};
      // O/P = [0,0,0,1,1,1,2,2,2]
      int l=0;
      int mid = 0;
      int high = n.length-1;

      while(mid<=high){
        if(n[mid] == 0){
          int temp = n[mid];
          n[mid] = n[l];
          n[l] = temp;

          l++;
          mid++;
        }
        else if(n[mid] == 2){
          int temp = n[mid];
          n[mid] = n[high];
          n[high] = temp;
          high--;
        }
        else if(n[mid] == 1){
          mid++;
        }
      }
      for(int i:n){
        System.out.print(i);
      }
  }
}