package BinarySearchTree;

/**
 * Hello world!
 */
public final class Driver {
    private Driver (){
    }    
    public static void main(String[] args) {        
        
        BinarySearchTree bst = new BinarySearchTree("az");
        bst.setOrdering("revLexicographic");
        bst.insert("bb");
        bst.insert("cz");
        bst.insert("az");
        bst.setTraversal("inorder");                
        String traversal = bst.traverse();
        System.out.println("traversal-------_???"+traversal);
    }
}
