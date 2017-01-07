package hackerrank.datastructure;

/*
Insert Node at the beginning of a linked list 
head pointer input could be NULL as well for empty list
Node is defined as 
class Node {
   int data;
   Node next;
}
*/
//This is a "method-only" submission. 
//You only need to complete this method. 

Node Insert(Node head,int x) {
    // Complete this method
  
   Node newNode = new Node();
  newNode.data = x;
  
  if(head == null) {
      head = newNode;
      newNode.next = null;
      return head;
  }
  newNode.next = head;
  head = newNode;
  return head;
}

