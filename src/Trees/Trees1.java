package Trees;

import java.util.Scanner;

public class Trees1 {

        public static class Node {
            Node left;
            Node right;
            int data;

            public Node(int data) {
                this.data = data;
            }
        }
    // ******* SUM OF ALL THE NODES IN A BINARY TREE ********* //

        public static int sum (Node root){
            if (root == null)
                return 0;
            return root.data + sum(root.left) + sum(root.right);
        }

    // ******* PRODUCT OF ALL THE NODES IN A BINARY TREE ********* //

        public static int product(Node root){
            if (root == null)
                return 1;
            return root.data * product(root.left) * product(root.right);
        }

    // ******* PRODUCT OF ALL THE NON ZERO NODES IN A BINARY TREE ********* //

        public static int nonZeroProduct(Node root){
                if (root == null)
                    return 1;
                if (root.data!=0)
                    return root.data * product(root.left) * product(root.right);
                else
                    return product(root.left) *  product(root.right);
        }

    // ******* BIGGEST OF ALL THE NODES IN A BINARY TREE ********* //

    public static int maxNode(Node root){
        if (root == null)
            return Integer.MIN_VALUE;
        int left = maxNode(root.left);
        int right = maxNode(root.right);
        return Math.max(root.data,Math.max(left,right));
    }

    // ******* SMALLEST OF ALL THE NODES IN A BINARY TREE ********* //

    public static int minNode(Node root){
        if (root == null)
            return Integer.MAX_VALUE;
        int left = minNode(root.left);
        int right = minNode(root.right);
        return Math.min(root.data,Math.min(left,right));
    }


    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(6);
        Node c = new Node(5);
        Node d = new Node(4);
        Node e = new Node(3);
        Node f = new Node(2);
        Node g = new Node(1);

        a.left = b;  a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(maxNode(a));
        System.out.println(minNode(b));
    }
}
