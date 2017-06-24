package com.sringernature;

public final class Canvas {

	private final int x,y;
	private final String pixel = "x";
	private final String xLine = "-";
	private final String yLine = "|";
	
	public Canvas(int x, int y){
		this.x = x;
		this.y = y;
		showCanvas();
	}

	public void showCanvas(){
		xLine(this.x);
		yLines(this.x,this.y);
		xLine(this.x);
	}

	private void xLine(int x) {
		for (int i = 0; i < x; i++) {
			System.out.printf(xLine);
		}
		System.out.println("");
	}
	private void yLines(int x, int y) {
		for (int i = 0; i < y; i++) {
			System.out.printf(yLine);
			for (int j = 0; j < x - 2; j++) {
				System.out.printf(" ");
			}
			System.out.printf(yLine);
			System.out.println("");
		}
	}
}
