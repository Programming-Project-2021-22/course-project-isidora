package org.unibz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Agreement {
 public void agree() {
	 
	 String[] clients = {"Find your ideal real estate", "If you need a secure business partner, you can knock on our door."};
	 try {
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		
		writer.write("OUR PROPERTIES");
		
		for (String client:clients) {
			writer.write("\n"+ client);
		}
		
		writer.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	 try {
		BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
		String line;
		// find file output.txt with right click Show in System Explorer and go back to Project Java
		while((line=reader.readLine()) !=null)
	System.out.println(line);
	reader.close();
	 } catch (IOException e) {
		e.printStackTrace();
	}
 }
 
 
}
