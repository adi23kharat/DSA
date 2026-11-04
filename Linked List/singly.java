
import java.util.Scanner;

class aditya{
  int data;
  aditya next;

  aditya(int data){
    this.data = data;
    this.next = null;
  }
}
class linkedlist{

  aditya head;

  void append(int data){
    aditya newnode = new aditya(data);

    if(head == null){
      head = newnode;
      return;
    }
    else{
      aditya temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newnode;
    }
  }

  void display(){
    aditya temp = head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
  }

  void insert(int data,int pos){

    aditya newNode = new aditya(data);
    if(pos == 1){
      newNode.next = head;
      head = newNode;
      
    }
    else{
      aditya temp = head;
      int current = 1;

      while(current != pos-1){
        temp = temp.next;
        current++;
      }
      newNode.next = temp.next;
      temp.next = newNode;
      
    }
  }

  void delete(int val){
    
    if(head.data == val){
      head = head.next;
    }
    else{

      aditya temp = head;

      while(temp!=null){
        
        if(temp.next.data == val){
          temp.next = temp.next.next;
          break;
        }else{

          temp = temp.next;
        }
      }
    }
  }

  void reverse(){

    aditya prev = null;
    aditya curr = head;

    while(curr != null){
      aditya next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  } 
}

class singly{
  public static void main(String args[]){
    linkedlist l = new linkedlist();

    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your n: ");
    // int n = sc.nextInt();

    // for(int i=0 ; i<n ; i++){
      
    //  l.append(sc.nextInt());
    // }
    
    
    System.out.println(6/2);
   
    
    l.display();
    l.reverse();
    System.out.println();
    l.display();
  }
}