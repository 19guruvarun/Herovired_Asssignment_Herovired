import java.util.*;
public class Remove_dup
{
    static class Node {
    int data;
    Node next;
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }  
    static public void removeDuplicates(Node head) {
      Node current = head;
      Node nextNext;
      while (current != null) {
        nextNext = current;
        while (nextNext.next != null) {
          if (current.data == nextNext.next.data) {
            nextNext.next = nextNext.next.next;
          } else {
            nextNext = nextNext.next;
          }
        }
        current = current.next;
      }
    }
    public static void printlink_list(Node start){
        if(start == null){
            System.out.println("no elements are present");
            return;
        }
        
        while(start !=null)
        {
            System.out.print(start.data+" ");
            start = start.next;
        }
    
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    Node start;
    start=converttoLinkedlist(a);
    System.out.println("Original list");
    printlink_list(start);
    System.out.println();
    System.out.println("After removing duplictaes");
    removeDuplicates(start);    
    printlink_list(start);
  }
  public static Node converttoLinkedlist(int[] a){
    Node start = null;

    for(int e:a){
        start = addToEnd(e , start);
    }
    return start;
}
public static Node addToEnd(int val , Node start){
    Node temp = start;
    if(temp == null){
        temp = new Node(val);
        return temp;
    }
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = new Node(val);

    return start;
}

}
  