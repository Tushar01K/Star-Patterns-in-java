package pattern;

public class pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=9;
		int cnt=0;
			
			for(int i=1;i<=5;i++) {
				
				for(int j=1;j<=end;j++) {
				
					if(j<=cnt)
					{
						
					System.out.print("  ");}
					else
						System.out.print("*");
					}
					System.out.println();
					if(i<5) {
						
					end--;
					cnt++;
					}
					else {
						
						end++;
						cnt--;
					}
					
			}}
	}


