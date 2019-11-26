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
        bst.insert("qt");
        bst.setTraversal("inorder");                
        String traversal = bst.traverse();
        System.out.println("traversal------->>>"+traversal);
        // System.out.println(bst.traverse());
    }
}
