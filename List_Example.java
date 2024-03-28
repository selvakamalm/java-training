import java.util.*;

public class List_Example {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = s.nextInt();
		System.out.println("Enter the name instead of the number which divide by 3 :");
		String b=s.next();
		System.out.println("Enter the name instead of the number which divide by 5 :");
		String c=s.next();
		System.out.println("Enter the name instead of the number which divide by both 3&5 :");
		String d=s.next();
		String arr[]=new String[a];
		List<String>e = new ArrayList<String>();
		for (int i = 1; i <= a; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				//System.out.println("RamRadhe");
			    arr[i-1]=(d);
			    e.add(d);
			} else if (i % 3 == 0) {
			    arr[i-1]=(b);
			    e.add(b);
			} else if (i % 5 == 0) {
				arr[i-1]=(c);
				e.add(c);

			} else {
				arr[i]=String.valueOf(i);
				e.add(arr[i]);
			} 
		}
		System.out.print(e);
		
		}
		
		
		
	}
		
		
	
	
		
	


															
	


