package ishwar_practice_organisation;

import java.util.ArrayList;

public class ArrayListto_Array {

	public static void main(String[] args) 
	{
     ArrayList<Integer> al=new ArrayList<Integer>();
     al.add(20);
     al.add(30);
     al.add(40);
     al.add(12);
     
     al.toArray();
     for(int n:al)
     {
    	 System.out.println(n);
     }
     
	}

}
