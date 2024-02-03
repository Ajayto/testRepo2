package variable;

public class Variable {
	
	int c=50;  //instance variable
	
    static int s=60; //static variable 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();
		A.m3();
		
		
//		Variable obj1=new Variable();  ///
//		
//		obj1.m1();// call
//		obj1.m2();
		

	}
	
 static void m1() { //non static 
	  int b=30;	
	  int a=20;  /// local variable	
	  System.out.println(a);
	  //System.out.println("M1="+c);
	  System.out.println("M1S="+s);
	}
	
	void m2() {
		System.out.println("M2="+c);
		System.out.println("M2:S="+s);
	}

}


class  A{
	static void m3() {
		Variable v= new Variable();
		//System.out.println(c);
	}
}