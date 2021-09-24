package assignment;

public class CustomQueue {
	private CustomStack in, out;
	
	public CustomQueue(){
		this.in = new CustomStack();
		this.out = new CustomStack();
	}
	
	public boolean isEmpty(){
		return in.isEmpty() && out.isEmpty();
	}
	
	public boolean isFull(){
		return in.isFull() && out.isFull();
	}
	
	public void add(int num){
		in.add(num);
	}
	
	public int pop(){
		if(out.isEmpty()){
			while(!in.isEmpty()){
				out.add(in.pop());
			}
		}
		return out.pop();
	}
	
}
