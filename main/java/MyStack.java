
public class MyStack {
	
		 private final MyLinkedList myLinkedList;

		    public MyStack(){
		        this.myLinkedList = new MyLinkedList();
		    }

		    public void push(INode myNode) {
		        myLinkedList.add(myNode);
		    }

		    public void printStack(){
		        myLinkedList.show();
		    }

		    public INode peak(){
		        return myLinkedList.head;
		    }
	

	//public void push(MyNode<Integer> myFirstNode) {
		//}
}
