package collectionpractice;

import java.util.ArrayList;

public class MergeTwoArrayList {

	public static void main(String[] args) 
	{
		//
		ArrayList<String> al =new ArrayList<String>();
		al.add("Rohan");
		al.add("Gawade");

		ArrayList<String> al2 =new ArrayList<>();
		al2.add("ishwar");
		al2.add("utane");

		al.addAll(al2);
		System.out.println(al);  // r g i u 

		String [] array = new String [al.size()];
		Object[] newarray = al.toArray();
		for(int i =0; i<array.length; i++ )
		{
			System.out.println(newarray[i]);
		}

	}

}
