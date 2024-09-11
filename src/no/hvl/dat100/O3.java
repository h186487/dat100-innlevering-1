package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		
		int fact = 1;
		int n = 0;
		
//		Check if input is valid
		while (true) {
			
//		Input a value of n from user using JOptionPane
			String input = JOptionPane.showInputDialog("Enter an integer n");
			
//		Parse input n into an integer
			n = Integer.parseInt(input);
			
			if (n > 0) { 
				break; //break from while loop if input is valid
				
			} else {
				JOptionPane.showMessageDialog(null, "Please enter a whole number greater than 0", "Error", JOptionPane.ERROR_MESSAGE);
			}
				
		}
//		Use for loop to calculate factorial
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		
		JOptionPane.showMessageDialog(null, "The value of " + n + "! = " + fact, "Factorial result of n", JOptionPane.INFORMATION_MESSAGE);
	}
}