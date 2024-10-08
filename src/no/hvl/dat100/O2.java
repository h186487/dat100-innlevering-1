package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2 {

	public static void main(String[] args) {
		
//		Loop through 10 students
		for (int i = 0; i < 10; i++) {
//			Define student number as variable
			int studentNumber = i + 1;
			
			int score;
			
			while (true) {
//				Get input from user
				String input = JOptionPane.showInputDialog("Enter the score for student " + studentNumber + ":");
				
				score = Integer.parseInt(input);
				
//				Check if input is valid
				if (score >= 0 && score <= 100) {
					break; //Exit for loop if input is valid
//				Show an error message dialog box if input is invalid
				} else { 
					JOptionPane.showMessageDialog(null, "Invalid score entered. Please enter a score between 0 and 100.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
//			Determine grade scores which determines grades	
			String grade = "";
				
			if (score >= 90 && score <=100) grade = "A";
						
			if (score >=80 && score <= 89) grade = "B";
				
			if (score >=60 && score <= 79) grade = "C";
				
			if (score >=50 && score <=59) grade = "D";
				
			if (score >=40 && score <=49) grade = "E";
				
			if (grade.isEmpty()) grade = "F";
				
//			Print student number with their entered score and corresponding grade	
			JOptionPane.showMessageDialog(null, "Student " + studentNumber + ": Score = " + score + ", Grade = " + grade, "Grade", JOptionPane.INFORMATION_MESSAGE);
				
		}		
	}
}