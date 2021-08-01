// cc 13.1 Example of Java's linked list
// 7June
// this is an example of java's LinkedList class
import java.util.LinkedList;

class JavaLinkedList {


    public static void main(String args[]) {
    
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(3);  						// => 3
        list.addLast(18); 						// => 3->18
        list.addFirst(25);						// => 25->3->18
		list.addLast(30);						// => 25->3->18->30
		list.addFirst(69);						// => 69->25->3->18->30
		System.out.println(list);				// print list
        System.out.println(list.getFirst());	// getFirst();
		System.out.println(list.getLast());		// getLast();
		list.indexOf(25);						// indexOf();
    }
}
