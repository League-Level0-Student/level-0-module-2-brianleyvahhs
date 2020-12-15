//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();
		int randomNumber = randomMaker.nextInt(7);

		// 1. Use each value of randomNumber to give the user a random compliment.
		// 2. Repeat all the code above 10 times
	    for (int i=0; i<10; i++) {
			if (randomNumber  == 1) {JOptionPane.showMessageDialog(null, "1");}
			else if (randomNumber == 2) {JOptionPane.showMessageDialog(null, "2");}
			else if (randomNumber == 3) {JOptionPane.showMessageDialog(null, "3");}
			else if (randomNumber == 4) {JOptionPane.showMessageDialog(null, "4");}
			else if (randomNumber == 5) {JOptionPane.showMessageDialog(null, "5");}
			else if (randomNumber == 6) {JOptionPane.showMessageDialog(null, "6");}
			else if (randomNumber == 7) {JOptionPane.showMessageDialog(null, "7");}
			else if (randomNumber == 8) {JOptionPane.showMessageDialog(null, "8");}
			else if (randomNumber == 9) {JOptionPane.showMessageDialog(null, "9");}
			else if (randomNumber == 10) {JOptionPane.showMessageDialog(null, "10");}
	    }
		// 3. Find someone to test out your program. They will like it :)
	}
}
