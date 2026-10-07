import java.util.*;
public class UnionOfArray {
  public static void main(String[] args) {
      
    int[] n1 = {1,1,2,3,4,5,6};
    int[] n2 = {2,2,3,4,5,6};

    // n3 = { 1,2,3,4,5,6}

    List<Integer> union = new ArrayList<>();

    
    int i=0;
    int j=0;
    
    while(i<n1.length && j<n2.length){
    
      if(n1[i] < n2[j]){
        if(!union.contains(n1[i])){
          
          union.add(n1[i]);
        }
        i++;
      }else if(n1[i] > n2[j]){
        if(!union.contains(n2[j])){
          
          union.add(n2[j]);
        }
        j++;
      }else{
        if(!union.contains(n2[j])){
          
          union.add(n2[j]);
        }
        j++;
        i++;
      }
    }
    while(j<n2.length){
       if(!union.contains(n2[j])){
                union.add(n2[j]);
                j++; }
    }
    while(i<n1.length){
       if(!union.contains(n1[i])){
                union.add(n1[i]);
                i++; } 
    }

    for(int k:union){
      System.out.print(k);
    }
    
  }
}
