package mid_prep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Flag3 extends Rect{

	public Flag3(int x1, int y1, int x2, int y2, Color color1, Color color2, Color color3) {
		super(x1, y1, x2, y2, color1, color2, color3);
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		int width = Math.abs(x1-x2);
		int height = Math.abs(y1-y2);
		g2d.setColor(color1);
		g2d.fillRect(Math.min(x1, x2), Math.min(y1, y2), width/3, height);
		g2d.setColor(color2);
		g2d.fillRect(Math.min(x1, x2)+width/3, Math.min(y1, y2), width/3, height);
		g2d.setColor(color3);
		g2d.fillRect(Math.min(x1, x2)+width/3*2, Math.min(y1, y2), width/3, height);
	}
	@Override
	public String toString() {
		return "Flag3 [x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + ", filled=" + filled + ", gradient="
				+ gradient + ", color1=" + color1 + ", color2=" + color2 + ", color3=" + color3 + "]";
	}
}
