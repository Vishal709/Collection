import java.util.Scanner;

public class LinkedListOperations {
	
	Node head;
	class Node {
		private String data;
		private Node next;
		Node(String data){
			this.data = data;
			this.next=null;
		}
	}
	public void pushInFront(String data) {
		Node node_front= new Node(data);
		//node_front.data=data;
		node_front.next=head;
		head=node_front;
	}
	
	public void InsertInBetweenSpecificNode(Node prev_node , String data) {
		Node newNode = new Node(data);
		if(prev_node.next != null) {
			newNode.next=prev_node.next;
			prev_node.next=newNode;
		}
		else {
			return;
		}
	}
	
	/*
	  public void InsertAtLast(Node prev_node, String data) { 
	  Node newLastNode = new Node(data); 
	  if(prev_node.data !=null && prev_node.next == null) {
	  	newLastNode.next=prev_node.next; 
	  	prev_node.next=newLastNode; 
	  	} 
	  	
	 else if(prev_node.data == null && prev_node.next == null) { 
	 	prev_node=newLastNode;
	  	return; 
	  } 
	  else { return; } 
	  }
	 */
	
	
	// Alternative to above Insert at last method.
	  public void InsertAtLastOrAppend(String data) { 
		  Node newLastNode = new Node(data);
	  
	  if(head == null) { head = newLastNode; return; } else { Node node = head;
	  while(node.next != null) node=node.next;
	  
	  node.next= newLastNode; return; } }
	 
	
	public void printLinkedList() {
		Node node=head;
		while(node != null) {
			System.out.print(node.data);
			node=node.next;
		}
	}

	public static void main(String[] args) {
		System.out.println("enter data to enter to linkedList:");
		//Scanner scan = new Scanner(System.in);
		//String userInput = scan.next();
		LinkedListOperations llo = new LinkedListOperations();
		

		llo.InsertAtLastOrAppend("45");
		llo.InsertAtLastOrAppend("99");
		llo.pushInFront("12");
		llo.InsertInBetweenSpecificNode(llo.head.next, "tyson");
        System.out.println("\nLinked list is: "); 

		llo.printLinkedList();
		
	}
}
