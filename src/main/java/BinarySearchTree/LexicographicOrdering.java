package BinarySearchTree;

public class LexicographicOrdering implements OrderingStrategy{
    public Boolean orderNodes(String rootKey, String item){        
        if(rootKey.compareTo(item) > 0){
            return true;
        }
        return false;
    }
}