public class BinarySearchTree {
    BinaryTreeNode root;

    // Constructor for BinarySearchTree
    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node into the BST
    void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive method to insert a new node
    BinaryTreeNode insertRec(BinaryTreeNode root, int data) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new BinaryTreeNode(data);
            return root;
        }

        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data >= root.data) {
            root.right = insertRec(root.right, data);
        }

        // Return the unchanged root node
        return root;
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
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes into the binary search tree
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Perform in-order traversal
        System.out.println("In-order Traversal:");
        bst.inOrderTraversal(bst.root);  // Output: 20 30 40 50 60 70 80

        // Perform pre-order traversal
        System.out.println("\nPre-order Traversal:");
        bst.preOrderTraversal(bst.root);  // Output: 50 30 20 40 70 60 80

        // Perform post-order traversal
        System.out.println("\nPost-order Traversal:");
        bst.postOrderTraversal(bst.root);  // Output: 20 40 30 60 80 70 50
    }
}
