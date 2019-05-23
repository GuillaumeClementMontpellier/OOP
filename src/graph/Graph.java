package graph;

import java.util.List;

/**
* @author Guillaume CLEMENT
* @author Nesrine CHEKOU
*/
public interface Graph {

	/**
	* Getter of all the Vertices of the graph
	* @return a List (ArrayList<Vertex> or any other implementation) of Vertices
	*/
	List<Vertex> getVertices();

	/**
	* Getter of all the Edges of the graph
	* @return a List (ArrayList<Vertex> or any other implementation) of Edges
	*/
	List<Edge> getEdges();

	/**
	* Create a new Vertex in the Graph. That Vertex is created with no Edges attached to it. The new Vertex should be in the getVertices return.
	* @see graph.Vertex
	*/
	void addVertex();

  /**
	* Create a new Edge in the Graph. The new Edge should be in the getEdges return.
	* @param v1 Vertex at one side of the new Edge
	* @param v2 Vertex at the other side of the new Edge
  * @see graph.Edge
	*/
	void addEdge(Vertex v1, Vertex v2);

}