import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {//  Time Com­plex­ity — O(N) BEST SOlution
	
	public void levelOrderQueue(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		if (root == null)
			return;
		q.add(root);
		while(!q.isEmpty()){
			int levelNodes = q.size();
			while(levelNodes>0){
				Node n = (Node)q.remove();
				System.out.print(" " + n.data);
				if(n.left!=null) q.add(n.left);
				if(n.right!=null) q.add(n.right);
				levelNodes--;
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);

		BinaryTree i = new BinaryTree();
		System.out.println("Nodes at the same depth : ");
		i.levelOrderQueue(root);
}

}
