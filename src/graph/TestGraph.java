package graph;

import java.util.List;

public class TestGraph {

	public static void main (String[] args){

		Vertex v1 = new Vertex("Pinou");
		Vertex v2 = new Vertex("Presque rien");

		try{
			Edge e1 = new DirectedEdge(v1, v2);

			Edge e2 = new UndirectedEdge(v2, v1);
		}catch(Exception e){

			System.out.println("Error : "+e);

		} 

		System.out.println("La Bete est VIVANTE !!");

	}

}