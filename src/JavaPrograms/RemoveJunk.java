package JavaPrograms;

public class RemoveJunk {
	
	public static void main(String arg[]) {
		
		//Regular expression [^a-zA-Z0-9]
		
		String s = "231#$%^#^# kdfafdaf $#%^#$123434";
		System.out.println(s);
		s= s.replaceAll("[^a-zA-Z0-9]", "");//assigning new value to s
		System.out.println(s);//231kdfafdaf123434
		
		String s1 = "hello #$$% world 12344";
		System.out.println(s1);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9\\s]", "");//excluding space
		System.out.println(s1);//hello  world 12344
	}

}
