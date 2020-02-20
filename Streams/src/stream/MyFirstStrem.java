package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFirstStrem {
	public static void main(String args[]) throws IOException {
		write();
		read();
	}
	
	private static void write() throws IOException {
		
		File f = new File("C:\\TEMP\\teste.txt");
		FileWriter fw = new FileWriter(f);
		
		fw.write("Hello");
		fw.close();
		
	}
	
	private static void read() throws IOException {
		File f = new File("C:\\TEMP\\teste.txt");
		FileReader fr = new FileReader(f);
		
		while (fr.read() != -1) {
			int c = fr.read();
			System.out.print((char) c);
		}
		fr.close();
	}

}
