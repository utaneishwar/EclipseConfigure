package ishwar_practice_organisation;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromStringChar {

	public static void main(String[] args)
	{
		String s= "MaManamadnmad"; 
		
		LinkedHashSet<Character> cha = new LinkedHashSet<Character>(); 
		for(int i=0; i<s.length(); i++)
		{
			if(!(cha.contains(s.charAt(i))))
			{
			cha.add(s.charAt(i));	
			}
			
		}
		   System.out.println(cha);
		
		

	}

}
