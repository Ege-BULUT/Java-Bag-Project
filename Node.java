public class Node<generic extends Comparable<generic>>{

    private generic data;
    private Node<generic> left;
    private Node<generic> right;
    private int amount;

        public Node(Node<generic> left, generic newData, Node<generic> right){

            this.data = newData;
            this.left = null;
            this.right = null;
            this.amount = 0;
        }

        public void increaseAmount(){
        this.amount++;
        }

        public void decreaseAmount(){
        this.amount--;
        }
                /* Getters */

        public int getAmount(){
            return this.amount;
        }

        public generic getData(){
        return this.data;
         }

        public Node<generic> getLeft(){
            return this.left;
        }

        public Node<generic> getRight(){
            return this.right;
        }

                /* Setters */

        public void setLeft(Node<generic> newNode){
        this.left = newNode;
         }

        public void setRight(Node<generic> newNode){
            this.right = newNode;
        }

        public void setData(generic newData){
            this.data=newData;
        }
}