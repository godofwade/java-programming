package mid_prep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Cross extends Shape{
	public Cross(int x1, int y1, int x2, int y2, Color color1) {
		super(x1, y1, x2, y2, color1);
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawLine(x1, y1, x2, y2);
		g2d.drawLine(x2, y1, x1, y2);
	}

}
