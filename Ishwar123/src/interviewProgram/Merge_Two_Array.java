package interviewProgram;

public class Merge_Two_Array {

	public static void main(String[] args) 
	{
		int []a= {5,6,7,8,9};
		int []b= {10,11,12};
		int sum=0;
		int []c=new int	[a.length+b.length];
		int k=0;
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
		
		}
		for(int j=a.length; j<c.length; j++)
		{
			c[j]=b[k];
			 k++;
		}
		for( int m:c)
		{
			System.out.print(m+" ");
		}
			
		
	}

}
