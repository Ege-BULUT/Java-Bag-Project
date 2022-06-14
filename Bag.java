public class Bag<generic extends Comparable<generic>> {

    private int distinctVal;
    private int size;
    Node<generic> root;


    public int getDistinctSize(){
        return this.distinctVal;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        if(this.root == null){
            return true;
        }
        return false;
    }

    public boolean contains (generic newData){
        return contains(newData, root);
    }

    private boolean contains(generic newData, Node<generic> tempNode){

        if(tempNode == null){
            return false;
        }
        else if (newData.compareTo(tempNode.getData())<0){
            return contains(newData, tempNode.getLeft());
        }
        else if (newData.compareTo(tempNode.getData())>0) {
            return contains(newData, tempNode.getRight());
        }

        return true;
    }

    public boolean equals(Object Bag2) {
        if (Bag2 == this){
            return true;
        }

        else {
            if (this.getClass() == Bag2.getClass()){
                Bag<generic> bag2 = (Bag<generic>) Bag2;
                if(bag2.getSize() != this.getSize()){
                    return false;
                }
                if(bag2.getDistinctSize() != this.getDistinctSize()){
                    return false;
                }
                else
                    return this.areAllEqual(this) && bag2.areAllEqual(bag2);
            }
            else return false;
        }
    }

    private boolean areAllEqual(Bag<generic> bag){
        return areAllEqual(bag, root);
    }

    private boolean areAllEqual(Bag<generic> bag2, Node<generic> tempNode){
        if(tempNode == null){
            return true;
        }

        if(bag2.amountAndContainSearch(tempNode.getData(), tempNode.getAmount())){
            return areAllEqual(bag2, tempNode.getLeft()) && areAllEqual(bag2, tempNode.getRight());
        }
        else
            return false;
    }

    private boolean amountAndContainSearch(generic Data, int amount){
        Node<generic> searchNode = findNode(root, Data);
        if(searchNode.getAmount() != amount){
            return false;
        }
        else
            return true;
    }

    public Node<generic> findNode (generic newData){
        return findNode(root, newData);
    }
    private Node<generic> findNode(Node<generic> tempNode, generic newData) {

        if (tempNode == null){
            return null;
        }

        if (newData.compareTo(tempNode.getData()) > 0) {
            return findNode(tempNode.getRight(), newData);
        }
        else if  (newData.compareTo(tempNode.getData()) < 0){
            return findNode(tempNode.getLeft(), newData);
        }
        else
            return tempNode;
    }


    public void add (generic newData){
        if(newData!=null) {
            this.size++;
            root = add(newData, root);
        }
    }

    private Node<generic> add (generic newData, Node<generic> tempNode){
        if(newData == null){
            return null;
        }
      else
        if(tempNode==null){
            Node<generic> newNode = new Node<generic> (null, newData, null);
            distinctVal++;
            newNode.increaseAmount();
            return newNode;
        }

        if (newData.compareTo(tempNode.getData())==0){
            tempNode.increaseAmount();
        }
        else if (newData.compareTo(tempNode.getData())<0){
            tempNode.setLeft(add(newData, tempNode.getLeft()));
        }
        else if (newData.compareTo(tempNode.getData())>0){
            tempNode.setRight(add(newData, tempNode.getRight()));
        }

        return tempNode;
    }

    public String toString() {
        String dataArray = toString(root);
        if(dataArray.isEmpty())
            return "empty";
         return dataArray;
        }

    private String toString(Node<generic> tempNode){
                 if(tempNode == null){
                     return "";
                }

                String bag = "";

                bag += toString (tempNode.getLeft());
                bag += tempNode.getData()+"["+tempNode.getAmount()+"]  ";
                bag += toString(tempNode.getRight());
            return bag;
        }

        public String clear(){
        this.root = null;
        size=0;
        distinctVal=0;
        return "Cleared sucssesfully!";
        }

        public boolean remove (generic newData){
        if(findNode(root, newData) == null){
            return false;
        }
        else{
            remove(newData, root);
            size--;
            return true;
        }
    }

    private Node<generic> remove(generic newData, Node<generic> tempNode){

        if (tempNode == null) {
            return null;
        }

        if (newData.compareTo(tempNode.getData()) < 0) {
            tempNode.setLeft(remove(newData, tempNode.getLeft()));
        }
        else if  (newData.compareTo(tempNode.getData()) > 0){
            tempNode.setRight(remove(newData, tempNode.getRight()));
        }
        else {
            if(tempNode.getAmount()>1) {
                tempNode.decreaseAmount();
            }
            else{
                distinctVal--;
                if (tempNode.getRight() == null && tempNode.getLeft() == null){
                    return null;
                }
                else if(tempNode.getRight() == null){
                    return tempNode.getLeft();
                }
                else if (tempNode.getLeft() == null){
                    return tempNode.getRight();
                }
                else{
                    generic maxVal = maxVal(tempNode.getLeft());
                    tempNode.setData(maxVal);
                    tempNode.setLeft(remove(maxVal, tempNode.getLeft()));
                }
            }
        }
        return tempNode;
    }
    private generic maxVal(Node<generic> tempNode){
        if(tempNode.getRight()!=null)
            return maxVal(tempNode.getRight());
        return tempNode.getData();
    }
}