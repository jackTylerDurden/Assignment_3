package BinarySearchTree;

public interface OrderingStrategy{ 
    public static final String LEXICOGRAPHIC = "lexicographic";
    public static final String REVERSED_LEXICOGRAPHIC = "revLexicographic";
    public Boolean orderNodes(String rootKey,String key);
}