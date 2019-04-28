package mid_prep;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	protected int x1, x2, y1, y2;
	protected boolean filled = false;
	protected boolean gradient = false;
	protected Color color1;
	protected Color color2;
	protected Color color3;
	
	public Shape() {
		
	}
	
	public Shape(int x1, int y1, int x2, int y2,Color color1) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.color1 = color1;
	}
	public Shape(int x1, int y1, int x2, int y2, boolean filled, boolean gradient, Color color1, Color color2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.filled = filled;
		this.gradient = gradient;
		this.color1 = color1;
		this.color2 = color2;
	}
	public Shape(int x1, int y1, int x2, int y2, boolean filled, boolean gradient, Color color1, Color color2, Color color3) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.filled = filled;
		this.gradient = gradient;
		this.color1 = color1;
		this.color2 = color2;
		this.color3 = color3;
	}
	public Shape(int x1, int y1, int x2, int y2, Color color1, Color color2, Color color3) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.color1 = color1;
		this.color2 = color2;
		this.color3 = color3;
	}
	public abstract void draw(Graphics g);
}
