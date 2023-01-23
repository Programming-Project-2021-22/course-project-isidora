package org.unibz;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Income  {
public static double incomes() {
Scanner sc=new Scanner(System.in);
 System.out.println("Enter your income");
  double tax=0,a;
	a=sc.nextDouble(); 
	if(a<=200000)
		tax=0;
	else if(a<=300000)
		tax= 0.1*(a-200000);
	else if(a<=500000)
		tax=(0.2*(a-300000))+(0.1*100000);
	else if(a<=1000000)
		tax=(0.3*(a-500000))+(0.2*200000)+(0.1*100000);
	else
		tax=(0.4*(a-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
	
	 String tax1 = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(tax);
     System.out.println("Income tax amount is : " + tax1);
     return tax;
		}
	
	 public void promptEnterKey(){
		   System.out.println("Press \"ENTER\" to find out more about us");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();		
		   scanner.close();
		}

}

