package BinarySearchTree;
public interface Visitor{
    public static final String INORDER_TRAVERSAL = "Inorder";
    public static final String PREORDER_TRAVERSAL = "Preorder";
    public String visit(Node root);
    public String visit(NullNode root);	
}