package BinarySearchTree;

/**
 * Hello world!
 */
public final class Driver {
    private Driver (){
    }    
    public static void main(String[] args) {        
        
        BinarySearchTree bst = new BinarySearchTree("Vishwas");
        // bst.performOrdering("lexicographic");     
        bst.performOrdering("revLexicographic");     
        bst.insert("Tanmay");
        bst.insert("Shubham");
        /*bst.insert("3");
        bst.insert("4");
        bst.insert("9");*/
        bst.insert("Pravin");
        bst.insert("Kavan");
        bst.insert("ChetanK");
        bst.insert("Yash");
        bst.insert("PrakashB");
        bst.insert("Siddhant");
        bst.insert("Vijay"); 
        bst.traverse();
        // bst.traverse();
        // bst.performOrdering("lexicographic");
        System.out.println("");
    }
}
