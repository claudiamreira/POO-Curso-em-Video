package exemplo;

public class Notebook {
	
	String cor;
	String fabricante;
	String modelo;
	String tipo;
	int tamanho;
	boolean ligado;
	
	void status() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Está ligado? " + this.ligado);
	}
	
	void ligar() {
		this.ligado = true;
	}
	
	void desligar() {
		this.ligado = false;
	}
	
	void conectar() {
		if(this.ligado == true) {
			System.out.println("Conectado à rede!");
		} else {
			System.out.println("Erro ao se conectar!");
		}
	}
	
	void digitar() {
		if(this.ligado == true) {
			System.out.println("Digitando!!!!");
		} else {
			System.out.println("ERRO! Não posso digitar!");
		}
	}
}
