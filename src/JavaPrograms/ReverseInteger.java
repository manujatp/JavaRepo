package JavaPrograms;

public class ReverseInteger {

	public static void main(String[] args) {


		int a=12340;
		int sum =0;
		while(a>0) {
			sum = a%10;
			System.out.print(sum);
			a/=10;
		}
		
		 int num = 3423456;
		 System.out.println("\n"+new StringBuffer(String.valueOf(num)).reverse());
		


	}

}
