package interviewProgram;

public class VotingProgram 
{

	public static void VoteRight(int age)
	{
		if(age>=18)
		{
			System.out.println(" go for vote");
		}
		else
		{
			System.out.println("you have  not right for vote");
		}
	}
	public static void main(String[] args) 
	{
		VoteRight(17);
		
	}

}
