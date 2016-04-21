public class BSTMain{
    public static void main(String[] args){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert("Ajose", "295-1492");
		bst.insert("Owens", "291-1864");
		bst.insert("Federbush", "295-1601");
		bst.insert("Ryba", "293-6122");
		bst.insert("Seddon", "295-1882");
		bst.insert("Copeland", "291-7890");
		bst.insert("Voorhees", "294-8075");
		bst.insert("Sparks", "584-3622");
		
		bst.inOrder();
        		System.out.println();

		bst.preOrder();
		System.out.println();
        
        System.out.println(bst.findCustomerIterative("Federbush"));
        
        System.out.println();

        System.out.println(bst.min());
		System.out.println(bst.max());
    }
}
