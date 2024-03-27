package pattern;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int hashend=4;
		int starend=1;
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=hashend;j++) {
				
				System.out.print("#");
			}
			for(int j=1;j<=starend;j++) {
				
				System.out.print("*");
			}
			
			System.out.println("");
			hashend--;
			starend++;
		}
	}

}
