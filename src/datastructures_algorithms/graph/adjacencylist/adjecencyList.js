//Adjacency List

//Array of linked lists

class Graph{
    alist = [];

    constructor(){
        this.alist = [];
    }

    addNode(node){
        let currentList = [];
        currentList.push(node);
        this.alist.push(currentList);
    }

    addEdge(src, dst){
        // let currentList = this.alist[src];
        // let dstNode = this.alist[dst][0];
        // currentList.push(dstNode);

        //OR
        this.alist[src].push(this.alist[dst][0]);
    }

    checkEdge(src, dst){
        return this.alist[src].includes(this.alist[dst][0]);
    }

    print(){
        for(let bucket of this.alist){
            let line = "";
            for(let node of bucket){
                line += node.data + " -> ";
            }
            console.log(line);
        }
        // console.log("\n")
    }

}

class Node{

    data;

    constructor(data){
        this.data = data;
    }
}


 const graph = new Graph();

graph.addNode(new Node('A'));
graph.addNode(new Node('B'));
graph.addNode(new Node('C'));
graph.addNode(new Node('D'));
graph.addNode(new Node('E'));

graph.addEdge(0,1);
graph.addEdge(1,2);
graph.addEdge(1,4);
graph.addEdge(2,3);
graph.addEdge(2,4);
graph.addEdge(4,0);
graph.addEdge(4,2);

graph.print();


