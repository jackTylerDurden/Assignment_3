package BinarySearchTree;

public class BinarySearchTree {
    private AbstractNode root;
    private Visitor rootVisitor;
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

    public void setTraversal(String traversal){
        switch(traversal){
            case Visitor.INORDER_TRAVERSAL:
            rootVisitor = new InorderNodeVisitor();
            break;

            case Visitor.PREORDER_TRAVERSAL:
            rootVisitor = new PreorderNodeVisitor();
            break;
        }
    }
    
    public void setOrdering(String orderingStrategy){
        switch(orderingStrategy){
            case OrderingStrategy.LEXICOGRAPHIC:
            strategy = new LexicographicOrdering();
            break;

            case OrderingStrategy.REVERSED_LEXICOGRAPHIC:
            strategy = new ReverseLexicographicOrdering();
            break;
        }
    }
}