package interviewProgram;

public class CountPatternFromString {

	public static void main(String[] args)
	{
		String s ="abcdefabcdefxyzdef";
		
		String arr[]= new String[s.length()-2];
		
		String pattern="abc";
		String s1="";
		
		int count=0;
		int end = 3;
		
		for(int start=0; end<s.length(); start++)
		{
			s1=s.substring(start, end);
			arr[start]=s1;
			if(s1.equals(pattern))
			{
			   count++;
			}
			end++;
		}
		System.out.println(count);  // 
		for(String a:arr)
		{
			System.out.print(a+" ");
		}
	}

}
