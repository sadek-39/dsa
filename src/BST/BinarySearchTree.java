package BST;

import java.util.Scanner;

class Node{
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }

}
public class BinarySearchTree {
    private Node root;

    BinarySearchTree() {
        this.root = null;
    }

    public void buildTree() {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        while(d != -1) {
            root = insert(this.root, d);
            d = sc.nextInt();
        }
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    void display() {
        preorder(this.root);
    }
    void preorder(Node root) {
        if(root == null) {
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }

        if (root.data == val) {
            return true;
        }

        if (root.data > val) {
            return search(root.left, val);
        }else {
            return search(root.right, val);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.buildTree();
        bst.display();
        System.out.print(bst.search(bst.root, 1));
    }

}
