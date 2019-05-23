package graph;

public class DirectedEdge extends Edge{

	private Vertex start;
	private Vertex end;

	public DirectedEdge(Vertex v1, Vertex v2) throws Exception{
		super(v1, v2);

		this.start = v1;
		this.end = v2;

	}
	public Vertex[] getVertices(){
		Vertex[] ret = {this.start, this.end};

		return ret;
	}

	public Vertex getStart(){
		return this.start;
	}

	public Vertex getEnd(){
		return this.end;
	}
}