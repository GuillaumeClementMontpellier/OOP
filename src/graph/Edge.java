package graph;

import java.util.List;

public abstract class Edge{

	public Edge(Vertex v1, Vertex v2) throws Exception{

		if( (v1.getParent() == null && v2.getParent() == null) || v1.getParent() == v2.getParent() ){

			v1.addEdge(this);
			v2.addEdge(this);

		} else {
			throw new Exception("Not the same Parents");
		}
	}

	public abstract Vertex[] getVertices();

}