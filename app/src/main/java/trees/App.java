package trees;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());
//
//
//
//        BinaryTree BinaryTree = new BinaryTree();
//
//        BinaryTree.setRoot(new node(1));
//        BinaryTree.getRoot().setLeft(new node(2));
//        BinaryTree.getRoot().setRight(new node(3));
//        BinaryTree.getRoot().getRight().setLeft(new node(7));
//        BinaryTree.getRoot().getRight().setRight(new node(8));
//        BinaryTree.getRoot().getLeft().setLeft(new node(5));
//        BinaryTree.getRoot().getLeft().setRight(new node(6));
//
//
//        System.out.println(BinaryTree.breadthFirst(BinaryTree).toString());
    }
}
