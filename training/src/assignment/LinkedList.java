package assignment;

class Node{
	int val;
	Node next;
	
	public Node(){
		
	}
	
	public Node(int val){
		this.val = val;
	}
	
	public Node(int val, Node next){
		this.val = val;
		this.next = next;
	}
}

public class LinkedList {
	private Node head;
	
	public void add(Node node){
		node.next = this.head;
		this.head = node;
	}
	
	public void printList(){
		
		Node temp = this.head;
		while(temp != null){
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public boolean delete(int val){
		if(this.head.val == val){
			Node newHead = this.head.next;
			this.head.next = null;
			this.head = newHead;
			return true;
		}
		Node temp = this.head;
		boolean found=false;
		while(temp != null && temp.next!=null){
			if(temp.next.val == val){
				found = true;
				break;
			}
			temp = temp.next;
		}
		
		if(!found) return false;
		Node del = temp.next;
		temp.next = temp.next.next;
		del.next = null;
		return true;
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		for(int i=0;i<20;i++) ll.add(new Node(i));
		ll.printList();
		
		// for(int i=1;i<20;i+=2) ll.delete(i);
		for(int i=0;i<20;i+=2) ll.delete(i);
		ll.printList();
	}
}
