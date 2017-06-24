/**
 * 
 */
package com.sringernature;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

/**
 * @author admin
 *
 */
public class Drawer {

	private String input;
	private static final String pixel =  "x";
	//coordinates
	private int w,h, x1, y1, x2, y2;
	private Color c;
	private Rectangle2D rectangle;
	private Canvas canvas;
//	CommandLineHelper commandHelper = new CommandLineHelper();
	
	public Drawer(String input) {
		this.input=input;
	}

	public Drawer() {
		// TODO Auto-generated constructor stub
	}

	public void drawCanvas(String input) {
		w = CommandLineHelper.getX1(input);
		h = CommandLineHelper.getY1(input);
		
		try {
			canvas = new Canvas(w, h);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void drawStraightLine(String input) {
		x1 = CommandLineHelper.getX1(input);
		y1 = CommandLineHelper.getY1(input);
		x2 = CommandLineHelper.getX2(input);
		y2 = CommandLineHelper.getY2(input);
		canvas.showCanvas();
		if(x1 <= w && x2 < w && y1 <=h && y2 < h){
			
			//draws horizontal line from start point
			for (int i = 0; i < x1; i++) {
				System.out.print(" ");
			}
			//draws horizontal pixels to end point
			for (int i = 0; i < x2; i++) {
				System.out.print(pixel);
			}
			//draws vertical line from start point
			for (int i = 0; i < y1; i++) {
				System.out.print(" ");
			}
			//draws vertical pixels to end point
			for (int i = 0; i < y2; i++) {
				System.out.print(pixel);
			}
			
		}
		
		
		
		
	}

	public void drawColorfulCanvas(String input2) {
		// TODO Auto-generated method stub
		
	}

	public void paintCanvas(String string) {
		// TODO Auto-generated method stub
		
	}
		
	
	
}
