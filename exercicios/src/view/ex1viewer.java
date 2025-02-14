package view;

import controller.exercicio1;
import javax.swing.*;


public class ex1viewer {
	public static void main(String[] args) {
		exercicio1 ex1 = new exercicio1();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número natural: "));
		//int soma = 0;
		int sum = ex1.sum(num);
		JOptionPane.showMessageDialog(null,"a soma dos números naturais até esse número é " + sum);
	}
}
