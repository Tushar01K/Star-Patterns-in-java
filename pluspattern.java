package pattern;

public class pluspattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				
				if(j==3 || i==3)
					System.out.print("*");
				else
					System.out.print("O");
				
			}
			System.out.println();
			
		}

	}

}
