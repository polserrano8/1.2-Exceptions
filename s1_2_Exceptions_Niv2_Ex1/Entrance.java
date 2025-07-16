package s1_2_Exceptions_Niv2_Ex1;

import java.util.Scanner;
import java.util.InputMismatchException;



public class Entrance {
	private static Scanner scc;
	public Entrance () {};
	
	private static Scanner scannerMethod(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		Entrance.scc = sc;
		return sc;	
	}
	
	public static byte readByte(String message) {
		
		Scanner messageReceived = scannerMethod(message);
		byte messageTranscribed = 0;
		try{
			messageTranscribed = messageReceived.nextByte();
			return messageTranscribed;
		}catch(InputMismatchException e) {
			System.out.println("Incorrect format. Could you try again with the correct format, please?");
			Entrance.readByte(message);
		}
		
		return messageTranscribed;
		
	}
	
	public static int readInt(String message) {
	
		Scanner messageReceived = scannerMethod(message);
		int messageTranscribed = 0;
		try{
			messageTranscribed = messageReceived.nextInt();
			return messageTranscribed;
		}catch(InputMismatchException e) {
			System.out.println("Incorrect format. Could you try again with the correct format, please?");
			Entrance.readInt(message);
		}
		
		return messageTranscribed;
		
	}
	public static float readFloat(String message) {
		
		Scanner messageReceived = scannerMethod(message);
		float messageTranscribed =0;
		try{
			messageTranscribed = messageReceived.nextFloat();
			return messageTranscribed;
		}catch(InputMismatchException e) {
			System.out.println("Incorrect format. Could you try again with the correct format, please?");
			Entrance.readFloat(message);
		}
		
		return messageTranscribed;
		
	}
	public static double readDouble(String message) {
		
		
		Scanner messageReceived = scannerMethod(message);
		double messageTranscribed = 0;
		try{
			messageTranscribed =  messageReceived.nextDouble();
			return messageTranscribed;
		}catch(InputMismatchException e) {
			System.out.println("Incorrect format. Could you try again with the correct format, please?");
			Entrance.readFloat(message);
		}
		
		return messageTranscribed;
		
	}
	public static void closingScanner(){
		scc.close();
	}

}
