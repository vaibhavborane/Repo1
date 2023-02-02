package BinaryTree;

public class BST_Non_rec {
	BTNode root;

	public void insert(int data) {
//		System.out.println("function called");
		if(root==null) {
//			System.out.println("root null");
			root=new BTNode(data);
//			System.out.println(root.toString());
			return;
		}
		
//		System.out.println("root not null");
		BTNode ref, parent;
		ref=root;
		parent=ref;
//		System.out.println("entering while"); 
		while(ref!=null) {
			parent=ref;
			if(data<ref.getData()) {
				ref=ref.getLeft();
			}
			else if(data>ref.getData()) {
				ref=ref.getRight();
			}
			else {
				System.out.println("data is Duplicate");
				return;
			}
		}
		if(data<parent.getData()) {
			parent.setLeft(new BTNode(data));
			return;
		}
		else {	
			parent.setRight(new BTNode(data));
			return;
		}
		
	}
	public void preOrder() {
		preOrder(root);
	}
	
	private void preOrder(BTNode n) {
		if(n==null) {
		return;
		}
		System.out.println(n.getData());
		preOrder(n.getLeft());
		preOrder(n.getRight());
	}
	
	public BTNode search (int data) {
	
		if(root==null) {
			System.out.println("empty root");
			return null;
		}
		BTNode ptr=root;
		while (ptr!=null) {
			if(data==ptr.getData()) {
				return ptr;
			}
			else if(data<ptr.getData()){
				ptr=ptr.getLeft();
			}
			else if(data>ptr.getData()) {
				ptr=ptr.getRight();
			}
			else {
				System.out.println("not found");
				return null;
			}
		}
		return ptr;
	}
	
	
	
	public void delete(int d) 
		{
			root= delete_node(root,d);
		}
		private BTNode delete_node(BTNode r, int data) {
			BTNode deletable,succ = null;
			if(r==null)
			{
				System.out.println("Tree is empty");
				return null;
			}
			if(data<r.getData())
				r.setLeft(delete_node(r.getLeft(),data));
			else if (data>r.getData())
				r.setRight(delete_node(r.getRight(),data));
			
			else {
				if(r.getLeft()!=null && r.getRight()!=null) {
					succ=r.getRight();
					while(succ.getLeft()!=null)
						succ=succ.getLeft();
					r.setData(succ.getData());
					r.setRight(delete_node(r.getRight(), succ.getData()));
				}
			else {
				deletable=r;
				if(r.getLeft()!=null)
					r=r.getLeft();
				else if (r.getRight()!=null)
					r=r.getRight();
				else
					r=null;
					deletable=null;
			
			
			}
			}
			return succ;
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	

