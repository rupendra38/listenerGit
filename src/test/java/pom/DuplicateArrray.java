package pom;

import java.util.Iterator;

public class DuplicateArrray {
	
	public static void cal(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					
					System.out.println(a[i]);
				}
				
			}
			
			
		}
		
		
		
	}
public static void main(String[] args) {
	
	int arr[]= {1,3,5,4,6,2,1,5,4};
	
	cal(arr);
	
}
}
