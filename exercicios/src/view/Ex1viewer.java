package view;

import controller.Exercicio1;
import javax.swing.*;


public class Ex1viewer {
	public static void main(String[] args) {
		Exercicio1 ex1 = new Exercicio1();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número natural: "));
		int sum = ex1.sum(num);
		JOptionPane.showMessageDialog(null,"a soma dos números naturais até esse número é " + sum);
	}
}
