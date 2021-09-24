package assignment;

import java.util.Arrays;

public class CustomStack {
	static int CAPACITY = 10000;
	public CustomStack(){
		this.size = -1;
		this.arr = new int[CAPACITY];
		Arrays.fill(arr, -1);
	}
	
	private int arr[];
	
	private int size;
	
	
	public boolean isEmpty(){
		return this.size == -1;
	}
	
	public boolean isFull(){
		return this.size == CustomStack.CAPACITY-1;
	}
	
	public void add(int num){
		if(this.isFull()){
			System.out.println("Stack is full");
			return;
		}
		this.arr[++this.size] = num;
	}
	
	public int pop(){
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int num = arr[size];
		arr[size--] = -1;
		return num;
	}
	
	
	public static void main(String[] args) {
		
		CustomStack stack = new CustomStack();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);

	}

}
