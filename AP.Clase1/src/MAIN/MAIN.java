package MAIN;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PUNTO A
		
				int a = 3;
				int b = 11;
				int acu = 0;
				int s = 0;
				int s2 = 0;
				int acu2 = 0;
				int acu3 = 0;
				while	(b > s) {
					s = a + acu;
					System.out.println(s);
					acu++;
			 }
			 //PUNTO B y C
				
					int im = 0;
					boolean par = true;
					if (par) {
						while	(b > s2) {
							s2 = a + acu2;
							if (s2%2 == 0) {
							System.out.println(s2);
							}
							acu2++;
						
					}
						
			 } else {	
				 
				 while	(b > im) {
						im = a + acu3;
						if (im%2 != 0) {	
						System.out.println(im);		
						}		
						acu3++;
			 }
			 }
				
				//PUNTO D
					
				for (int x = 11; a < x ; x--) {	
					if (x%2 == 0) {
					System.out.println(x);
					
					}	
				}
	}

}
