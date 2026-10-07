class Selection{
  static int[] sorting(int n[]){
    for(int i=0 ; i<n.length-2 ; i++){
      int mini = i;                       // mini initialsation
      for(int j=i ; j<n.length-1 ; j++){
        if(n[j]<n[mini]){                   // if j<mini - 
          mini = j;                                 // mini update
        }
      }
      int temp = n[mini];                     // now swap mini with i
      n[mini] = n[i];
      n[i] = temp;
    }
    return n;
   }
  public static void main(String args[]){
    int[] n = {3,42,1,2,5,32,87};
    sorting(n);
    for(int i : n){
      System.out.println(i);
    }
  }
}