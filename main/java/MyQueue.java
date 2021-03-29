
public class MyQueue {
	 private final MyLinkedList myLinkedList;
	// private final MyLinkedList myLinkedList;

	    public MyQueue(){
	        this.myLinkedList = new MyLinkedList();
	    }


	    public void enqueue(INode myNode) {
	        myLinkedList.append(myNode);
	    }

	    public void show(){
	        myLinkedList.show();
	    }

	    public INode peak(){
	        return myLinkedList.head;
	    }

	    public INode dequeue() {                       // it directly returns the method.
	        return myLinkedList.pop();                 //removing the elements=DEQUEUE.
	    }
	
}
