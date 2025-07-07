package datastructures_algorithms.treedatastructures.binarytree.traversetree;

public class TraverseTree {

    Node root;


    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        if(root == null){
            return node;
        }

        if(node.data < root.data){
            root.left = insertHelper(root.left, node);
        }
        else{
            root.right = insertHelper(root.right, node);
        }

        return root;

    }

    public void inorder(){
        inorderTraverse(root);
    }

    private void inorderTraverse(Node root){
        if(root == null){
            return;
        }
        inorderTraverse(root.left);
        System.out.println(root.data + " ");
        inorderTraverse(root.right);

    }

    public void postorder(){
        postorderTraverse(root);
    }

    private void postorderTraverse(Node root){
        if(root == null){
            return;
        }
        postorderTraverse(root.left);
        postorderTraverse(root.right);
        System.out.println(root.data + " ");

    }

    public void preorder(){
        preorderTraverse(root);
    }

    private void preorderTraverse(Node root){

        if(root == null){
            return;
        }
        //copy the tree
        System.out.println(root.data + " ");
        preorderTraverse(root.left);
        preorderTraverse(root.right);

    }

}
