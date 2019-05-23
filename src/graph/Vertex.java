package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex{

	private List<Edge> edges;
	private Object content;

	private Graph parent;

	public Vertex(Graph parent, Object content){
		this.edges = new ArrayList<Edge>();
		this.setContent(content);
		this.parent = parent;
	}

	public Vertex(Object content){
		this(null, content);
	}

	public List<Edge> getEgdes(){
		return this.edges;
	}

	public void addEdge(Edge edge){
		edges.add(edge);
	}

	public Object getContent(){
		return this.content;
	}

	public void setContent(Object content){
		this.content = content;
	}

	public Graph getParent(){
		return this.parent;
	}

}