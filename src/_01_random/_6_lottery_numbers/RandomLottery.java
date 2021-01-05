package _01_random._6_lottery_numbers;
import java.util.Random;

import javax.swing.JOptionPane;

public class RandomLottery {
	public static void main(String[] args) {
		Random Num1 = new Random();
		int RanNum1 = Num1.nextInt(7);
		int RanNum2 = Num1.nextInt(7);
		int RanNum3 = Num1.nextInt(7);
		int RanNum4 = Num1.nextInt(7);
		int RanNum5 = Num1.nextInt(7);
		int RanNum6 = Num1.nextInt(7);
		
		String List;
		List = RanNum1 + " " + RanNum2 + " " + RanNum3 + " " + RanNum4 + " " + RanNum5 + " " + RanNum6;
		
		JOptionPane.showMessageDialog(null, List);
		
}
}