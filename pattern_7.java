package pattern;

public class pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 4;
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 5; j++) {
				if (cnt <= 4)
					System.out.println("");
				else
					System.out.println("*");
			}
			
			System.out.println("");
			if(i<5)
				cnt--;
			else
				cnt++;
		}
	}

}
