
public class LinkedListOperations {
	static LinkedListOperations llo = new LinkedListOperations();
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
	
	public void deleteElement(String dataOrkey) {
		Node temp = head;Node prev = null;
		if(temp !=null && temp.data.equalsIgnoreCase(dataOrkey)) {
			head=temp.next;
		}
		while(!temp.data.equalsIgnoreCase(dataOrkey)) {
			prev=temp;
			temp=temp.next;
		}
		
		
		prev.next=temp.next;
		
	}
	
	public void cyclicNature() {
		Node slowPointer=head;
		Node fastPointer=head;
		while(slowPointer != null && fastPointer != null) {
				slowPointer=slowPointer.next;
				fastPointer=fastPointer.next.next;
			if(slowPointer.next == fastPointer.next.next) {
				System.out.println("Linkedlist is cyclic.");
				return;
			}
			else System.out.println("Singlylinkedlist");
		}
	}
	public void cyclicLinkedlist() {
		Node node = head;
		while(node.next != null) {
			node=node.next;
		}
		node.next=head;
	}
	/*public void findSecondLastElement() {
		Node slowPointer = head;
		Node fastPointer=head;
		while(slowPointer != null && fastPointer !=null) {
			slowPointer = slowPointer.next;
			fastPointer=fastPointer.next.next;
		if(fastPointer.next.next == null) {
			slowPointer=slowPointer.next;
			System.out.println("secondLastElement: "+slowPointer.data);
			break;
		}
		else {
			System.out.println("its  a circular linkedList");
		}
		}
	}*/
	
	public void findSecondLastElement2() {
		Node slowPointer = head;
		Node fastPointer=head.next;
		if(fastPointer==null) {
			System.out.println("list contain only one element : "+head.data);
		}
		else {
		while( fastPointer !=null) {
			if(fastPointer.next==null) {
				System.out.println("second last lement is :"+slowPointer.data);
				break;
			}
			else {
				slowPointer	=slowPointer.next;
				fastPointer=fastPointer.next;
			}
			
		}
		}
	}
	public void reverseSinglyLinkedList() {
		Node current=head;
		Node prev = null;
		Node pointernext= null;
		while(current!=null) {
			pointernext=current.next;
			current.next=prev;
			prev=current;
			current=pointernext;
			head = prev;
	//	System.out.println("reversed list is: "+next.data);
		}
	}

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//String userInput = scan.next();
		
		

		llo.InsertAtLastOrAppend("45");
		llo.InsertAtLastOrAppend("99");
		llo.pushInFront("12");
		llo.InsertInBetweenSpecificNode(llo.head.next, "tyson");
        System.out.println("\nLinked list is: "); 

		llo.printLinkedList();
		//llo.deleteElement("45");
		//llo.cyclicLinkedlist();
		
        System.out.println("\nUpdated Linked list is: "); 
        //llo.printLinkedList();
        
        //llo.cyclicNature();
        llo.findSecondLastElement2();
        llo.reverseSinglyLinkedList();
        llo.printLinkedList();

		
	}
}
