package mid_prep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseListener, MouseMotionListener{
	
	private Shape currentshape;
	private Shape shapes[];
	private int shapecount = 0;
	final int MAX = 100;
	private int x1, x2, y1, y2;
	
	private int numTypes;
	final int RECT = 1;
	final int OVAL = 2;
	final int SQUARE3 = 3;
	final int CIRCLE3 = 4;
	final int TICTACTOE = 5;
	final int FLAG3 = 6;
	
	private boolean filled;
	private boolean gradient;
	
	private Color color1;
	private Color color2;
	private Color color3;
	public DrawPanel() {
		super();
		shapes = new Shape[MAX];
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0; i<shapecount; i++) {
			shapes[i].draw(g);
			System.out.println(shapes[i]);
		}
		if(currentshape != null)
			currentshape.draw(g);
	}
	public void setColor1(Color color1) {
		this.color1 = color1;
	}
	
	public void setColor2(Color color2) {
		this.color2 = color2;
	}
	
	public void setColor3(Color color3) {
		this.color3 = color3;
	}
	
	public void setShapeType(int numTypes) {
		this.numTypes = numTypes;
	}
	
	public void clear() {
		shapecount = 0;
		repaint();
	}
	
	public void redo() {
		shapecount++;
		repaint();
	}
	
	public void undo() {
		shapecount--;
		repaint();
	}
	
	public void setfilled(boolean filled) {
		this.filled = filled;
	}
	
	public void setgradient(boolean gradient) {
		this.gradient = gradient;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
		
		switch(numTypes) {
		case RECT:
			currentshape = new Rect(x1, y1, x2, y2, filled, gradient, color1, color2);
			break;
		case OVAL:
			currentshape = new Oval(x1, y1, x2, y2, filled, gradient, color1, color2);
			break;
		case SQUARE3:
			currentshape = new Square3(x1, y1, x2, y2, color1, color2, color3);
			break;
		case CIRCLE3:
			currentshape = new Circle3(x1, y1, x2, y2, color1, color2, color3);
			break;
		case TICTACTOE:
			currentshape = new Tictactoe(x1, y1, x2, y2, color1);
			break;
		case FLAG3:
			currentshape = new Flag3(x1, y1, x2, y2, color1, color2, color3);
			break;
		}
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		x2 = x1+120;
		y2 = y2+120;
		shapes[shapecount++] = new Cross(x1, y1, x2, y2, color1);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		x2 = x1;
		y2 = y1;
		switch(numTypes) {
			case RECT:
				currentshape = new Rect(x1, y1, x2, y2, filled, gradient, color1, color2);
				break;
			case OVAL:
				currentshape = new Oval(x1, y1, x2, y2, filled, gradient, color1, color2);
				break;
			case SQUARE3:
				currentshape = new Square3(x1, y1, x2, y2, color1, color2, color3);
				break;
			case CIRCLE3:
				currentshape = new Circle3(x1, y1, x2, y2, color1, color2, color3);
				break;
			case TICTACTOE:
				currentshape = new Tictactoe(x1, y1, x2, y2, color1);
				break;
			case FLAG3:
				currentshape = new Flag3(x1, y1, x2, y2, color1, color2, color3);
				break;
		}
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
		
		switch(numTypes) {
		case RECT:
			shapes[shapecount++] = new Rect(x1, y1, x2, y2, filled, gradient, color1, color2);
			break;
		case OVAL:
			shapes[shapecount++] = new Oval(x1, y1, x2, y2, filled, gradient, color1, color2);
			break;
		case SQUARE3:
			shapes[shapecount++] = new Square3(x1, y1, x2, y2, color1, color2, color3);
			break;
		case CIRCLE3:
			shapes[shapecount++] = new Circle3(x1, y1, x2, y2, color1, color2, color3);
			break;
		case TICTACTOE:
			shapes[shapecount++] = new Tictactoe(x1, y1, x2, y2, color1);
			break;
		case FLAG3:
			shapes[shapecount++] = new Flag3(x1, y1, x2, y2, color1, color2, color3);
			break;
		}
		currentshape = null;
		repaint();
	}
}
