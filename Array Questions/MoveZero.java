class MoveZero{
  public static void main(String[] args){

    int[] n = {1,0,3,0,2,0,0,2};

    int k=0;
    for(int i=0 ; i<n.length ; i++){
      if(n[i] != 0){
        int temp = n[i];
        n[i] = n[k];
        n[k] = temp;

        k++;
      }
    }

    for(int i:n){
      System.out.print(i+" ");
    }
    
  }
}