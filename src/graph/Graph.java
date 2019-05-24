package graph;

/**
* @author Guillaume CLEMENT
* @author Nesrine CHEKOU
*/
public interface Graph {

	/**
	* Getter of all the Vertices of the graph
	* @return an array of Vertices
	*/
	Vertex[] getVertices();

	/**
	* Getter of all the Edges of the graph
	* @return an array of Edges
	*/
	Edge[] getEdges();

	/**
	* Create a new Vertex in the Graph. That Vertex is created with no Edges attached to it. The new Vertex should be in the getVertices return.
	* @param content Content of the new Vertex
	* @see graph.Vertex
	*/
	void addVertex(Object content);

  /**
	* Create a new Edge in the Graph. The new Edge should be in the getEdges return.
	* @param v1 Vertex at one side of the new Edge
	* @param v2 Vertex at the other side of the new Edge
  * @see graph.Edge
	*/
	void addEdge(Vertex v1, Vertex v2);

	/**
	* Create a new Vertex in the Graph. That Vertex is created with no Edges attached to it. The new Vertex should be in the getVertices return.
	* @param v1 Vertex to be tested
	* @param v2 Vertex to be tested
	* @return boolean true if there are an Egde between v1, else false 
	* @see graph.Vertex
	*/
	boolean connected(Vertex v1, Vertex v2);

	/**
	* All the neighbour of the Vertex
	* @param v1 The target Vertex
	* @return an array of Vertices that have an Edge with v1
	*/
	Vertex[] neighbour(Vertex v1);

}