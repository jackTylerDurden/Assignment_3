package BinarySearchTree;

public class BinarySearchTree {
    private AbstractNode root; 
    private InorderNodeVisitor rootVisitor = new InorderNodeVisitor() ;  
    private OrderingStrategy strategy;
    public BinarySearchTree(String key){
        root = new Node(key);
    }
    
    public void insert(String key){
        root.insert(key,strategy);        
    }

    public String traverse(){        
        return root.accept(rootVisitor);
    }

    public void performOrdering(String orderingStrategy){
        switch(orderingStrategy){
            case "lexicographic":
            strategy = new LexicographicOrdering();
            break;

            case "revLexicographic":
            strategy = new ReverseLexicographicOrdering();
            break;
        }
    }
}