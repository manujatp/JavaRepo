package JavaPrograms;

public class SwapIntegers {
	
	public static void main(String args[]) {
	int x = 5;
	int y = 8;
	System.out.println("x = "+x+ " y = "+y);
//with temp variable
	int temp;
	temp = x;
	x = y;
	y = temp;
	System.out.println("x = "+x+ " y = "+y);
	
	
	//without temp variable
	//by addition;
	
	x += y;
	y = x - y;
	x = x - y;
	
	System.out.println("x = "+x+ " y = "+y);
	
	// using multiplication
	
	x *= y;
	y = x / y;
	x = x / y;
	
	System.out.println("x = "+x+ " y = "+y);
	
	//using xor: ^
	
	x = x ^ y;
	y = x ^ y;
	x = x ^ y;
	
	System.out.println("x = "+x+ " y = "+y);
	
	
	}	

}
