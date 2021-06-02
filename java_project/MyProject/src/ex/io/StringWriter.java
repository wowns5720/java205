package ch02;

import java.io.*;

public class StringWriter {

	public StringWriter(FileWriter fileWriter) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
			
			System.out.println("æ≤±‚ Ω√¿€");
			out.write("º’»ÔπŒ - æ»≥Á«œººø‰!");
			out.newLine();
			out.write("π›∞©Ω¿¥œ¥Ÿ.");
			out.newLine();
			out.write("2021.06.02");
			out.newLine();
			out.write("º’»ÔπŒ ¿€º∫");
			
			out.close();
			
			System.out.println("¿€º∫ øœ∑·");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
