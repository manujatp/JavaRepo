package JavaPrograms;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "Java programming is very interesting and easy to learn";
//length()
		System.out.println("Length of the string is : " + str.length());
//charAt((
		System.out.println("The value at 5 th location : " + str.charAt(5));

		System.out.println("Location of  \'s\' in the string : " + str.indexOf('s'));

		System.out.println("Location of second occuranace of \'s\' : " + str.indexOf('s', str.indexOf('s') + 1));

		System.out.println("Location of 3rd occurance of  \'s\' is : "
				+ str.indexOf('s', str.indexOf('s', str.indexOf('s') + 1) + 1));

		System.out.println(str.indexOf("very"));//20 position of start of "very"
		System.out.println(str.indexOf("vary"));//gives -1 if the word is not there then return -1
		
		String str1 = "Java programming is very interesting and easy to learn";
		System.out.println(str.equals(str1));//true
		
		System.out.println("Substring : "+str.substring(5, 12));
		//trim() space removes start and end spaces
		
		String s = "  hello  world  ";
		String s1 ="army";
		System.out.println("String is : "+ s + "after trim is : "+s.trim());
		
		//replaceAll()
		System.out.println("String is : "+ s + "after replace all space is : "+s.replaceAll(" ", ""));
		
		String date = "01-01-2017";
		System.out.println(date.replaceAll("-", "/"));
		
		//split()
		
		String test = "Hello_world_test_selenium";
		String testval[] = test.split("_");
		for (int i=0; i<testval.length;++i)
			System.out.println(testval[i]);
		
		//comparedTo() comparing uni code
		
		System.out.println(s.compareTo(s1));
		
		//concat()
		
		System.out.println(s1.concat(" People"));
		
		int a =100;
		int b =200;
		System.out.println(s+s1+a+b);//  hello  world  army100200
		System.out.println(a+b+s+s1);//300  hello  world  army
		System.out.println(s+s1+(a+b));//  hello  world  army300
		
		String str2 = "ae@io#b$u123";
		System.out.println("Characters are : "+ str2.replaceAll("[^a-zA-Z]", ""));
		
		System.out.println("Numbers are : "+ str2.replaceAll("[^0-9]", ""));
		System.out.println("Special characters are : "+ str2.replaceAll("[a-zA-Z0-9]", ""));
	}

}
