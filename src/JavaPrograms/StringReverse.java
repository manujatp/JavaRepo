package JavaPrograms;

public class StringReverse {

	public static void main(String[] args) {

		String S = "Selenium";

		//System.out.println(S.reverse());// no reverse function in String, String is immutable 
		System.out.println(S);

		//with for loop
		int len = S.length();
		String rev = "";
		for(int i=len-1; i>=0; --i) 
			rev += S.charAt(i);

		System.out.println(rev);	

		//using StringBuffer

		StringBuffer sb = new StringBuffer(S);//StringBuffer is mutable
		System.out.println(sb.reverse());

	}

}
