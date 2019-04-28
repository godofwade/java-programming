package mid_prep;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PainterFrame extends JFrame implements ActionListener, ItemListener{
	
	private DrawPanel drawpanel;
	
	private JPanel actionPanel;
	private JButton clear;
	private JButton undo;
	private JButton redo;
	
	private JPanel shapePanel;
	private GridBagConstraints gbc;
	private JButton colorreset;
	private JButton rect;
	private JButton oval;
	private JButton square3;
	private JButton circle3;
	private JButton tictactoe;
	private JButton flag3;
	private JButton resetcolor;
	private JButton cross;
	
	private JCheckBox filled;
	private JCheckBox gradient;
	
	private Icon coloricon;
	private JButton colorbtn1;
	private Color color1;
	private JButton colorbtn2;
	private Color color2;
	private JButton colorbtn3;
	private Color color3;
	
	private int numTypes = 6;
	final int RECT = 1;
	final int OVAL = 2;
	final int SQUARE3 = 3;
	final int CIRCLE3 = 4;
	final int TICTACTOE = 5;
	final int FLAG3 = 6;
	
	final Color dfcolor1 = Color.BLUE;
	final Color dfcolor2 = new Color(186,85,211); 
	final Color dfcolor3 = Color.GREEN;
	
	public PainterFrame() {
		super();
		//Tribunal
		drawpanel = new DrawPanel();
		add(drawpanel, BorderLayout.CENTER);
		//actionpanel
		actionPanel = new JPanel();
		
		clear = new JButton("Clear");
		actionPanel.add(clear);
		clear.addActionListener(this);
		
		undo = new JButton("Undo");
		actionPanel.add(undo);
		undo.addActionListener(this);
		
		redo = new JButton("Redo");
		actionPanel.add(redo);
		redo.addActionListener(this);
		
		add(actionPanel, BorderLayout.SOUTH);
		//shapepanel
		shapePanel = new JPanel(new GridBagLayout());
		gbc = new GridBagConstraints();
		
		colorreset = new JButton("<html>Color<br>Reset</html>");
		setGridBagConstraints(0,0,2,1,true);
		shapePanel.add(colorreset,gbc);
		colorreset.addActionListener(this);
		
		coloricon = new ImageIcon(getClass().getResource("color.png"));
		colorbtn1 = new JButton("C1", coloricon);
		setGridBagConstraints(1,0,2,1,true);
		shapePanel.add(colorbtn1, gbc);
		colorbtn1.addActionListener(this);
		colorbtn1.setBackground(dfcolor1);
		drawpanel.setColor1(dfcolor1);
		
		colorbtn2 = new JButton("C2", coloricon);
		setGridBagConstraints(2,0,2,1,true);
		shapePanel.add(colorbtn2, gbc);
		colorbtn2.addActionListener(this);
		colorbtn2.setBackground(dfcolor2);
		drawpanel.setColor2(dfcolor2);
		
		colorbtn3 = new JButton("C3", coloricon);
		setGridBagConstraints(3,0,2,1,true);
		shapePanel.add(colorbtn3,gbc);
		colorbtn3.addActionListener(this);
		colorbtn3.setBackground(Color.BLACK);
		drawpanel.setColor3(dfcolor3);
		
		filled = new JCheckBox("Filled", false);
		setGridBagConstraints(4,0,1,1,true);
		shapePanel.add(filled, gbc);
		filled.addItemListener(this);
		
		gradient = new JCheckBox("Gradient", false);
		setGridBagConstraints(4,1,1,1,true);
		shapePanel.add(gradient, gbc);
		gradient.addItemListener(this);
		
		rect = new JButton("Rect");
		setGridBagConstraints(5,0,1,1,true);
		shapePanel.add(rect, gbc);
		rect.addActionListener(this);
		
		oval = new JButton("Oval");
		setGridBagConstraints(5,1,1,1,true);
		shapePanel.add(oval, gbc);
		oval.addActionListener(this);
		
		square3 = new JButton("Square3");
		setGridBagConstraints(6,0,1,1,true);
		shapePanel.add(square3, gbc);
		square3.addActionListener(this);
		
		circle3 = new JButton("Circle3");
		setGridBagConstraints(6,1,1,1,true);
		shapePanel.add(circle3, gbc);
		circle3.addActionListener(this);
		
		tictactoe = new JButton("tictactoe");
		setGridBagConstraints(7,0,1,1,true);
		shapePanel.add(tictactoe, gbc);
		tictactoe.addActionListener(this);
		
		flag3 = new JButton("Flag3");
		setGridBagConstraints(7,1,1,1,true);
		shapePanel.add(flag3, gbc);
		flag3.addActionListener(this);
		
		cross = new JButton("Corss");
		setGridBagConstraints(8,0,2,1,true);
		shapePanel.add(cross,gbc);
		cross.addActionListener(this);
		
		add(shapePanel, BorderLayout.NORTH);
	}
	public void colorReset() {
		colorbtn1.setBackground(dfcolor1);
		drawpanel.setColor1(dfcolor1);
		colorbtn2.setBackground(dfcolor2);
		drawpanel.setColor2(dfcolor2);
		colorbtn3.setBackground(dfcolor3);
		drawpanel.setColor3(dfcolor3);
	}
	public void setGridBagConstraints(int x, int y, int h, int w, boolean fill) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridheight = h;
		gbc.gridwidth = w;
		if(fill) {
			gbc.fill = GridBagConstraints.BOTH;
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == filled) {
			if(e.getStateChange() == ItemEvent.SELECTED)
				drawpanel.setfilled(true);
			else
				drawpanel.setfilled(false);
		}
		else if(e.getSource() == gradient){
			if(e.getStateChange() == ItemEvent.SELECTED)
				drawpanel.setgradient(true);
			else
				drawpanel.setgradient(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == colorreset)
			colorReset();
		else if(e.getSource() == clear)
			drawpanel.clear();
		else if(e.getSource() == redo)
			drawpanel.redo();
		else if(e.getSource() == undo)
			drawpanel.undo();
		else if(e.getSource() == rect)
			drawpanel.setShapeType(RECT);
		else if(e.getSource() == oval)
			drawpanel.setShapeType(OVAL);
		else if(e.getSource() == square3)
			drawpanel.setShapeType(SQUARE3);
		else if(e.getSource() == circle3)
			drawpanel.setShapeType(CIRCLE3);
		else if(e.getSource() == tictactoe)
			drawpanel.setShapeType(TICTACTOE);
		else if(e.getSource() == flag3)
			drawpanel.setShapeType(FLAG3);
		else if(e.getSource() == colorbtn1) {
			color1 = JColorChooser.showDialog(PainterFrame.this, "Pick Color", color1);
			colorbtn1.setBackground(color1);
			drawpanel.setColor1(color1);
		}
		else if(e.getSource() == colorbtn2) {
			color2 = JColorChooser.showDialog(PainterFrame.this, "Pick Color", color2);
			colorbtn2.setBackground(color2);
			drawpanel.setColor1(color2);
		}
		else if(e.getSource() == colorbtn3) {
			color3 = JColorChooser.showDialog(PainterFrame.this, "Pick Color", color3);
			colorbtn3.setBackground(color3);
			drawpanel.setColor1(color3);
		}
		else if(e.getSource() == cross) {
			drawpanel.setShapeType(8);
		}
			
	}
}
