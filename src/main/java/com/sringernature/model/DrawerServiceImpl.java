/**
 * 
 */
package com.sringernature.model;

import java.awt.Color;

import com.sringernature.util.CommandLineHelper;

/**
 * @author bruno.serralheiro
 *
 */
public class DrawerServiceImpl implements DrawerService {
	private final String xLine = "-";
	private final String yLine = "|";
	private static final String pixel = "x";
	// coordinates
	private int w, h, x1, y1, x2, y2;

	public DrawerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sringernature.DrawerService#drawCanvas(java.lang.String)
	 */
	@Override
	public void drawCanvas(String input) {
		w = CommandLineHelper.getX1(input);
		h = CommandLineHelper.getY1(input);

		try {
			showCanvas();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sringernature.DrawerService#drawStraightLine(java.lang.String)
	 */
	@Override
	public void drawStraightLine(String input) {
		try {
			x1 = CommandLineHelper.getX1(input);
			y1 = CommandLineHelper.getY1(input);
			x2 = CommandLineHelper.getX2(input);
			y2 = CommandLineHelper.getY2(input);
			// showCanvas();

			// Decide if line is horizontal or vertical

			// line is horizontal
			if (x2 != x1 && y2 == y1) {
				drawHorizontalLine();
				// line is vertical
			} else if (x2 == x1 && y2 != y1) {

				drawVerticalLine();

			} else if (x1 == x2 && y1 == y2) {
				System.out.println("Coordinates cannot be the same!");
			} else {
				System.out.println("Currently only horizontal or vertical lines are supported.");
			}

		} catch (NumberFormatException e) {
			// TODO: handle exception
		} catch (Exception e) {

		}
	}

	/**
	 * 
	 */
	private void drawVerticalLine() {
		// upwards
		if (y2 < y1) {
			// TODO
			// downwards
		} else {
			// TODO
		}
	}

	/**
	 * 
	 */
	private void drawHorizontalLine() {
		// decide X direction of the line to be drawn
		if (x1 < w && x2 < w && y1 < h && y2 < h) {
			// from left to right
			if (x2 < x1 ) {
			
				int tempX1 = x2;
				int tempX2 = x1;
				x2 = tempX2 - 3;
				x1 = tempX1;
			}
			if (x2 < w - x1 & y2 < h - y1) {

				
			} else {
				System.out.println("Line out of canvas!");
			}
			// redraw x fragment of canvas
			drawXBorder(w);
			// start point
			drawYBorders(w, y1);
			System.out.print(yLine);
			for (int i = 1; i < x1; i++) {
				System.out.print(" ");
			}
			// draws horizontal pixels to end point
			for (int i = 0; i < x2 -2; i++) {
				System.out.print(pixel);
			}
			for (int i = x2 + 1; i < w - 3; i++) {
				System.out.print(" ");
			}
			System.out.println(yLine);
			drawYBorders(w, h - y2);
			// redraw x fragment of canvas
			drawXBorder(w);

		}else{
			System.out.println("Line out of canvas!");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sringernature.DrawerService#showCanvas()
	 */
	@Override
	public void showCanvas() {
		drawXBorder(w);
		drawYBorders(w, h);
		drawXBorder(w);
	}

	/**
	 * 
	 */
	@Override
	public void drawXBorder(int x) {
		for (int i = 0; i < x; i++) {
			System.out.printf(xLine);
		}
		System.out.println("");
	}

	@Override
	public void drawYBorders(int x, int y) {
		for (int i = 0; i < y; i++) {
			System.out.printf(yLine);
			for (int j = 0; j < x - 2; j++) {
				System.out.printf(" ");
			}
			System.out.printf(yLine);
			System.out.println("");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sringernature.DrawerService#drawColorfulCanvas(java.lang.String)
	 */
	@Override
	public void drawColorfulCanvas(String input2) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sringernature.DrawerService#paintCanvas(java.lang.String)
	 */
	@Override
	public void paintCanvas(String string) {
		// TODO Auto-generated method stub

	}

}
