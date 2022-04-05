package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), " have a greeting");
    }

    @Test
    public void testEmptyTree(){
        BinaryTree binaryTree = new BinaryTree();

        assertNull(binaryTree.getRoot());
    }




    @Test
    public void testTreeWith0neNode(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new node(3));

        assertEquals(3,binaryTree.getRoot().getKey());

    }

    @Test
    public void testRootAndLeftAndRight(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new node(5));
        binaryTree.getRoot().setLeft(new node(7));
        binaryTree.getRoot().setRight(new node(9));

        assertEquals(7,binaryTree.getRoot().getLeft().getKey());
        assertEquals(9,binaryTree.getRoot().getRight().getKey());
    }

    @Test
    public void testPreorderTraversal(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new node(2));
        binaryTree.getRoot().setLeft(new node(4));
        binaryTree.getRoot().setRight(new node(9));
        binaryTree.getRoot().getLeft().setLeft(new node(6));

        binaryTree.preOrderTravers(binaryTree.getRoot());

        assertEquals("[2, 4, 9, 6]","[2, 4, 9, 6]","should return [2, 4, 9, 6]" + binaryTree.getPreOrder());
    }

    @Test
    public void testInorderTraversal(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new node(10));
        binaryTree.getRoot().setLeft(new node(20));
        binaryTree.getRoot().setRight(new node(30));
        binaryTree.getRoot().getLeft().setLeft(new node(40));

        binaryTree.inOrderTravers(binaryTree.getRoot());

        assertEquals("[40, 20, 10, 30]","[40, 20, 10, 30]","should return [40, 22, 10, 30]" + binaryTree.getInOrder());
    }

    @Test
    public void testPostorderTraversal(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new node(10));
        binaryTree.getRoot().setLeft(new node(20));
        binaryTree.getRoot().setRight(new node(30));
        binaryTree.getRoot().getLeft().setLeft(new node(40));

        binaryTree.postOrderTravers(binaryTree.getRoot());

        assertEquals("[40, 20, 30, 10]","[40, 20, 30, 10]","should return [40, 20, 30, 10]" + binaryTree.getPostOrder());
    }



    // Test find Max Value
    @Test
    public void testMaximumValueBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new node(5));
        binaryTree.getRoot().setLeft(new node(2));
        binaryTree.getRoot().setRight(new node(0));
        binaryTree.getRoot().getLeft().setLeft(new node(50));

        assertEquals( 50, binaryTree.getMaxValue());
    }


    // Test breadth first search

    @Test
    public  void  testBreadthFirst() throws Exception {
        BinaryTree BinaryTree = new BinaryTree();

        BinaryTree.setRoot(new node(1));
        BinaryTree.getRoot().setLeft(new node(2));
        BinaryTree.getRoot().setRight(new node(3));
        BinaryTree.getRoot().getRight().setLeft(new node(7));
        BinaryTree.getRoot().getRight().setRight(new node(8));
        BinaryTree.getRoot().getLeft().setLeft(new node(5));
        BinaryTree.getRoot().getLeft().setRight(new node(6));

        assertEquals("[1, 2, 3, 5, 6, 7, 8]", BinaryTree.breadthFirst(BinaryTree).toString());
    }
}
