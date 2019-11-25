package BinarySearchTree;

public abstract class AbstractNode implements NodeVisitable{    
    String key;
    AbstractNode left;
    AbstractNode right;
    public AbstractNode insert(String key,OrderingStrategy strategy){return null;}     
}