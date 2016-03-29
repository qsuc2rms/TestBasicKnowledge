package runner;

public class MyJavaCodeBlockTester {

	static{
		int a=1;
		System.out.println(a+" the first static block will run first and only once ");
	}
	
	{
		int a=4;
		System.out.println(a+" the first normal block will run on each new instance ");
	}
	
	public static void main(String[] args){
		int a=3;
		System.out.println(a+" the main function block will run after all static functions ");
		
		System.out.println("=====then we will create multiple new instance====");
		
		MyJavaCodeBlockTester obj0=new MyJavaCodeBlockTester();
		
		System.out.println("=====as we see all static block will run only once====");
		
		MyJavaCodeBlockTester obj1=new MyJavaCodeBlockTester();
	}
	
	public MyJavaCodeBlockTester() {
		int a=100;
		System.out.println(a+" the construct block will run on each new instance but always as last one");
	}

	static{
		int a=2;
		System.out.println(a+" the second static block will run secondly and only once ");
	}
	
	{
		int a=5;
		System.out.println(a+" the second normal block will run on each new instance ");
	}
}
