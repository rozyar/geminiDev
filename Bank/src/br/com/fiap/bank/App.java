package br.com.fiap.bank;

public class App{
	
	public static void main(String[] args) {
		Banco conta = new Banco("Juze", 3000, 10000, 0);
		Banco conta2 = new Banco("pedrao", 3000, 10000, 0);
		
		//teste id funcional
		System.out.println(conta2.getId());
		
		conta.saque(4000, "conta");
	}
}
