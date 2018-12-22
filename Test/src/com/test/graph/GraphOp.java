package com.test.graph;

import java.util.*;

public class GraphOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    class Graph{
	        LinkedList<Integer>[] vertexArray;
	        int vertices;
	        Graph(int size)
	        {
	            vertices = size;
	            //adjListArray = new LinkedList[V]; 
	            vertexArray = new LinkedList[vertices];
	            for(int i =0; i < vertices; i++){
	                vertexArray[i] = new LinkedList<>();
	            }
	        }
	    }

	}

}
