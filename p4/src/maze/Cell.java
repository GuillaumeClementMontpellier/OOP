package maze;

import graph.*;
import impl.*;

public class Cell extends Vertex {

	private int x;
	private int y;

	public Cell(Object content, int x, int y){
		
		super(content);

		this.x = x;
		this.y = y;

	}

	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	
}