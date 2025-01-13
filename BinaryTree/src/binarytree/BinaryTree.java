package binarytree;

public class BinaryTree {

    private final Node root;

    public BinaryTree(int rootValue) {
        root = new Node(rootValue, null, null);
    }

    private void insert(Node newNode, Node root) {

        if (newNode.getValue() > root.getValue()) {
            if (root.getRight() == null) {
                root.setRight(newNode);
            } else {
                insert(newNode, root.getRight());
            }
        }
        if (newNode.getValue() < root.getValue()) {
            if (root.getLeft() == null) {
                root.setLeft(newNode);
            } else {
                insert(newNode, root.getLeft());
            }
        }
    }

    public void insertNode(int value) {
        Node newNode = new Node(value, null, null);
        insert(newNode, root);
    }

    private void search(int value, Node root) {
        if (root == null) {
            System.out.println("The Node was not Found ..!");
            return;
        }
        if (value > root.getValue()) {
            search(value, root.getRight());
        }
        if (value < root.getValue()) {
            search(value, root.getLeft());
        }
        if (value == root.getValue()) {
            System.out.println("The Node " + value + " was Found ...");
        }

    }

    public void searchNode(int value) {
        search(value, root);
    }

    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(Node node, int depth) {
        if (node == null) {
            return;
        }
        printTree(node.getRight(), depth + 1);
        System.out.println(" ".repeat(depth * 4) + node.getValue());
        printTree(node.getLeft(), depth + 1);
    }

    private class Node {

        private int value;
        private Node left;
        private Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

    }

}
