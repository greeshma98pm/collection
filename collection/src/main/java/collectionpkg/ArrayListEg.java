package collectionpkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		
		ArrayList ar=new ArrayList();
		
		System.out.println(ar.size());
		
		
		ar.add("Hello");   // string
		ar.add(false);     //boolean
		ar.add(1);         //Integer
		ar.add(1.2);       //Double
		
		ar.add(1, "world");
		
		ArrayList ar2=new ArrayList();
		ar2.add(10);
		ar2.add(20);
		
		ar.addAll(ar2);
		ar.addAll(2, ar2);
		
		
		ar.remove(0);
		ar.remove("world");
		
		System.out.println(ar.isEmpty());
		
		System.out.println(ar.contains("Hello"));
		
		System.out.println(ar.get(3));
		
		System.out.println(ar.set(2, true));
		
		ar.clear();
		
		
		System.out.println(ar);
		System.out.println(ar.size());
		
		
		
		
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//iterator
		
		       //List ar1= new ArrayList();
		
		Iterator it=ar.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		
		
		
	}

}
