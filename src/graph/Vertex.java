package graph;

/**
* @author Guillaume CLEMENT
* @author Nesrine CHEKOU
*/
public class Vertex{

  /**
  * Content Object of the Vertex
  */
	private Object content;

  /**
  * Parent Graph of the Vertex (can be null)
  */
	private Graph parent;

	/**
	* Constructor of an Vertex (with parent)
	* @param parent Graph which the vertex belongs to
	* @param content Content Object of the Vertex
	*/
	public Vertex(Graph parent, Object content){
		this.setContent(content);
		this.parent = parent;
	}

	/**
	* Constructor of an Vertex (without parents)
	* <p> 
	* Its parent is set to null
	* </p>
	* @param content Content Object of the Vertex
	*/
	public Vertex(Object content){
		this(null, content);
	}

  /**
  * Getter for the content of the Vertex
  * @return Whatever object was passed in parameter
  */
	public Object getContent(){
		return this.content;
	}

  /**
  * Setter for the content of the Vertex
  * @param content The new content of the vertex
  */
	public void setContent(Object content){
		this.content = content;
	}

  /**
  * Getter for the Graph parent iof the object
  * @return The parent graph (can be null if not set)
  */
	public Graph getParent(){
		return this.parent;
	}

}