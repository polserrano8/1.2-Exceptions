package s1_2_Exceptions_Niv2_Ex1;


public class Main {

	public static void main(String[] args) {
		System.out.println(Entrance.readByte("Can you give me a real number?"));
		System.out.println(Entrance.readFloat("Can you give me the weight of sand in the flask?.")); 
		System.out.println(Entrance.readInt("Can you write your Age?"));
		System.out.println(Entrance.readDouble("Can you give me your weight?"));
		Entrance.closingScanner();
		

	}

}
