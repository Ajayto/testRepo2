package variable;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalRows=5;
		boolean flag=true;
		
		for(int row=1;row<=totalRows;row++) {
		  for(int sp=1;sp<=totalRows-row;sp++)	{
			  System.out.print(" ");
		  }
		  for(int st=1;st<=(2*row-1);st++) {
			  if(flag) {
			  System.out.print("*");
			 // flag=false;
			  }
			  else {
				  System.out.print("$");
				  //flag=true;
			  }
		  }
		  if(flag) {
			  flag=false;
		  }
		  else {
			  flag=true;
		  }
		  System.out.print("\n");
		}

	}

}
