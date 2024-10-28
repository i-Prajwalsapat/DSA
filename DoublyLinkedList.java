package Collection;


//Node2 class representing doubly linked list
class Node2 {
    int data;		// data to be stored in node
    Node2 next;		// address of next node
    Node2 prev;		// address of previos node
}


class DList {
    Node2 head;		// first element of the list

 // method  for  inserting/adding node or element in the List
    public void insert(int data) {
        Node2 node = new Node2();   // Create a new node
        node.data = data;			// Set the data for the new node
        node.next = null; 			// Set the next pointer of the new node to null  
        node.prev = null;			// Set the previous pointer of the new node to null

        if (head == null) {
            head = node;
        } else {
            Node2 n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }
    }
    // method for adding node at the beggining
    public void insertAtStart(int data) {
        Node2 node = new Node2();
        node.data = data;
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    // method for adding node in between two perticular nodes
    public void insertAt(int index, int data) {
        Node2 node = new Node2();
        node.data = data;
        node.next = null;
        node.prev = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node2 n = head;
            for (int i = 0; i < index - 1; i++) {
                if (n != null) {
                    n = n.next;
                }
            }
            node.next = n.next;
            node.prev = n;
            if (n.next != null) {
                n.next.prev = node;
            }
            n.next = node;
        }
    }
    // method for removing node at perticular index
    public void deleteAt(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            }
        } else {
            Node2 n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            Node2 n1 = n.next;
            if (n1 != null) {
                n.next = n1.next;
                if (n1.next != null) {
                    n1.next.prev = n;
                }
            }
        }
    }
    // method for displaying all the nodes as a list
    public void show() {
        Node2 node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    
    // method for displaying recursively all the nodes as a list
    public void showReverse() {
        Node2 node = head;
        while (node != null && node.next != null) {
            node = node.next;
        }
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
    	
    	// creating object for calling functions
        DList list = new DList();
        
        // Inserting elements at the end of the list
        list.insert(12);
        list.insert(35);
        list.insert(21);
        list.insert(65);

        System.out.println("--- List ---");
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

        // showing recuirsively list  
        System.out.println("--- List in Reverse ---");
        list.showReverse();
    }
}
