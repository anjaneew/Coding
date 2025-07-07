package datastructures_algorithms.treedatastructures.binarytree.traversetree;


public class Main {

    public static void main(String[] args) {

        TraverseTree tree = new TraverseTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        System.out.println("Inorder Traversal:");
        tree.inorder();

        System.out.println("\nPostorder Traversal:");
        tree.postorder();


        System.out.println("\nPreorder Traversal:");
        tree.preorder();

    }
}
