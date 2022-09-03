package aula02;

public class Caneta {

	public String modelo;
	public String cor;
	public float ponta;
	protected int carga;
	private boolean tampada;
	//aula 03 sobre modificadores de acesso, foi declarado os atributos e métodos com os modificadores (public, 
	//protected e private).
	
	public void status() {
		System.out.println("-- Características de uma caneta -- Aula 02 (prática)");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tipo de ponta: " + this.ponta + "mm");
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar!");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
}
