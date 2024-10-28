package Collection;

class Node{
	
	int data;    // data  of the element
	Node next;	 // address of next element in the list
}

// class representing the singly linked list
class LList{
	
	Node head;    // first element of the list
	
	// method  for  inserting/adding node or element in the List
	public void insert(int data) {
		
		Node node = new Node();  // Create a new node
		node.data = data;		 // Set the data for the new node
		node.next = null;		 // Set the next pointer of the new node to null
		
		if(head == null) {
			head = node;	
		}else {
			Node n = head;
			while(n.next != null) { 	// Traverse to the end of the list
				n =  n.next;
			}
			n.next = node;		// Set the next pointer of the last node to the new node
		}
	}

	// method for adding node at the beggining
	public void insertAtStart(int data) {
		
		Node node = new Node();
		node.data = data;
		//node.next = null;
		node.next = head;		  // Set the next pointer of the new node to the current head
		head = node;			  // Set the new node as the head
	}
	// method for adding node in between two perticular nodes
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0) {
			insertAtStart(data);
		}else {
			
			Node n = head;
			for(int i = 0; i < index; i++) {
				if(n != null) {
				n = n.next;		
				}
			}
			node.next = n.next;
			n.next = node;
		}	
	}
	// method for removing node at perticular index
	public void deleteAt(int index) {
		
		if(index == 0) {
			head = head.next;
		}else {
			
			Node n = head;
			Node n1 = null;
			for(int i = 0; i < index; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next; 	// Set the next pointer of the current node
			System.out.println("n1 "+ n1.data);
			n1 = null;		// Remove the reference to the deleted node
		}
	}
	// method for displaying all the nodes as a list
	public void show() {
		
		Node node = head;
		 while (node != null) {
			 System.out.print(node.data + " ");
	            node = node.next;
	            
	        }
		System.out.println();
	}
	
}

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		// creating object for calling functions
		LList list = new LList();
		
		// Inserting elements at the end of the list
		list.insert(12);
		list.insert(35);
		list.insert(21);
		list.insert(65);
		
		System.out.println("---List---");
		list.show();
		
		// Insert an element at the start of the list
		list.insertAtStart(22);
		list.show();
		
		// Insert an element at a specific index in the list
		list.insertAt(2, 11);
		list.show();
		
	    // Delete an element at a specific index in the list
		list.deleteAt(0);
		list.show();
	}

}
