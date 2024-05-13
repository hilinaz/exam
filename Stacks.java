package question2;
public class Stacks {
	int[]num;
	int top;
	int maxSize;
	int Size;
	Stacks(int size){
		num=new int[size];
		maxSize=num.length;
		top=-1;
	}

	public static void main(String[] args) {
			  Stacks numStack = new Stacks(3); 
			  numStack.push(11); 
			  numStack.push(22); 
			  numStack.push(33); 
			 
			  
			  for (int i = 0; i < numStack.Size; i++) { 
			   System.out.println(numStack.num[i]); 
			  } 
			  System.out.println(numStack.isEmpty());
			  System.out.println(numStack.isFull());
			  numStack.peek();
			  System.out.println(numStack.isFull());
	}
void push(int value) {
	if(top<maxSize-1) {num[++top]=value;
	Size++;
	}
	else
	{System.out.println("Stack is full");}
	
}
int pop() {
	if(!isEmpty()) {
		Size--;	
		return num[top--];
	}
return -1;
}
int peek() {
	if(!isEmpty()) {
		return num[top];
	}
return -1;
}

boolean isEmpty() {
	return top==-1;
}
boolean isFull() {
	return top==maxSize-1;
}

}
