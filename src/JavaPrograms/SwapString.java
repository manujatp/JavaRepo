package JavaPrograms;

public class SwapString {

	public static void main(String[] args) {
		
		//swap strings without using temp variable
		
		String s1 = "Hello";
		String s2 = "World";
		
		System.out.println("Before swapping : ");
		System.out.println("String s1 : "+s1+" s2 : "+s2);
		
		s1 = s1.concat(s2);//s1 = s1 + s2;
		s2 = s1.substring(0,s1.indexOf(s2));//s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swapping : ");
		System.out.println("String s1 : "+s1+" s2 : "+s2);
		
		//replace not work if word is Helloworld and world
		s1 = s1 + s2;
		s2 = s1.replaceAll(s2, "");
		s1 = s1.replaceAll(s2, "");
		System.out.println("String s1 : "+s1+" s2 : "+s2);
		
		String s3 = "HelloWorld";
		String s4 = "World";
		System.out.println("Before swapping : ");
		System.out.println("String s3 : "+s3+" s4 : "+s4);
		
		s3 = s3 + s4;
		s4 = s3.replaceFirst(s2, "");
		s3 = s3.replaceAll(s4, "");
		
		System.out.println("After swapping : ");
		System.out.println("String s3 : "+s3+" s4 : "+s4);
	}

}
