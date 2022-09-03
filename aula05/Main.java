package aula05;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria p1 = new ContaBancaria();
		p1.setNmrConta(1117);
		p1.setTitular("Claudia");
		p1.abrirConta("CC");
		
		ContaBancaria p2 = new ContaBancaria();
		p2.setNmrConta(2228);
		p2.setTitular("Vitória");
		p2.abrirConta("CP");
		
		p1.depositar(300);
		p2.depositar(500);
		p2.sacar(100);
		
		p1.estadoAtual();
		p2.estadoAtual();

	}

}
