package BinarySearchTree;

public class NullNode extends AbstractNode implements Visitable{    

    public NullNode(){
        key = "";        
    }
    public Node insert(String item, OrderingStrategy strategy) {
        return new Node(item);             
    }    

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);

    }
}