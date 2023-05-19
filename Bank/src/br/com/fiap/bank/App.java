package br.com.fiap.bank;

public class App{
	
	public static void main(String[] args) {
		Banco conta = new Banco("Juze", 3000, 10000, 0);
		Banco conta2 = new Banco("pedrao", 3000, 10000, 0);
		
		//teste id funcional
		System.out.println(conta2.getId());
		
		//teste error excedendo o saldo da conta
		//conta.saque(4000, "conta");
		
		//teste metodo saque
		conta.saque(100, "conta");
		System.out.println(conta.getSaldoContaCorrente());
		
		//teste metodo saque error numberNegativo
		//conta.saque(-59, "conta");
		
		//teste deposito
		conta.deposito(50);
		System.out.println(conta.getSaldoContaCorrente());
		
		//teste deposito error numberNegativo
		//conta.deposito(-50);
		
		//teste transferencia
		conta.transferencia(conta2, 50);
		System.out.println(conta2.getSaldoContaCorrente());
		
		//teste transferencia error mesma conta
		//conta.transferencia(conta, 50);
		
		//teste saque error poupanca
		//conta.saque(50, "poupança");
	}
}
