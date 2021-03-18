package demo;

public class FindTwoMaxValues {

	public static void main(String a[])
	{
		int arr[] = {8,2,5,15,7,4,1,9};
		
		int firstmax = 0;
		int secondmax = 0;
		firstmax=arr[0];
		secondmax=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			 if(firstmax < arr[i+1])
				{
				  	firstmax=arr[i+1];
				  	System.out.println(firstmax);
				}
		/*	 if(secondmax < firstmax && secondmax > arr[i+1])
			 {
				 secondmax=arr[i+1];
				 System.out.println(secondmax);
			 }
			*/
		}
		System.out.println("First max number is : " + firstmax);
		System.out.println("second max number is : " + secondmax);
	}
}
