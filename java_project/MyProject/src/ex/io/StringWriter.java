package ch02;

import java.io.*;

public class StringWriter {

	public StringWriter(FileWriter fileWriter) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
			
			System.out.println("���� ����");
			out.write("����� - �ȳ��ϼ���!");
			out.newLine();
			out.write("�ݰ����ϴ�.");
			out.newLine();
			out.write("2021.06.02");
			out.newLine();
			out.write("����� �ۼ�");
			
			out.close();
			
			System.out.println("�ۼ� �Ϸ�");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
