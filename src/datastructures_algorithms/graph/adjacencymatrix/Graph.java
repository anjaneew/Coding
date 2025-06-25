package datastructures_algorithms.graph.adjacencymatrix;

public class Graph {

    //2D array of Integers
    int[][] matrix;

    Graph(int size){
        matrix = new int[size][size];
    }

    public void addNode(Node node){

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

    }
}
