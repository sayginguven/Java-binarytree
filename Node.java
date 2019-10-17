package ca.saygin;

class Node {

    private int val;
    private Node left;
    private Node right;

    public Node(int val){
        this.val = val;
    }

    public void insert (int val) {

        if (val <= this.val) {
            if (left == null) {
                left = new Node(val);
            } else{
                left.insert(val);
            }
        }

        if (val > this.val) {
            if (right == null) {
                right = new Node(val);
            } else {
                right.insert(val);
            }
        }
    }

    public void inOrderTraversal(){

        if(left !=null){
            left.inOrderTraversal();
        }

        System.out.print(this.val + " ");

        if(right != null){
            right.inOrderTraversal();
        }
    }

    public void preOrderTraversal(){
        //root first
        System.out.print(this.val + " ");

        if(left !=null){
            left.preOrderTraversal();
        }

        if(right != null){
            right.preOrderTraversal();
        }
    }

    public void postOrderTraversal(){
        //root last
        if(left !=null){
            left.postOrderTraversal();
        }

        if(right != null){
            right.postOrderTraversal();
        }

        System.out.print(this.val + " ");
    }

    public boolean hasContain(int val){

        if (this.val == val) {
            return true;
        }

        if(val <= this.val && left != null){
            return left.hasContain(val);
        }

        if(val > this.val && right !=null){
            return right.hasContain(val);
        }

        return false;
    }

}
