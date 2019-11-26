package BinarySearchTree;

public class Node extends AbstractNode implements Visitable{    
    public Node(String item){
        key = item;
        left = right = new NullNode();
    }
    
    public Node insert(String item, OrderingStrategy strategy){               
        if(strategy.orderNodes(this.key, item)){
            this.left = this.left.insert(item,strategy);
        }else{
            this.right = this.right.insert(item,strategy);
        }
        return this; 
    }

    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }           
}