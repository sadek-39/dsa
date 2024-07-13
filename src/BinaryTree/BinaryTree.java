package BinaryTree;

class Node{
    int data;
    Node left, right;


    public Node(int value) {
        data = value;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;

    public BinaryTree(int key) {
        root = new Node(key);
    }

    public BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);

//        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.printPreOrderTraversal(tree.root);
    }

    public void printPreOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(" " + node.data + "->");
            printPreOrderTraversal(node.left);
            printPreOrderTraversal(node.right);
        }
    }
}
