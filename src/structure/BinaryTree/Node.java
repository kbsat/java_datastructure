package structure.BinaryTree;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public void addLeft(Node node){
        this.left = node;
    }

    public void addRight(Node node){
        this.right = node;
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

    public Node getRight() {
        return right;
    }
}
