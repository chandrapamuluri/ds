package com.test.graph;

import java.util.*;

class Edge{
    int source, dest;
    Edge(int source, int dest){
        this.source = source; this.dest=dest;
    }
}

class Graph{
    int vertices; 
    LinkedList[] adj;
    Graph(int vertexCount, Edge[] edges){
        vertices = vertexCount;
        adj = new LinkedList[vertices];
        for(int i=0; i<vertices; i++){
            adj[i] = new LinkedList();// or adj.add(i,new LinkedList())
        }
        for(Edge e : edges){
            adj[e.source].add(e.dest); //or adj.get(e.source).add(e.dest)
            adj[e.dest].add(e.source); // or adj.get(e.dest).add(e.source)
        }
    }
}

class Node{
    int node, parent;
    Node(int node, int parent){
        this.node=node; this.parent=parent;
    }
}

public class GraphCircle{

    public static boolean FindCircleBFS(Graph g, int source, int n){
        boolean visit[] = new boolean[n];
        LinkedList queue = new LinkedList<>();
        queue.add(new Node(source,-1));
        visit[source] = true;
        while(!queue.isEmpty()){
            Node current = (Node) queue.poll(); //g.adj.
            LinkedList adjList = g.adj[current.node];
            Iterator it = adjList.iterator();
            while(it.hasNext()){
            		int adjNode = (Integer)it.next();
                if(!visit[adjNode]){
                    visit[adjNode] = true;
                    queue.add(adjNode,current);
                }
                else if(adjNode != current.parent){
                    return true;
                }
            }
        }
        return true;
        
        
    }
     public static void main(String []args){
        System.out.println("Hello World");
     }
     
}







































//End
