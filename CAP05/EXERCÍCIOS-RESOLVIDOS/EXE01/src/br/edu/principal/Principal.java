package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int ano_atual, salario;
		double novo_salario, percentual;
		ano_atual = 2024;
		
		salario = 1000;
		percentual = 1.5/100;
		novo_salario = salario + percentual * salario;
		
		for(int i = 2007; i <= ano_atual; i++) {
			percentual = 2*percentual;
			novo_salario = novo_salario + percentual * novo_salario;
		}
		System.out.println(novo_salario);
	}
}
