package graph;

import java.util.List;

public class TestGraph {

	public static void main (String[] args){

		Vertex v1 = new Vertex("Pinou");
		Vertex v2 = new Vertex("Presque rien");

		Edge e1 = new DirectedEdge(v1, v2);

		Edge e2 = new UndirectedEdge(v2, v1);

		System.out.println("The package is working.");

	}

}