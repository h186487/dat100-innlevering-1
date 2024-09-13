package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O1 {

	public static void main(String[] args) {
		
//		Input gross income from user using JOptionPane
		String input = JOptionPane.showInputDialog("Enter your gross income");
//		Parse the input string into an integer
		int grossIncome = Integer.parseInt(input);
		
//		Initialize sumTax to 0.0 as a starting point before calculating total tax
		
		double sumTax = 0.0;
//		"""Calculate tax for each bracket"""
		if (grossIncome > 208050) {
			//Bracket A: income between 208,051 - 292,850 with a 1,7% tax
			sumTax += (Math.min(grossIncome, 292850) - 208050) * 0.017;
		}
		
		if (grossIncome > 292850) {
			//Bracket B: income between 292,851 - 670,000 with a 4,0% tax
			sumTax += (Math.min(grossIncome,  670000) - 292850) * 0.04; 
		}
		
		if (grossIncome > 670000) {
			//Bracket C: income between 670,001 - 937,900 with a 13,6% tax
			sumTax += (Math.min(grossIncome,  937900) - 670000) * 0.136;
		}
		
		if (grossIncome > 937900) {
			//Bracket D: income between 937,901 - 1,350,000 with a 16,6% tax
			sumTax += (Math.min(grossIncome, 1350000) - 937900) * 0.166;
		}
		
		if (grossIncome > 1350000) {
			// Bracket E: income above 1,350,001 with a 17;6% tax
			sumTax += (grossIncome - 1350000) * 0.176;
		}

//		Store variable sumTax as a string to be formatted with two decimals
		String message = String.format("%.2f", sumTax);
		
//		Display total taxes from input using JOptionPane
		JOptionPane.showMessageDialog(null, "you will pay NOK " + message + " in taxes", "Tax calculation", JOptionPane.INFORMATION_MESSAGE);
	}
}
