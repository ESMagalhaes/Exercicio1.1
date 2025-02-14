package controller;

public class exercicio1 {
	public exercicio1() {
		super();
	}
	
	public int sum(int num) {
		//Condição de Parada (se o número for menor que ou 0)
		if (num < 0) {
			return 0;
		}
		else {
			 // 
			return num + sum(num - 1 /*(ir decrescendo até o valor alcançar  a Condição de Parada.*/);
		}
	}
}

