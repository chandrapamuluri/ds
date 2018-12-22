package com.ds.graph;
import java.util.*;
public class GraphDFS{

    int vertex;
    LinkedList<Integer>[] adj;
    GraphDFS(int vertex){
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
     * Have a Stack, push source node,add and mark visited all adjacent nodes of a node, pop, if not visited then visit and add all adjacency nodes.
     * */
    void DFS(int s){
        boolean[] visited = new boolean[vertex];
        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.push(s); visited[s] = true;
        while(!stack.isEmpty()){
            int e = stack.pop();
            System.out.println("Visited:"+e);
            Iterator it = adj[e].iterator();
            while(it.hasNext()){
                int a = (Integer)it.next();
                if(!visited[a]){
                    visited[a] = true;
                    stack.push(a);
                }
            }
        }
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
        GraphDFS g = new GraphDFS(10);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(1,6);
        g.addEdge(6,7);
        g.addEdge(7,8);
        g.addEdge(1,9);
        System.out.println("BFS: from 1:");
        g.BFS(1);
        System.out.println("DFS: from 1:");
        g.DFS(1);
     }
}