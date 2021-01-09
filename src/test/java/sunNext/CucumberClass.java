package sunNext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class CucumberClass {
	int[]ann;
	String our="mousumee";
	public void A() {
		int ann=20;
		
		
		
	}
	@Test
	public void B() {
		D2 g=new D2();
		ann=g.ann;
		for(int i:ann) {
			//System.out.println("ann value one by one"+" "+i);
		}
		int size=ann.length;
		
		//System.out.println("ann array size"+" "+size);
		
		String[]bann= {"taka","dollar"};
		
	}
	@Test
	public void C() {
		List <Object>list=new ArrayList<Object>();
		list.add("dollar");
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.add(our);
		System.out.println(list);
		String []a= {"a","b","c"};
	List p=Arrays.asList(a);
	System.out.println(p);
	Object[] o=p.toArray();
	for(Object ob:o) {
		System.out.println("for sefath array"+ob);
		
	}
	
	
	
	
	}
		
	
	

}
