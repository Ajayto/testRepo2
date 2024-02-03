package variable;

public class SwitchCaseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int key=3;
		int key2=4;
		int a=20; 
		int b=30;
		int c=0;
		switch (key2) {
		case 1: {
			c=a+b;
			System.out.println("addition="+c);	
			break;
		}
		
		case 2: {
			c=a-b;
			System.out.println("sub="+c);	
			break;
		}
		
		case 3: {
			c=a*b;
			System.out.println("multi="+c);
			break;
		}
		
		case 4: {
			c=a/b;
			System.out.println("div"+c);
			break;
		}
		
		
		default:
			System.out.println("Enter valid option between 1 to 4");
		}

	}

}
