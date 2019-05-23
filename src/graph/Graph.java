package graph;

import java.util.List;

public interface Graph {

	List<Vertex> getVertices();

	List<Edge> getEdges();

	void addVertex();

	void addEdge(Vertex v1, Vertex v2);

}