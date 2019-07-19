package JavaPrograms;

public class MissingNumber {

	public static void main(String[] args) {
		//if only positive values excluding 0 use total of all the numbers satrt  from a[0] to a[last] - sum of total numbers in array
		
		int a[] = {-1,0,1,3,4,5,7};
		int b[] = {-3,-1,0,1,2,4,5,6};
		int st = a[0];
		for(int i=1; i<a.length;++i) {
		if ((st+1)==a[i]) {
			st+=1;
		}
		else {
			System.out.println("Missing Numer is : "+ (st+1));
			st =a[i];
		}
		
		}
		
		for(int j =0;j<a.length-1;++j) {
			if (b[j]+1 != b[j+1])
				System.out.println("Missing number is : "+ (b[j]+1));
		}
	}

}
