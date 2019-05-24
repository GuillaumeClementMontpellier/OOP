package graph;

/**
* @author Guillaume CLEMENT
* @author Nesrine CHEKOU
*/
public class UndirectedEdge extends Edge{

  /**
  * Array of the two Vertices of the Edge
  */
	private Vertex[] vertices;

	/**
	* Constructor of a UndirectedEdge
	* @param v1 Vertex at one end of the UndirectedEgde
	* @param v2 Vertex at the other end of the UndirectedEgde
  * @see graph.Edge
	*/
	public UndirectedEdge(Vertex v1, Vertex v2) {

		this.vertices = new Vertex[2];

		this.vertices[0] = v1;
		this.vertices[1] = v2;

	}

	/**
	* Parent Class Method that returns both Vertices of the Edge
	* @return a Vertex tab of size two, with both Vertices of the Edge inside.
	*/
	public Vertex[] getVertices(){

		return this.vertices;
	}
}