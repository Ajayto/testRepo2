package variable;

public class ControlFlowStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		int b=80;
		int c=60;
		if(a>b && a>c) {//true	
		System.out.println("A is big number");
		}
		else if(b>a && b>c){//false
		System.out.println("B is big number");	
		}
		else {
			System.out.println("C is big number");
		}
	}

}
