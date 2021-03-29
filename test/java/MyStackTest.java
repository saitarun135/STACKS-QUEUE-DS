import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;



public class MyStackTest {
        //reusing the code
	@Test
    public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode peak = myStack.peak();
        System.out.println("These are the stack elements:");
        myStack.show();
        Assertions.assertEquals(myThirdNode, peak);
    }
	@Test
    public void given3NumbersInStack_WhenPoped_ShouldMatchWithLastAddedNode() {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.show();
        Assertions.assertEquals(myThirdNode, pop);
    }
}
