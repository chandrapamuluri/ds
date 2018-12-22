package com.ds.graph;
import java.util.*;
public class GraphBFS{

    int vertex;
    LinkedList<Integer>[] adj;
    GraphBFS(int vertex){
        this.vertex=vertex;
        adj = new LinkedList[vertex];
        for(int i=0;i<vertex;i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
    void addEdge(int s, int t){
        //LinkedList ls = (LinkedList) adj[s];
        //ls.add(t);
        adj[s].add(t);
        //adj[t].add(s);
    }
    /**
     * Array of size vertex, which notes the node/vertex is visited or not.
     * Have a Queue, add source node,add and mark visited all adjacent nodes of a node, poll, if not visited then visit and add all adjacency nodes.
     * */
    void BFS(int s){
        boolean[] visited = new boolean[vertex];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(s); visited[s] = true;
        while(!queue.isEmpty()){
            int e = queue.poll();
            System.out.println("Visited:"+e);
            Iterator it = adj[e].iterator();
            while(it.hasNext()){
                int a = (Integer)it.next();
                if(!visited[a]){
                    visited[a] = true;
                    queue.add(a);
                }
            }
        }
    }
     public static void main(String []args){
        System.out.println("Hello World");
        GraphBFS g = new GraphBFS(10);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(1,6);
        g.addEdge(6,7);
        g.addEdge(7,8);
        g.addEdge(1,9);
        g.BFS(1);
     }
}