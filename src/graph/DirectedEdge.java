package graph;

/**
* @author Guillaume CLEMENT
* @author Nesrine CHEKOU
*/
public class DirectedEdge extends Edge{

  /**
  * Start of the directed egde
  */
  private Vertex start;

  /**
  * End of the directed egde
  */
  private Vertex end;

	/**
	* Constructor of a DirectedEdge
	* @param v1 Vertex at the start of the DirectedEdge
	* @param v2 Vertex at the end of the DirectedEdge
	* @return a new DirectedEdge
	* @throws Exception if the Vertices does not have the same parent Graph (it can be both null without problem)
  * @see graph.Edge
	*/
	public DirectedEdge(Vertex v1, Vertex v2) throws Exception{
		super(v1, v2);

		this.start = v1;
		this.end = v2;

	}

	/**
	* Parent Class Method that returns both Vertices of the Edge
	* @return a Vertex tab of size two, with both Vertices of the Edge inside: [StartVertex, EndVertex]
	*/
	public Vertex[] getVertices(){
		Vertex[] ret = {this.start, this.end};

		return ret;
	}

	/**
	* Getter for the Starting Vertex
	* @return Vertex at the start of the DirectedEdge
	*/
	public Vertex getStart(){
		return this.start;
	}

	/**
	* Getter for the Ending Vertex
	* @return Vertex at the end of the DirectedEdge
	*/
	public Vertex getEnd(){
		return this.end;
	}
}