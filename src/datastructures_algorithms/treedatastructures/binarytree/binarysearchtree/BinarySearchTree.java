package datastructures_algorithms.treedatastructures.binarytree.binarysearchtree;

public class BinarySearchTree {

    Node root;

    //methods
    public void insert(Node node){
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node){

        int data = node.data;//get the node given to u

        if(root == null){//check if the root node is assigned or not
            root = node;// cool, vacancy. go ahead
            return root;//this is the root. done
        }
        else if(data < root.data){//root is not vacant so now check it goes left
            root.left = insertHelper(root.left, node);
        }
        else{ //root is not vacant and the number is higher so now it goes right
            root.right = insertHelper(root.right, node);
        }

        return root;//this is the root. all done
    }

    public void display(){
        displayHelper(root);
    }

    private void displayHelper(Node root){

        //in order traversal - ascending order / non-decreasing order
        //                      a method of visiting all the nodes
        //                      in a binary tree in a specific order:
        //                      left subtree, then the current node, and finally the right subtree

        if(root != null){
            displayHelper(root.left);//rootchild's left node
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data){
        return searchHelper(root,data);
    }

    private boolean searchHelper(Node root, int data){
        if(root == null){//if the tree is empty
            return false;
        }
        else if(root.data == data){
            return true; //found a match
        }
        else if(root.data > data){
            return searchHelper(root.left, data); //check the less numbers
        }
        else{
            return searchHelper(root.right, data); //check the more side
        }
    }

    public void remove(int data){

        if(search(data)){//if the data even exist to remove in the first place
            removeHelper(root,data);
        }
        else{
            System.out.println(data + " could not be found.");//data is not found
        }
    }

    private Node removeHelper(Node root, int data) {

        if(root == null){
            return root;//if match is not there, end search
        }
        else if(data < root.data){
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data){
            root.right = removeHelper(root.right, data);
        }
        else{
            //node found - data == root.data
            if(root.left == null && root.right == null){ //is the data leaf node?
                root = null; //great simple. we just remove
            }
            //otherwise, we need to connect the child nodes of the subtree to the main tree
            else if(root.right != null){
                //find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else{
                //find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(Node root) {
        //find least value below the right child of this root node

//  ex: removing 3
//      Initial Subtree  >  Step 1:               Step 2           >   Step 3         >  Step 4
//       3                 At node 3              4 has no left       Replace 3 with 4   Delete original 4
//      / \                → right child exists   → successor = 4        4               (right child)
//     2   4               → go right                                   / \                4
//                                                                     2   4              /
//                                                                                       2

        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root) {
        //find greatest value below the left child of this root node
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }


}
