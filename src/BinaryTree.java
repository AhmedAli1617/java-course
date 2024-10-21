class BinaryTreeNode {
    int data;
    BinaryTreeNode left, right;

    // Constructor
    public BinaryTreeNode(int item) {
        data = item;
        left = right = null;
    }
}
public class BinaryTree {
    BinaryTreeNode root;

    // Constructor for BinaryTree
    public BinaryTree() {
        root = null;  // Initially, the tree is empty
    }

    // Method for In-order Traversal (Left, Root, Right)
    void inOrderTraversal(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        // Recursively traverse the left subtree
        inOrderTraversal(node.left);

        // Visit the root node
        System.out.print(node.data + " ");

        // Recursively traverse the right subtree
        inOrderTraversal(node.right);
    }

    // Method for Pre-order Traversal (Root, Left, Right)
    void preOrderTraversal(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        // Visit the root node
        System.out.print(node.data + " ");

        // Recursively traverse the left subtree
        preOrderTraversal(node.left);

        // Recursively traverse the right subtree
        preOrderTraversal(node.right);
    }

    // Method for Post-order Traversal (Left, Right, Root)
    void postOrderTraversal(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        // Recursively traverse the left subtree
        postOrderTraversal(node.left);

        // Recursively traverse the right subtree
        postOrderTraversal(node.right);

        // Visit the root node
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        // Create an instance of BinaryTree
        BinaryTree tree = new BinaryTree();

        // Create the binary tree manually
        tree.root = new BinaryTreeNode(1);        // Root node
        tree.root.left = new BinaryTreeNode(2);   // Left child of root
        tree.root.right = new BinaryTreeNode(3);  // Right child of root
        tree.root.left.left = new BinaryTreeNode(4);  // Left child of BinaryTreeNode 2
        tree.root.left.right = new BinaryTreeNode(5); // Right child of node 2

        // Perform in-order traversal
        System.out.println("In-order Traversal:");
        tree.inOrderTraversal(tree.root);  // Output: 4 2 5 1 3

        // Perform pre-order traversal
        System.out.println("\nPre-order Traversal:");
        tree.preOrderTraversal(tree.root);  // Output: 1 2 4 5 3

        // Perform post-order traversal
        System.out.println("\nPost-order Traversal:");
        tree.postOrderTraversal(tree.root);  // Output: 4 5 2 3 1
    }
}
