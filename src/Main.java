
public class Main {

	public static void main(String[] args) {
		Cliente david = new Cliente();
		venilton.setNome("David");

		Conta cc = new ContaCorrente(david);
		Conta poupanca = new ContaPoupanca(david);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

