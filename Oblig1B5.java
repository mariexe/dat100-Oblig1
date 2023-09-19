/*a) Lag et program som leser inn en poengsum (heltall) 
som en student har oppnådd på en prøve, 
og finn og skriv ut den karakteren A-F dette tilsvarer.
*/


//import java.util.Scanner;
package dat100;

public class Oblig1B5{
public static void main(String[] args) {
	//scanneren ble brukt i testing av calculateGrade metoden
	//Scanner gradeInput= new Scanner(System.in); 
	//int inputValue= gradeInput.nextInt();
    setGrades(); 
}

 public static String calculateGrade(int grade) {
	 
	 String response = "uninitialized";
	 
	 int F = 39;
	 int E = 49;
	 int D = 59;
	 int C = 79;
	 int B = 89;
	 int A = 100;
	 
	 //skriv ut feilmelding ved ugyldig poengsum(neg verdi el. over hundre)
		
	 if (grade <0 || grade >100) {
		 response = "error";
	 }
	 
	 //ellers retuneres karakteren
	else if (grade <=F) {
		 response = "F";
				 }
	 else if (grade <=E) {
		 response = "E";
	 }
	 else if (grade <=D) {
		 response = "D";
	 }
	 else if (grade <=C) {
		 response = "C";
	 }
	 else if (grade <=B) {
		 response = "B";
	 }
	 else if (grade <=A) {
		 response = "A";
	 }	
	 
	

	 System.out.println(response);
	 return response;
	}
 
        public static void setGrades() {
    		int[] grades = {40,50,60,30,45,77,90,99,100,2};
    		
    		//løkken begynner på posisjon 0 i arrayet
    		for (int i=0; grades.length>i; i++) {
    	    calculateGrade(grades[i]);
    		}
        }

 
	 }
 

