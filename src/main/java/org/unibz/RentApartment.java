package org.unibz;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * From Rent is created class RentApartment. Method renting is providing available apartments for rent. in class RentApartment is used method renting for writing and reading in document apartments.txt.
 * In class RentApartment is used IOException, whenever an input or output operation is failed or interpreted.
 * Class RentApartment uses try-catch block for writing and reading in document apartments.txt. Catch was used to catch exceptions.
 * Covered topic: Exception, Try.catch block, File I/O
 * @author isidora.erakovic
 *
 */
public class RentApartment implements Rent {
	String[] lists = {"One Bedroom","Two Bedroom","Penthouse"};
	int postal;
	String name;
	public void renting() {
		System.out.print("Apartments different sizes are available for rent");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("apartments.txt"));
			for (String list:lists) {
				writer.write("\n"+list);
			}
			writer.write("\nApartment 1 bedroom 76m ^2");
			writer.write("\nApartment 2 bedroom 105 m^2");
			writer.write("\nPenthouse 210 m^2");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			BufferedReader reader = new BufferedReader(new FileReader("apartments.txt"));
			String line;
			while((line=reader.readLine())!=null) {
			System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
