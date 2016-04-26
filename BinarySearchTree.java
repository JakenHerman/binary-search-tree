public class BinarySearchTree {
    public  NodeBinaryTree root;
    public  String[] customers = new String[25];
    public  String[] customerNumber = new String[25];
    public int traversalCount = 0;
    public int i = 0;
    
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
    
    public void traverse(String startNam){
        traverse(startNam, root);
    }
    
    public void traverse(String startNam, NodeBinaryTree root){
        if (root!=null){
            if (!root.nam.equalsIgnoreCase(startNam)){
                if (root.left != null){
                    traverse(startNam, root.left);
                }
                else if (root.right != null){
                    traverse(startNam, root.right);
                }
                else {
                    System.out.println(startNam + " Not Found");
                }
            }
            
        System.out.println(root.getNam() + ", " + root.getNum());

        }
    }
    
    
    public void inOrderAddToList(){
        inOrderAddToList(root);
    }
    
    public void inOrderAddToList(NodeBinaryTree root){
        if (root != null && (this.i != 24)) {
            inOrderAddToList(root.left);
            this.customers[this.i] = root.getNam();
            this.customerNumber[this.i] = root.getNum();
            this.i += 1;
            inOrderAddToList(root.right);
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
    
    public String findCustomerIterative(String custToFind){
        inOrderAddToList();
           for(int i = 0; i < this.customers.length; i++){
            if(custToFind == this.customers[i]){
                return this.customerNumber[i];
            }
        }
        return "not found";
    }
  
    public String findCustomerRecursive(String custToFind){
        return findCustomerRecursive(this.root, 0, this.customers.length-1, custToFind);
    }
    
    public String findCustomerRecursive(NodeBinaryTree root, int start, int end, String target) {
        this.inOrderAddToList();
        
        int middle = (start + end) / 2;
        
        if(end < start) {
            return "not found";
        }
        
        if(target.equalsIgnoreCase(customers[middle])) {
            return this.customerNumber[middle];
        } else if(customers[middle].compareTo(target) < 0) {
            return findCustomerRecursive(root, start, middle - 1, target);
        } else {
            return findCustomerRecursive(root, middle + 1, end, target);
        }
    }
    
}
