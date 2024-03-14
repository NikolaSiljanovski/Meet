import java.util.Scanner;

public class Meeting {

	public static void main(String[] args) {
		
		
		int prv = 0 ,vtor = 0,tret = 0;
		
		int casI,minI;
		int casM,minM;
		int casD,minD;
		int razlika1,razlika2;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Vremeto na pristignuvanje na Igor(cas) : ");
		casI = input.nextInt();
		System.out.println("Vremeto na pristignuvanje na Igor(min) : ");
		minI = input.nextInt();
		
		int vremeI = casI*60+minI;
		
		
		System.out.println("Vremeto na pristignuvanje na Mladen(cas) : ");
		casM = input.nextInt();
		System.out.println("Vremeto na pristignuvanje na Mladen(min) : ");
		minM=input.nextInt();
		
		int vremeM=casM*60+minM;
		
		
		System.out.println("Vremeto na pristignuvanje na Dragan(cas) : ");
		casD = input.nextInt();
		System.out.println("Vremeto na pristignuvanje na dragan(min) : ");
		minD = input.nextInt();
		
		int vremeD=casD*60+minD;
		
		
		if (vremeI < vremeM && vremeI < vremeD) {
			System.out.print("Igor stignal prv");
			
			prv = vremeI;
		vtor=Math.min(vremeD, vremeM) ;
		tret=Math.max(vremeD, vremeM) ;
					
			
		} else if (vremeM < vremeI && vremeM < vremeD) {
			System.out.print("Mladen stignal prv");
			 prv = vremeM;	
		vtor = Math.min(vremeI, vremeD);
		tret = Math.max(vremeI, vremeD);
		
		} else if (vremeD < vremeI && vremeD < vremeM ) {
			
			prv = vremeD;
		vtor = Math.min(vremeI, vremeM);
		tret = Math.max(vremeI, vremeM);
			
		System.out.print("Dragan stignal prv, ");
			
		}
		
		  razlika1 = vtor-prv;
		  razlika2 = tret-vtor;
	        
	        if (razlika1 <= 10 && razlika2 <= 5) {
	            System.out.println("Se sretnale. :) ");
	        } else {
	            System.out.println("Ne se sretnale. :( ");
	        }
	        
	        
	        
	        
	    }
	}
		
	
		
		
		
		
		
		
		
		
		



