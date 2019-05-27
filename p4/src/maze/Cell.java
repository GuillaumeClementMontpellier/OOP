package maze;

import graph.*;
import impl.*;

public class Cell extends Vertex  implements java.io.Serializable{

	private int x;
	private int y;

	private TypeCell type;

	public Cell(Object content, int x, int y, TypeCell type){
		
		super(content);

		this.x = x;
		this.y = y;

		this.type = type;

	}

	public TypeCell getTypeCell(){
		return this.type;
	}

	public void setTypeCell(TypeCell type){
		this.type = type;
	}

	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	
}