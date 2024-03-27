package pattern;

public class pattern_20 {

	public static void main(String[] args) {
		int end=5;
		int start=6;
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=10;j++) {
				
				if(j<=end || j>=start)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
			if(i<5) {
				
				end--;
				start++;
			}
			else
			{
				
				end++;
				start--;
			}
			
			
		}

	}

}
