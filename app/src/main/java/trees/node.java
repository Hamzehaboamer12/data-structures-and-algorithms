package trees;

public class node {

    private int key;
    private node Left;
    private node Right;

    public node(int key) {
        this.key = key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setLeft(node left) {
        Left = left;
    }

    public void setRight(node right) {
        Right = right;
    }

    public int getKey() {
        return key;
    }

    public node getLeft() {
        return Left;
    }

    public node getRight() {
        return Right;
    }
}
