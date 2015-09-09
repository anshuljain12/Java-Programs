package Trees;

public class kthSmallestElement {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(4);
		root.left.left.left = new TreeNode(2);
		root.left.right = new TreeNode(6);
		root.right = new TreeNode(10);
		root.right.left = new TreeNode(9);
		root.right.left.left = new TreeNode(8);
		root.right.right = new TreeNode(11);
		root.right.right.right = new TreeNode(12);
		System.out.println(kthSmallest(root, 6));
	}
	public static int kthSmallest(TreeNode root, int k) {
        int leftCount = heightCount(root.left);
        if (k == leftCount + 1)
            return root.val;
        else if (k <= leftCount)
            return kthSmallest(root.left, k);
        else return kthSmallest(root.right, k - leftCount - 1);
    }
    public static int heightCount(TreeNode root) {
        if (root == null)
            return 0;
        return (heightCount(root.left) + heightCount(root.right) + 1 );  
    }
}
