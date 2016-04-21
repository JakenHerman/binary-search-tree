public class NodeBinaryTree {
	String nam;
    String num;
	NodeBinaryTree left;
	NodeBinaryTree right;

	public NodeBinaryTree(String nam, String num) {
		this.nam = nam;
        this.num = num;
		left = null;
		right = null;
	}

	public NodeBinaryTree() {
		left = null;
		right = null;
	}
	
	public String getNam()
	{
		return this.nam;
	}
    
    public String getNum()
    {
        return this.num;
    }

}
