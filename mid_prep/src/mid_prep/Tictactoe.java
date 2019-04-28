package mid_prep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Tictactoe extends Shape{
	
	public Tictactoe(int x1, int y1, int x2, int y2, Color color1) {
		super(x1, y1, x2, y2, color1);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		int width;
		if(Math.abs(x2 - x1) > Math.abs(y2 - y1)) {
			width = Math.abs(x2 - x1);
		}else {
			width = Math.abs(y2 - y1);
		}
		
		int xs = Math.min(x1, x2);
		int ys = Math.min(y1, y2);
		int xe = Math.max(x1, x2);
		int ye = Math.max(y1, y2);
		g2d.setColor(color1);
		g2d.drawLine(xs+width/3, ys, xs+width/3, ys+width);
		g2d.drawLine(xs+width/3*2, ys, xs+width/3*2, ys+width);
		g2d.drawLine(xs, ys+width/3, xs+width, ys+width/3);
		g2d.drawLine(xs, ys+width/3*2, xs+width, ys+width/3*2);
		g2d.drawOval(x1, y1, width/3, width/3);
		g2d.drawLine(xs+width/3, ys, xs+width/3*2, ys+width/3);
		g2d.drawLine(xs+width/3*2, ys, xs+width/3, ys+width/3);
	}

	@Override
	public String toString() {
		return "Tictactoe [x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + ", filled=" + filled + ", gradient="
				+ gradient + ", color1=" + color1 + ", color2=" + color2 + ", color3=" + color3 + "]";
	}

}
