package ishwar_practice_organisation;

import java.util.Arrays;

public class SwapMinMaxPosition {

	public static void main(String[] args)
	{
		int a []= {0,12,36,9,1,10};	  // 6


		int max=0;
		int min=0;

		int index=0;
		int index1=0;
		int temp=0;

		for(int i=0; i<a.length; i++)
		{
			if(max<=a[i])
			{
				max=a[i];
				index=i;
			}
			if(min>=a[i])
			{
				min=a[i];
				index1=i;
			}
		}
		temp=a[index];
		a[index]=a[index1];
		a[index1]=temp;

		for(int c:a)
		{
			System.out.print(" "+c);
		}
	}


}
