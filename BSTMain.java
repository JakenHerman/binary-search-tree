public class BSTMain{
    public static void main(String[] args){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert("I", "1");
		bst.insert("C", "2");
		bst.insert("B", "3");
		bst.insert("D", "4");
		bst.insert("E", "5");
		bst.insert("F", "6");
		bst.insert("G", "7");
		bst.insert("H", "8");
		bst.insert("A", "9");
		
		bst.inOrder();
        		System.out.println();

		bst.preOrder();
		System.out.println();

        System.out.println(bst.min());
		System.out.println(bst.max());
    }
}
