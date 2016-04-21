
public class BinarySearchTree {
	public NodeBinaryTree root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(String nam, String num) {
		NodeBinaryTree newNode = new NodeBinaryTree();
		newNode.nam = nam;
        newNode.num = num;
		if (root == null) {
			root = newNode;
		} else {
			NodeBinaryTree current = root;
			NodeBinaryTree parent;
			while (true) {
				parent = current;
				if (nam.compareTo(current.nam) < 0) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						break;
					}
				} else {
					current = current.right;
					if (current == null){
						parent.right = newNode;
					break;
					}
				}
			}
		}

	}

	public String min()
	{
		NodeBinaryTree current = root;
		while( current.left != null )
			current = current.left;
		return current.getNam();
	}
	public String max()
	{
		NodeBinaryTree current = root;
		while( current.right!= null )
			current = current.right;
		return current.getNam();
	}
	
	public void inOrder() {
		inOrder(root);
	}

	public void inOrder(NodeBinaryTree root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.getNam() + ", " + root.getNum());
			inOrder(root.right);
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	public void preOrder(NodeBinaryTree root) {
		if (root != null) {
			System.out.println(root.getNam() + ", " + root.getNum());
			preOrder(root.left);
			preOrder(root.right);
		}
	}
}
