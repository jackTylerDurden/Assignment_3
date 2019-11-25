package BinarySearchTree;

public class ReverseLexicographicOrdering implements OrderingStrategy{
    public Boolean orderNodes(String rootKey, String item){
        StringBuilder str = new StringBuilder();
        str.append(item);
        str = str.reverse();
        item = String.valueOf(str);
        str = new StringBuilder();
        str.append(rootKey);
        str = str.reverse();
        rootKey = String.valueOf(str);        
        if(rootKey.compareTo(item) > 0){
            return true;
        }
        return false;
    }
}