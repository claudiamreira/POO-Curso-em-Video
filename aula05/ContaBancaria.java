package aula05;

public class ContaBancaria {

	public int nmrConta;
	protected String tipo;
	private String titular;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("------------------------------");
		System.out.println("Conta: " + this.getNmrConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public ContaBancaria() {
		this.setSaldo(0); //this.saldo = 0; <- Dessa forma, está mexendo diretamente no atributo, o ideal é mexer utilizando métodos
		this.setStatus(false); //this.status = false;
	}

	public int getNmrConta() {
		return nmrConta;
	}
	
	public void setNmrConta(int nmrConta) {
		this.nmrConta = nmrConta;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	} 
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo); // Vai setar o tipo de conta. Conta corrente ou conta poupança
		this.setStatus(true); // e verificar se a conta está aberta
		if (tipo == "CC") { // Se o tipo da conta for Conta corrente, o titular inicia com 50,00 de saldo
			this.setSaldo(50); 
		} else if (tipo == "CP") { // Se o tipo da conta for Conta poupança, o titular inicia com 150,00 de saldo
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem dinheiro!");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois tem débito!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	public void depositar(float valor) {
		if(this.getStatus()) {
			this.setSaldo(getSaldo() + valor); //saldo = saldo + valor;
			System.out.println("Depósito realizado na conta de " + this.getTitular());
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}
	
	public void sacar(float valor) {
		if(this.getStatus()) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getTitular());
			} else {
				System.out.println("Saldo insuficiente para saque!");
			} 
		} else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensalidade() {
		int valor = 0;
		if(this.getTipo() == "CC") {
			valor = 12;
		} else if (this.getTipo() == "CP") {
			valor = 20;
		}
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga por " + this.getTitular());
		} else {
			System.out.println("Impossível pagar uma conta fechada!");
		}
	}
	
}
