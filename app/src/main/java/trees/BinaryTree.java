package trees;

import stackandqueue.Queue;

import java.util.ArrayList;

public class BinaryTree {


    private node Root;

    public ArrayList<Integer> preOrder = new ArrayList<>();
    public ArrayList<Integer> inOrder = new ArrayList<>();
    public ArrayList<Integer> postOrder = new ArrayList<>();
    private int max=0;



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

    public Integer getMaxValue(){
        if (Root == null) {
            System.out.println("Tree is Empty!");
            return null;
        }
        else {
            FindMax(Root);
        }

        return max;
    }

    private void FindMax(node node){

        if(node != null) {
            if(node.getKey() > max){
                max = node.getKey();
            }
            FindMax(node.getLeft());
            FindMax(node.getRight());
        }
    }
    public ArrayList<Integer> breadthFirst(BinaryTree tree) throws Exception {

        ArrayList<Integer> Array = new ArrayList<>();

        Queue<node> nodes = new Queue<>();

        if(tree.Root != null) {
            nodes.enqueue(tree.Root);
        }

        while(nodes.getSize() > 0) {

            node temp = nodes.dequeue();
            Array.add(temp.getKey());

            if(temp.getLeft() != null) {
                nodes.enqueue(temp.getLeft());
            }
            if(temp.getRight() != null) {
                nodes.enqueue(temp.getRight());
            }
        }
        return Array;
    }
}
