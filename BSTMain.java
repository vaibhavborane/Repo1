package BinaryTree;

public class BSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST_Non_rec	tre= new BST_Non_rec();
		
		tre.insert(10);//10=>
		tre.insert(20);
		tre.insert(5);
		tre.insert(30);
		tre.insert(40);
		tre.insert(50);
		tre.insert(60);
			
		tre.preOrder();
		BTNode node1 = tre.search(10);
		if(node1 != null) {
			System.out.println("element found " + node1.getData());
		};

	}

}
