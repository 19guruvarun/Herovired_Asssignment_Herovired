import java.util.*;
public class Mergeandsort 
{
    static class Node {
    int data;
    Node next;
    Node(int data) {
      this.data = data;
      this.next = null;
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
    int b[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        b[i]=sc.nextInt();
    }
    Node head1;
    Node head2;
    Node head;
    head1=converttoLinkedlist(a);
    System.out.println("Original list1:");
    printlink_list(head1);
    System.out.println();
    head2=converttoLinkedlist(b);
    System.out.println("Original list2:");
    printlink_list(head2);
    System.out.println();
    System.out.println("Merged Linked List");
    head=Merge(head1,head2);
    printlink_list(head);
    System.out.println();
    System.out.println("Sorted MergeList");
   head=Sort(head);
   printlink_list(head);
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
public static Node Merge(Node head1, Node head2) {
    Node temp= new Node(0);
    Node t= temp;
    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        t.next = head1;
        head1 = head1.next;
      } else {
        t.next = head2;
        head2 = head2.next;
      }
      t= t.next;
    }
    if (head1 != null) {
      t.next = head1;
    }
    if (head2 != null) {
      t.next = head2;
    }
    return temp.next;
  }
  public static Node Sort(Node head) {
    Node currentNode = head;
    while (currentNode != null) {
        Node minNode = currentNode;
        Node traverseNode = currentNode.next;
        while (traverseNode != null) {
            if (traverseNode.data < minNode.data) {
                minNode = traverseNode;
            }
            traverseNode = traverseNode.next;
        }
        int temp = currentNode.data;
        currentNode.data = minNode.data;
        minNode.data = temp;
        currentNode = currentNode.next;
    }
    return head;
}
}

  