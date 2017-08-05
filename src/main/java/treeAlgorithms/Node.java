package treeAlgorithms;

public class Node {
    private Node leftChild;
    private Node rightChild;
    private int value;

    public Node(Node leftChild, Node rightChild, int value){
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.value = value;
    }

    public Node(int value){
        this(null, null, value);
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
}
