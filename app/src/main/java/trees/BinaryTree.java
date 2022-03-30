package trees;

import java.util.ArrayList;

public class BinaryTree {


    private node Root;

    public ArrayList<Integer> preOrder = new ArrayList<>();
    public ArrayList<Integer> inOrder = new ArrayList<>();
    public ArrayList<Integer> postOrder = new ArrayList<>();


    public node getRoot() {
        return Root;
    }

    public void setRoot(node Root) {
        this.Root = Root;
    }

    public ArrayList<Integer> getPreOrder() {
        return preOrder;
    }

    public ArrayList<Integer> getInOrder() {
        return inOrder;
    }

    public ArrayList<Integer> getPostOrder() {
        return postOrder;
    }

    public void inOrderTravers(node node) {
        if (Root == null) {
            System.out.println("Tree is Empty!");
            return;
        }

        if (node != null) {
            inOrderTravers(node.getLeft());
            System.out.print(" " + node.getKey());
            inOrder.add(node.getKey());
            inOrderTravers(node.getRight());
        }
    }


    public void postOrderTravers(node node) {
        if (Root == null) {
            System.out.println("Tree is Empty!");
            return;
        }

        if (node != null) {
            postOrderTravers(node.getLeft());
            postOrderTravers(node.getRight());
            System.out.print(" " + node.getKey());
            postOrder.add(node.getKey());
        }
    }

    public void preOrderTravers(node node) {
        if (Root == null) {
            System.out.println("Tree is Empty!");
            return;
        }

        if (node != null) {
            System.out.print(" " + node.getKey());
            preOrder.add(node.getKey());
            preOrderTravers(node.getLeft());
            preOrderTravers(node.getRight());
        }
    }
}
