package Example1;

public class PrintAlternateNumber {
	
	static void printAlter(int[] arr, int N)
	{
	     
	    // Print elements
	    // at odd positions
	    for(int i = 0;
	            i < N;
	            i++)
	    {
	         
	        // If currIndex stores even index
	        // or odd position
	        if (i % 2 == 0)
	        {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
	 
	// Driver Code
	public static  void  main(int[] args)
	{
	    int[] arr = { 1, 3, 6, 9, 5 };
	    int N = arr.length;
	     
	    printAlter(arr, N);
	}
	}

	