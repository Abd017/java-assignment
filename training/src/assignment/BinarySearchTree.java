package assignment;


import java.util.*;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		this.val = val;
	}
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	
}
public class BinarySearchTree {
	TreeNode root;
	
	public BinarySearchTree(){
		this.root = null;
	}
	
	public void add(int val){
		this.root = this.addRec(this.root, val);
	}
	
	private TreeNode addRec(TreeNode curr, int val){
		if(curr==null) {
			curr = new TreeNode(val);
			return curr;
		}
		
		if(curr.val > val) curr.left = addRec(curr.left, val);
		else curr.right = addRec(curr.right, val);
		
		return curr;
		
	}
	
	public boolean search(int val){
		return this.searchRec(root, val); 
	}
	
	private boolean searchRec(TreeNode root, int val){
		if(root==null) return false;
		if(root.val == val) return true;
		
		return searchRec(root.left, val) || searchRec(root.right, val);
	}
	
	public void preorder(){
		preorderRec(this.root);
		System.out.println();
	}
	
	private void preorderRec(TreeNode root){
		if(root==null) return;
		System.out.print(root.val + " ");
		preorderRec(root.left);
		preorderRec(root.right);
	}
	
	public void inorder(){
		inorderRec(this.root);
		System.out.println();
	}
	
	private void inorderRec(TreeNode root){
		if(root==null) return;
		inorderRec(root.left);
		System.out.print(root.val + " ");
		inorderRec(root.right);
	}
	
	public void postorder(){
		postorderRec(this.root);
		System.out.println();
	}
	
	private void postorderRec(TreeNode root){
		if(root==null) return;
		postorderRec(root.left);
		postorderRec(root.right);
		System.out.print(root.val +" ");
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int a[] = {17,3,16,4,36,24,2,12,4,17,3,7,3,14,9,10,19,23,32,1};
		for(int x: a) bst.add(x);
		bst.inorder();
		bst.preorder();
		System.out.println(bst.search(3));
		Scanner sc  = new Scanner(System.in);
		System.out.println(sc.next());
		
	}
	
}
