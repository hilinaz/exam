package question3;
import java.util.Stack;

import Queue.stack;

public class stack {
	static Stack<Integer>stack1;
	static Stack<Integer>stack2;
	stack(){
		stack1=new Stack<>();
		stack2=new Stack<>();
	}

	public static void main(String[] args) {
		stack st=new stack();
		st.enqueue(1);
		st.enqueue(3);
		st.enqueue(5);
		System.out.println(st.dequeue());
		System.out.println(st.dequeue());
		System.out.println(st.peek());
		System.out.println(st.empty());
	}
void enqueue(int value) {
	 
	while(!stack1.isEmpty()) {stack2.push(stack1.pop());}
	stack1.push(value);
	while(!stack2.isEmpty()) {stack1.push(stack2.pop());}
}

 int dequeue() {
	return stack1.pop();}
 int peek() {
	return stack1.peek();}
 boolean empty() {
	return stack1.isEmpty();}
	
}

