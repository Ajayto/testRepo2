package variable;

public class ProgramOnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print smallest number from array
		
		int a[]= {10,50,20,5,7,11,2,12};
		int small=a[0];
		for(int eachElement:a) {
			if(eachElement<small) {
				small=eachElement;
			}
		}
		System.out.println("SmallNumber is "+small);

	}

}
