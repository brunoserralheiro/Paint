/**
 * 
 */
package com.sringernature;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

import org.hamcrest.core.SubstringMatcher;

import com.sringernature.model.DrawerService;
import com.sringernature.model.DrawerServiceImpl;
import com.sringernature.util.CommandLineHelper;

/**
 * @author admin
 *
 */
public class CommandLine {

	private static Scanner in;
	private String input = "";
	private DrawerService drawerServiceImpl;

	public CommandLine() {
		prompt();
	}

	private void prompt() {

		System.out.println("Enter the following commands:");
		System.out.println(" C w h           =>Should create a new canvas of width w and height h. i.e. C 10 20");
		System.out.println(" L x1 y1 x2 y2   =>Should create a new line from (x1,y1) to (x2,y2). Only horizontal or vertical lines are supported. \n");
		System.out.println(" R x1 y1 x2 y2   =>to choose a color, create a colorful canvas, and exit.");
		System.out.println(" B x y c         => Should fill the entire area connected to (x,y) with colour 'c' .\n");
		drawerServiceImpl = new DrawerServiceImpl(getInput());
		while (!getInput().trim().equalsIgnoreCase("Q")) {
			System.out.printf("Enter command:");
			setInput(scanInput());
//			String array[] = CommandLineHelper.getCommandAsArray(getInput());
//			for (int i = 0; i < array.length; i++) {
//				System.out.println(array[i]);
//			}
			if (getInput().length() > 0) {
				String command = CommandLineHelper.getCommand(getInput());
				switch (command) {
					case "C":
					case "c":
						drawerServiceImpl.drawCanvas(getInput());
						break;
					case "L":
					case "l":	
						drawerServiceImpl.drawStraightLine(getInput());
						break;
					case "R":
					case "r":	
						drawerServiceImpl = new DrawerServiceImpl();
						drawerServiceImpl.drawColorfulCanvas(getInput());
						break;
					case "B":
					case "b":
						drawerServiceImpl.paintCanvas(getInput());
					default:
						break;


			}
				
		}
		}
		System.out.println("EXIT APPLICATION");
			
	}

	public static String scanInput() {
		in = new Scanner(System.in);
		System.out.println(" ");
		return in.nextLine();
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
}
