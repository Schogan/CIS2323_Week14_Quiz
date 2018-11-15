import java.util.Scanner;
import java.io.*;

public class BadSubscriptCaught{
	public static void main(String[] args){
		String[] firstNames = new String[]{"Bob", "Tom", "Larry", "Moe", "Curly", "Shemp", "Matt", "David"};
		Scanner inputDevice = new Scanner(System.in);
		int choice = '0';
		boolean cont=true;
		while(cont){
			System.out.println("Please select a number from 1-8:");
			choice = inputDevice.nextInt();
			
			try {
			System.out.println("You have selected: " + firstNames[choice+1]);
			}catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("You have selected an invalid number");
			}
		}
		
		
		
	}
}