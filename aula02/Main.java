package aula02;

public class Main {
	
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 70;
		
		c1.tampar();
		
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Faber Castel";
		c2.cor = "Vermelho";
		c2.ponta = 0.9f;
		c2.carga = 100;
		
		c2.destampar();
		
		c2.status();
		c2.rabiscar();
	}

}
