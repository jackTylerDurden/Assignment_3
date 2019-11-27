package Assignment_3;

import org.junit.Test;

import BinarySearchTree.BinarySearchTree;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class TestBinarySerachTree {
    /**
     * Rigorous Test.
     */
    @Test
    public void lexicographicPreorder() {
        BinarySearchTree bst = new BinarySearchTree("5");
        bst.setOrdering("lexicographic");
        bst.insert("3");
        bst.insert("4");
        bst.insert("9");        
        bst.setTraversal("preorder");                
        String traversal = bst.traverse();
        assertEquals(traversal,"(5(3()(4()()))(9()()))");         
    }

    @Test
    public void lexicographicInorder() {
        BinarySearchTree bst = new BinarySearchTree("5");
        bst.setOrdering("lexicographic");
        bst.insert("3");
        bst.insert("4");
        bst.insert("9");        
        bst.setTraversal("inorder");                
        String traversal = bst.traverse();
        assertEquals(traversal,"3 4 5 9");         
    }

    @Test
    public void lexicographicInorder2() {
        BinarySearchTree bst = new BinarySearchTree("az");
        bst.setOrdering("lexicographic");
        bst.insert("bb");
        bst.setTraversal("inorder");                
        String traversal = bst.traverse();
        assertEquals(traversal,"az bb");         
    }

    @Test
    public void revLexicographicInorder() {
        BinarySearchTree bst = new BinarySearchTree("az");
        bst.setOrdering("revLexicographic");
        bst.insert("bb");
        bst.setTraversal("inorder");                
        String traversal = bst.traverse();
        assertEquals(traversal,"bb az");         
    }

    @Test
    public void revLexicographicInorder2() {
        BinarySearchTree bst = new BinarySearchTree("az");
        bst.setOrdering("revLexicographic");
        bst.insert("bb");
        bst.insert("cz");
        bst.insert("az");
        bst.setTraversal("inorder");                
        String traversal = bst.traverse();
        assertEquals(traversal,"bb az az cz");         
    }
}
