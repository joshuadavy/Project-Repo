package com.joshuadavy.dailycoding;
import java.util.LinkedList;
import java.util.Queue;
public class DeleteNode {
    static class Node {
        int key;
        Node right;
        Node left;

        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }
    static Node root;
    static Node temp = root;
    static void inorder(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.println(temp.key + " ");
        inorder(temp.right);
        inorder(temp.left);
    }
    static void deletedDeepest(Node root, Node delNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node temp = null;
        while (!queue.isEmpty()) {
            temp = queue.peek();
            queue.remove();

            if (temp == delNode) {
                temp = null;
                return;
            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                }
                else
                    queue.add(temp.right);
            }
            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                }
                else
                    queue.add(temp.left);
            }
        }
    }
    static void delete(Node root, int key) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.key == key) {
                root = null;
                return;
            }
            else {
                return;
            }
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node temp = null;
        Node keyNode = null;
        while (!queue.isEmpty()) {
            temp = queue.peek();
            queue.remove();
            if (temp.key == key) {
                keyNode = temp;
            }
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        if (keyNode != null) {
            int x = temp.key;
            deletedDeepest(root, temp);
            keyNode.key = x;
        }
    }
    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        System.out.println("Inorder traversal before deletion: ");
        inorder(root);
        int key = 15;
        delete(root, key);
        System.out.println("\nInorder traversal before deletion: ");
        inorder(root);
    }
}
