package org.jnit.spring.javaconfiguration;
//shapecreator class has a dependency on shape instance(circle, triangle or rectangle)
public class ShapeCreator {

	private Shape shape;
	
	public ShapeCreator(Shape shape){
		this.shape = shape;
	}
	
	public ShapeCreator(){
		
	}
	
	public Shape getShape() {
		return shape;
	}
}
