package Collection;


class Node {
    int data;        // Data to be stored in the node
    Node next;       // Address of the next element
}

// CircularLinkedList class representing the circular linked list
class CLinkedList {
    Node head;      // First element of the list (head)

    // Method to inserting element list
    public void insert(int data) {
        Node node = new Node(); // Create a new node
        node.data = data;       // Set the data for the new node
        node.next = head;       // Point the new node to head (to maintain circularity)

        if (head == null) {    
            head = node;       
            head.next = head; 
        } else {
            Node temp = head;   
            while (temp.next != head) { 
                temp = temp.next;
            }
            temp.next = node;   
        }
    }

    // Method to insert a new node at the beginning of the list
    public void insertAtStart(int data) {
        Node node = new Node(); 
        node.data = data;      
        node.next = head;     

        if (head != null) {     
            Node temp = head;    
            while (temp.next != head) {
                temp = temp.next; 
            }
            temp.next = node;    
        } else {
            head = node;         
        }

        head = node;           
    }

    // Method to delete a node at a specific index
    public void deleteAt(int index) {
        if (head == null) return; 

        Node temp = head; 

        if (index == 0) {         
            if (temp.next == head) { 
                head = null;        
            } else {
                while (temp.next != head) { 
                    temp = temp.next; 
                }
                temp.next = head.next; 
                head = head.next;      
            }
        } else {
            for (int i = 0; i < index - 1; i++) { 
                temp = temp.next; 
            }
            Node toDelete = temp.next; 
            if (toDelete == head) {      
                head = head.next;       
            }
            temp.next = toDelete.next;  
        }
    }

    // Method to display the circular linked list
    public void show() {
        if (head == null) return; 

        Node temp = head;         
        do {
            System.out.print(temp.data + " "); 
            temp = temp.next;   
        } while (temp != head);   
        System.out.println();     
    }
}


public class CicularLinkedList {
    public static void main(String[] args) {
    	
    	// Create an instance of CircularLinkedList
        CLinkedList list = new CLinkedList(); 

        // Insert elements at the end of the circular list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Display the circular linked list
        System.out.println("--- Circular Linked List ---");
        list.show(); 

        // Insert an element at the start of the circular list
        list.insertAtStart(5);
        System.out.println("--- After Inserting ele at Starting ---");
        list.show(); // Display the circular linked list

        // Delete an element at a specific index
        list.deleteAt(2); // Delete the node at index 2
        System.out.println("--- After Deleting at Index 2 ---");
        list.show(); // Display the circular linked list
    }
}
