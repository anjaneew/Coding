package datastructures_algorithms.treedatastructures.binarytree;

public class Main {

    public static void main(String[] args){
        //Binary tree - a tree data structure, where each node is greater than its left child,
        //               but less than its right

        //create Binary Search Tree object
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

//        tree.display();

        System.out.println("Search: " + tree.search(5));
        tree.remove(0);

    }

}
