/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsabinarysearchtree;

import java.util.LinkedList;

/**
 *
 * @author shashilaheshan
 */
public class GraphDSA {
    
    
    static void printGraph(Graph graph){
        
        
        for(int v=0;v<graph.V;v++){
        
            System.out.println("Adjancency list of vertex "+v);
            System.out.println("head");
            for(Integer p:graph.adjListArray[v]){
                System.out.println("->"+p);
            }
            System.out.println("\n");
        }
        
    }
    
    public static void main(String[] args) {
       //create the graph given in above figure
       int v=5;
       Graph graph=new Graph(v);
       graph.addEdge(graph, 0, 1);
       graph.addEdge(graph, 0, 4);
       graph.addEdge(graph, 1, 2);
       graph.addEdge(graph, 1, 3);
       graph.addEdge(graph, 1, 4);
       graph.addEdge(graph, 2, 3);
       graph.addEdge(graph, 3, 4);
        printGraph(graph);
       
    }
}



class Graph{

    int V;
    LinkedList<Integer> adjListArray[];

    public Graph(int V) {
        this.V = V;
        adjListArray=new LinkedList[V];
        
        for(int i=0;i<V;i++){
        adjListArray[i]=new LinkedList<>();
        }
        
    }
    void addEdge(Graph graph,int src,int dest){
    
         graph.adjListArray[src].addFirst(dest);
        graph.adjListArray[dest].addFirst(src);
    }
    
    
    
    

}