package JavaPrograms;

public class LargestSmallest {

	public static void main(String[] args) {
	
		int a[] = {34,12,56,24,64,31};
		int larg = a[0];
		int small = a[0];
		int len = a.length;
		
		//Time complexity is On
		for(int i=1; i<len-1; ++i)
				if(a[i]>larg) {
					larg = a[i];
				}
				else if (a[i]<small) {
					small = a[i];
				}
		
		System.out.println("Largest number in the array is : "+larg + "\nSmallest number in the array is : "+small);
		
	}

}
