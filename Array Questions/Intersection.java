
import java.util.ArrayList;

class InterSection{
  public static void main(String[] args) {

    int[] n1 = {1,2,2,3,3,4,5,6};
    int[] n2 = {2,3,5,6,6,7};

    // { 2,3,5,6}
    ArrayList<Integer> k = new ArrayList<>();
    int i=0;
    int j=0;

    while(i<n1.length && j<n2.length){
      if(n1[i] == n2[j]){
        // if(!k.contains(n1[i])){

        // }
        k.add(n1[i]);
        i++;
        j++;
      }
      else if(n1[i] < n2[j]){
        i++;
      }else{
        j++;
      }
    }

    for(int p:k){
      System.out.print(p+" ");
    }

  }
}