package  ca.saygin;

public class Main {

    public static void main(String[] args) {
        Node node = new Node(10);
        node.insert(5);
        node.insert(2);
        node.insert(16);
        node.insert(12);
        node.insert(17);
        node.insert(1);
        node.insert(7);
        node.insert(3);

        System.out.println("inorder");
        node.inOrderTraversal();
        System.out.println();

        System.out.println("pre order");
        node.preOrderTraversal();
        System.out.println();

        System.out.println("post order");
        node.postOrderTraversal();
        System.out.println();

        System.out.println("checking the numbers from 1 to 10");
        for (int i = 1; i < 11; i++)
            if(node.hasContain(i))
                System.out.print(i + " ");
    }
}