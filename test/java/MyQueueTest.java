//https://stackoverflow.com/questions/16433397/difference-between-enqueue-and-dequeue

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {

	@Test
	public void given3Integers_WhenAddedToQueue_ShouldPassTheTest(){
        	MyQueue myQueue = new MyQueue();
        	MyNode<Integer> myFirstNode = new MyNode<>(56);
        	MyNode<Integer> mySecondNode = new MyNode<>(30);
        	MyNode<Integer> myThirdNode = new MyNode<>(70);
        
        	myQueue.enqueue(myFirstNode);									//it's present inside the MyQueue.java
        	myQueue.enqueue(mySecondNode);
        	myQueue.enqueue(myThirdNode);
        	System.out.println("These are the elements added by using Enqueue:");
        	myQueue.show();
        	
        	INode peak=myQueue.peak();
        	System.out.println("After Enqueueing operion is performed:");
        	myQueue.show();
        	
        	Assertions.assertEquals(peak, myFirstNode);                    //peak=56
    }
	@Test
	public void given3Integers_WhenAddedToDequeue_ShouldPassTheTest() {
		    MyQueue myQueue = new MyQueue();
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);
	        
	        myQueue.enqueue(myFirstNode);
	        myQueue.enqueue(mySecondNode);
	        myQueue.enqueue(myThirdNode);
	        
	        System.out.println("These are the elemnets in Dequeue test");
	        myQueue.show();
	        
	        INode<?> dequeue = myQueue.dequeue();							//wildcard generics(alllows any data tpe)
	        System.out.println("After dequeue method:");
	        myQueue.show();
	        
	        Assertions.assertEquals(dequeue, myFirstNode);
	}
	
}
