package variable;

public class ArrayProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,50,20,5,7,80,2,12};
		int largest=a[0];
		for(int eachElement:a) {
			if(eachElement>largest) {
				largest=eachElement;
			}		
		}
		System.out.println(largest);
	}
}
