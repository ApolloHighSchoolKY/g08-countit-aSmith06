//� A+ Computer Science
// www.apluscompsci.com

//array delete example


public class ArrayCount
{
	/*
	 * countIt should return a count that
	 * states how many times val exists
	 * in the array iRay
	 */
	//Class level method
	public static int countIt( int[] iRay, int val )
	{
		int count=0;

		for(int i: iRay)
			if(i == val)
				count++;

		return count;
	}

	public static void printIt( int[] iRay  )
	{
		System.out.print("[");
		
		for(int i: iRay)
			System.out.print(i + " ");
		
		System.out.println("]");
	}

	public static void main(String[] args)
	{
		int[] nums = {7,7,1,7,8,7,4,3,7,9,8};

		printIt( nums );
		System.out.println("\ncount of 7s == " + countIt( nums, 7 ));
	}
}