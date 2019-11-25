package BinarySearchTree;

public class PreorderNodeVisitor implements Visitor{    
    public String visit(Node root) {        
        String result = "("+root.key;
        PreorderNodeVisitor visitor = new PreorderNodeVisitor();
        result += root.left.accept(visitor);        
        result += root.right.accept(visitor);
        result += ")";
        return result;
    }
    public String visit(NullNode root) {        
        return "()";
    }        
}