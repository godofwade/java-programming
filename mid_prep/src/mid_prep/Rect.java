package mid_prep;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rect extends Shape{
	public Rect(int x1, int y1, int x2, int y2, boolean filled, boolean gradient, Color color1, Color color2) {
		super(x1, y1, x2, y2, filled, gradient, color1, color2);
	}
	public Rect(int x1, int y1, int x2, int y2,Color color1, Color color2, Color color3) {
		// TODO Auto-generated constructor stub
		super(x1, y1, x2, y2, color1, color2, color3);
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		
		if(gradient) {
			g2d.setPaint(new GradientPaint(x1, x2, color1, x2, y2, color2));
		}
		else {
			g2d.setColor(color1);
		}
		if(filled) {
			g2d.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
			
		}
		else {
			g2d.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		}
	}
	@Override
	public String toString() {
		return "Rect [x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + ", filled=" + filled + ", gradient="
				+ gradient + ", color1=" + color1 + ", color2=" + color2 + ", color3=" + color3 + "]";
	}
}
