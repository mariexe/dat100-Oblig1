package dat100;
import java.util.Scanner;
import javax.swing.*;

public class B4 {
	public static void main(String[] args) {
	
		//Scanner leser vinduet nede(konsoll) og lytter etter bruker input 
		Scanner incomeInput= new Scanner(System.in); 
		int inputValue= incomeInput.nextInt();
		double output= calculateTax(inputValue);
	}
	
		//JFrame dialogBox= new JFrame("Calculated Tax");
		//JOptionPane.showMessageDialog(dialogBox,"your calculated tax is ");
		//}
	
	public static double calculateTax(int income) {
		int taxBracket1 = 164101; 
		int taxBracket2 = 230951;
		int taxBracket3 = 580651; 
		int taxBracket4 = 934051;
		double tax;
	
		//vi sjekker om income er mindre enn taxBracket
		if (income < taxBracket1){ 
			//da vil skatten bli 0
		tax = 0;
		}
		else if(income < taxBracket2 ) {
		tax = (income*0.0093);
		}
		else if(income < taxBracket3 ) {
		tax = (income*0.0241);
		}
		else if(income < taxBracket4 ) {
		tax = (income*0.1152);	
		}
		else {
			tax = (income*0.1452);	
		};
	System.out.println(tax);
	return tax;  
	} 
}
