package BinarySearchTree;

public class InorderNodeVisitor implements Visitor{    
    public String visit(Node root) {        
        String result ="";
        InorderNodeVisitor visitor = new InorderNodeVisitor();
        result += root.left.accept(visitor);
        result += " "+root.key+" ";
        result += root.right.accept(visitor);        
        return result.trim();
    }
    public String visit(NullNode root) {        
        return "";
    }        
}