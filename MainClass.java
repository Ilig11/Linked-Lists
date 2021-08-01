/*Name: CRAIG CHRISTOPHER N. ABQUINA
  Sec&Sub: CC12 - B
  Prelim Exam
  Task: Modify CC13.1's implementation of a Linked List of Integers, 
        and add (implement) the following methods:
		1. addLast(int value)  
		2. clear() 		
		3. getFirst()			
		4. getLast()						
		5. indexOf()									
		6. size()    
  Date: June 8, 2021
*/

class LinkedList {  
    Node head;
	int size = 0;
	
	class Node {
		int data;
		Node nextNode;

		public Node() {
			this.nextNode = null;
		}

		public Node(int value) {
			this.data = value;
			this.nextNode = null;
		} 
	}
	
	// size()
	public int size() {
		System.out.println("Current size of the list: " + this.size);
		System.out.println(); // spacing
		return this.size;
	}
	
    // addFirst 
    // adds a new node at the beginning of the list
    public void addFirst(int value) {
        System.out.println("Add element " + value + " at the beginning of the list.");
		Node new_node = new Node(value);
        new_node.nextNode = head;
        head = new_node;
		this.size++; 
    }

    // addLast(int value)
	// adds a new node at the end of the list
	public void addLast(int value) {
		System.out.println("Add element " + value + " at the end of the list.");
		Node new_node = new Node(value);
		
		// if list is empty new node becomes the head
		if (this.head == null) {
			this.head = new Node(value);
		}
		
		new_node.nextNode = null;
		Node last = head;
		
		while (last.nextNode != null) {
			last = last.nextNode;
		}
		this.size++;
		last.nextNode = new_node;
	}
	
    // clear()
	// Removes all of the elements from this list.
	public void clear() {
		this.head = null;
		this.size = 0;
		System.out.println("Clearing... All elements are removed from the list.");
		System.out.println(); // spacing		
		return;
	}
	
    // getFirst()
	public int getFirst() {
		System.out.println("Getting first element...");
		if (this.head == null) {
			System.out.println("ERROR. The list is empty."); 
		}
		else { 
			Node temp = new Node();
			temp = this.head;
			System.out.println("First element of the list: " + temp.data);
		}
		System.out.println(); // spacing
		return 0;
	}
	
    // getLast()
	public int getLast() {
		System.out.println("Getting last element...");
		if (this.head == null) {
			System.out.println("Error. The list is empty.");
		}
		else {
			Node temp = this.head;
			while(temp.nextNode != null) {
				temp = temp.nextNode;
			}
			System.out.println("Last element of the list: " + temp.data);
		}
		System.out.println(); // spacing
		return 0;
	}
    
	// indexOf()
	// returns the index of the first occurrence of the specified element
	// index starts with 1.
	public void indexOf(int value) {
		Node current = head;
		int i = 1;
		boolean check = false;
		
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			while(current != null) {
				if(current.data == value) {
					check = true;
					break;
				}
				i++;
				current = current.nextNode;
			}
		}
		if(check == true) {
			System.out.println("Index of element " + value + ": " + i);
		}
		else {
			System.out.println("Error. Element " + value + " is not present on the list.");
		}
		System.out.println(); // spacing
	}
	
	//Prints all the data (int) of  this list
    public void printList() {
        System.out.println(); // spacing
		Node thisNode = head;
		while (thisNode != null) {
            System.out.print(thisNode.data + " -> ");
            thisNode = thisNode.nextNode;
        }
		System.out.print("Null");
		System.out.println(); // spacing
		System.out.println(); // spacing
    }
    
}

class MainClass {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
		
        list.addFirst(3);				// => 3
        list.addFirst(25);				// => 25 -> 3
        list.addFirst(18);				// => 18 -> 25 -> 3
		
		list.printList();				// print the list
		list.clear();					// remove all elements from the list
		list.size();					// current size: 0
        list.getFirst();				// Error. Empty list
		
		list.addFirst(11);				// => 11
		list.addLast(30);				// => 11 -> 30
		list.addFirst(7);				// => 7 -> 11 -> 30
		list.addLast(5);				// => 7 -> 11 -> 30 -> 5
		
		list.printList();				// print the list
		list.size();					// current size: 4
		list.getFirst();				// first element: 7
		list.getLast();					// last element: 5	
		list.indexOf(30); 				// index of element 30: 3 
		list.indexOf(69);				// Error. Element is not present
		
    }
}
