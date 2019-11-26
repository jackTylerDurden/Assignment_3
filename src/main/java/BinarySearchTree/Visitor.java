package BinarySearchTree;
public interface Visitor{
    public static final String INORDER_TRAVERSAL = "inorder";
    public static final String PREORDER_TRAVERSAL = "preorder";
    public String visit(Node root);
    public String visit(NullNode root);	
}