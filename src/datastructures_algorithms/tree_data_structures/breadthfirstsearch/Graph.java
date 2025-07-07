package datastructures_algorithms.tree_data_structures.breadthfirstsearch;

import java.util.*;

public class Graph {

    ArrayList<Node> nodes; //optional for headers
    //2D array of Integers
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    //                   source  destination
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }
        else {
            return false;
        }
    }

    public void print(){

        System.out.print("  ");
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
        for(int i = 0; i < matrix.length; i++){

            System.out.print(nodes.get(i).data + " ");

            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void breadthFirstSearch(int src){

        Queue<Integer> queue = new LinkedList<>();

        //boolean array to mark if node has been visited or not
        boolean[] visited = new boolean[matrix.length];

        //with the node we begin at, lets add that to the queue
        queue.offer(src);
        //and mark it visited in the boolean array
        visited[src] = true;

        //as long as queue is there
        while(queue.size() != 0){

            //whatever at the front of the queue - remove
            src = queue.poll();
            //whatever we poll - remove from the queue we display it
            System.out.println(nodes.get(src).data + " = visited");

            //let's say we are at node A, we are going to iterate over the row and
            //look for any adjacent neighbourers
            for(int i = 0; i < matrix[src].length; i++){
                //during iteration check to see if
                //this value is 1  & not visited
                if(matrix[src][i] == 1 && !visited[i]){
                    //if - we add it to queue and mark visited
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
