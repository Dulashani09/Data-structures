class Node {
    int data;  
    Node next; 

    Node(int data) {
        this.data = data;
        this.next = null; // The next node is null
    }
}

class LinkedList {
    Node head; // Head node of the list

    // Insert a new node at the end of the list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If list is empty set head to new node
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) { // Traverse to the last node
            current = current.next;
        }
        current.next = newNode; // Link the last node to the new node
    }

    // Delete a node with the given data
    void delete(int data) {
        if (head == null) return; // List is empty nothing to delete
        if (head.data == data) { // If the head node is to be deleted
            head = head.next; // Move head to the next node
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next; // Traverse to find the node to delete
        }
        if (current.next == null) return; // Node not found
        current.next = current.next.next; // Unlink the node to delete it
    }

    // Print all nodes in the list
    void printList() {
        Node current = head;
        while (current != null) { // Traverse through the list
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // End of list
    }
}
