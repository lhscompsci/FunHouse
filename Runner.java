//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class Runner
{
	public static void main( String args[] )
	{
		int[] one = {1,2,3,4,5,6,7,8,9,10};
		int[] two = {1,2,3,9,11,20,30};
		int[] three = {9,8,7,6,5,4,3,2,1-1,-2};
		int[] four = {3,6,9,12,9,6,3};
		
	
		System.out.println(Arrays.toString(one));
		System.out.println("is going Up ?  " + ArrayFunHouse.goingUp(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Up ?  " + ArrayFunHouse.goingUp(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Up ?  " + ArrayFunHouse.goingUp(three));			
		System.out.println(Arrays.toString(four));
		System.out.println("is going Up ?  " + ArrayFunHouse.goingUp(four));
		
		System.out.println("\n\n"+Arrays.toString(one));
		System.out.println("is going Down ?  " + ArrayFunHouse.goingDown(one));
		System.out.println(Arrays.toString(two));
		System.out.println("is going Down ?  " + ArrayFunHouse.goingDown(two));
		System.out.println(Arrays.toString(three));
		System.out.println("is going Down ?  " + ArrayFunHouse.goingDown(three));			
		System.out.println(Arrays.toString(four));
		System.out.println("is going Down ?  " + ArrayFunHouse.goingDown(four));		
	}
}