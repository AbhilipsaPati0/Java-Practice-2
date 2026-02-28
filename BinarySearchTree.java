class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }
    // Method to insert  new value to the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }
    private TreeNode insertRec(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }

        if (value < node.value) {
            node.left = insertRec(node.left, value);
        } else if (value > node.value) {
            node.right = insertRec(node.right, value);
        }

        return node;
    }

    // Method to perform inorder traversal
    public void inorderTraversal() {
        inorderRec(root);
    }

    private void inorderRec(TreeNode node) {
        if (node != null) {
            inorderRec(node.left); // Visit left subtree
            System.out.print(node.value + " "); // Visit node
            inorderRec(node.right); // Visit right subtree
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal of the BST:");
        bst.inorderTraversal(); // Output: 20 30 40 50 60 70 80
    }
}