/**
 * 
 */
package com.sringernature.util;

/**
 * @author admin
 *
 */
public class CommandLineHelper {

	public static String getCommand(String input) {
		
		//return String.valueOf(input.charAt(0));
		return getCommandAsArray(input)[0];
	}
	
	public static String[] getCommandAsArray(String input){
		
		return input.split("\\s+");
	}

	public static int getX1(String input) {

		return Integer.parseInt(getCommandAsArray(input)[1]);
	}

	public static int getY1(String input) {
		// TODO Auto-generated method stub
		return Integer.parseInt(getCommandAsArray(input)[2]);
	}

	public static int getX2(String input) {
		return Integer.parseInt(getCommandAsArray(input)[3]);
	}

	public static int getY2(String input) {	
		return Integer.parseInt(getCommandAsArray(input)[4]);
	}

	
}
