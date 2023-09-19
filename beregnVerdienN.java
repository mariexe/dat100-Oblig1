/*Lag et program som leser inn et heltall n > 0, 
 * beregner verdien n! (n fakultet) og skriver verdien til n! 
 * ut på skjermen, der n! = 1*2*3* … *(n-1)*n.
 */
package dat100;


import java.util.Scanner;

public class beregnVerdienN {
	
    public static long fakultetCal(long n) {
        long resultat= n;
        	 
             if  (n == 0 || n == 1) { 
                 resultat= 0;
             } 
           else if(n<0) {   	   
               	 System.out.println("Tallet må være positivt");
               	                }
           else {
                  resultat =n;              //n*(n-1)
                 for (long i = n; i > 1; i--) {  
                	 long nMinus = i - 1;
                	 resultat= resultat*nMinus;
           }
          }
             return resultat; 
         }
    

	 public static void main(String[] args) {
        
		 System.out.println("Skriv inn et positivt heltall: ");

		 
		 Scanner nCal = new Scanner(System.in); //scanner objekt er nCal 
         long fakultet = nCal.nextLong(); 
		

		 		 //dette er unntaket                             
         if (fakultet < 0) {
        	 System.out.println("Tallet må være positivt");  }

         
        	   else {
        		   long sum = fakultetCal(fakultet);
                   System.out.println(fakultet + "! = " + sum);
            
         }  
	 
         
         } //main
             }
                 
                
	 



 