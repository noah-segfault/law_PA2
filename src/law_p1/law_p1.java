package law_p1;
import java.util.Scanner;

public class law_p1 {
	public static void main(String[] args)
	{
		int userNum;
		int userDecrypt;
		int pin1;
		int pin2;
		int pin3;
		int pin4;
		int temp;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a 4 digit number to encrypt:");
		userNum = scnr.nextInt();
		
		pin1 = userNum / 1000;
		pin2 = (userNum / 100) % 10;
		pin3 = (userNum / 10) % 10;
		pin4 = userNum % 10;
		
		pin1 = (pin1 + 7) % 10;
		pin2 = (pin2 + 7) % 10;
		pin3 = (pin3 + 7) % 10;
		pin4 = (pin4 + 7) % 10;
		
		System.out.println("Encrypted number: " + pin3 + pin4+ pin1 + pin2);
		System.out.println("Enter encrypted number for decryption:");
		userDecrypt = scnr.nextInt();
		
		pin1 = userDecrypt / 1000;
		pin2 = (userDecrypt / 100) % 10;
		pin3 = (userDecrypt / 10) % 10;
		pin4 = userDecrypt % 10;
		
		temp = pin1;
		pin1 = pin3;
		pin3 = temp;
		temp = pin2;
		pin2 = pin4;
		pin4 = temp;
		
		pin1 = (((pin1 - 7) % 10) + 10) % 10;
		pin2 = (((pin2 - 7) % 10) + 10) % 10;
		pin3 = (((pin3 - 7) % 10) + 10) % 10;
		pin4 = (((pin4 - 7) % 10) + 10) % 10;
		
		
		System.out.println("" + pin1 + pin2 + pin3 + pin4);	
		scnr.close();
	}
}
