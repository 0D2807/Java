package practice_00;

public class didamod {
	public static void main (String[] args) {
		
		int lineC = 9;
		int spaceC = lineC / 2;
		int starC = 1;
		
		for (int i= 0; i < lineC; i++) {
			for (int j = 0; j < spaceC; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < starC; k++) {
				System.out.print("*");
			}
			for (int j = 0; j < spaceC; j++) {
				System.out.print(" ");
			}
			
			if (i < lineC / 2) {
				spaceC -= 1;
				starC += 2;
			} else {
				spaceC += 1;
				starC -= 2;
			}
		System.out.println();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
