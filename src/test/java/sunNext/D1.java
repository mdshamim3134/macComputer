package sunNext;

import org.testng.annotations.Test;

public class D1 implements I1,I2{
	static final String c="s";
	D1(String i){
		System.out.println("my name is"+i);
		
	}


	
	int a;
	@Test
	void A() {
		
		a=20;
		System.out.println(a);
	}
	@Test
	int B() {
		a=30;
		System.out.println(a);
		String a="120";
		String b="20";
	int i=	Integer.parseInt(a);
	int i1=	Integer.parseInt(b);
	System.out.println(i+i1);
	String myName="dddd";
	System.out.println(myName);
	int a1=30;
	return a1;
	
	}
	void P(String name) {
		System.out.println("my name is"+name);
		System.out.println(3);
		System.out.println("my name"+name);
		int p=9;
	}
	

}
