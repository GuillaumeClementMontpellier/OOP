package graph;

import java.util.List;

/**
* @author Guillaume CLEMENT
* @author Nesrine CHEKOU
*/
public abstract class Edge{

	/**
	* Constructor of an Edge
	* <p> 
	* It is using the Vertex method addEdge to add this edge to both Vertices
	* </p>
	* @param v1 Vertex at one side of the Edge
	* @param v2 Vertex at the other side of the Edge
	* @throws Exception if the Vertices does not have the same parent Graph (it can be both null without problem)
	*/
	public Edge(Vertex v1, Vertex v2) throws Exception{

		if( (v1.getParent() == null && v2.getParent() == null) || v1.getParent() == v2.getParent() ){

			v1.addEdge(this);
			v2.addEdge(this);

		} else {
			throw new Exception("Not the same Parents");
		}
	}

	/**
	* Abstract Method that returns both Vertices of the Edge
	* @return a Vertex Array of size two, with both Vertices of the Edge inside.
	*/
	public abstract Vertex[] getVertices();

}