package graph;

public class UndirectedEdge extends Edge{

	private Vertex[] vertices;

	public UndirectedEdge(Vertex v1, Vertex v2) throws Exception{
		super(v1, v2);

		this.vertices = new Vertex[2];

		this.vertices[0] = v1;
		this.vertices[1] = v2;

	}
	public Vertex[] getVertices(){

		return this.vertices;
	}
}