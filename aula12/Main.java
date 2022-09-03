package aula12;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		
		Reptil r = new Reptil();
		
		Peixe p = new Peixe();
		
		Ave a = new Ave();
		
		m.setPeso(85.3f);
		m.setIdade(2);
		m.setMembros(4);
		m.setCorPelo("Marrom");
		System.out.println(m.toString());
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		p.setPeso(0.35f);
		p.setIdade(1);
		p.setMembros(0);
		System.out.println(p.toString());
		p.locomover();
		p.alimentar();
		p.emitirSom();
		
		Canguru c = new Canguru();
		c.setPeso(55.30f);
		c.setIdade(3);
		c.setMembros(4);
		System.out.println(c.toString());
		c.locomover();
		c.alimentar();
		c.emitirSom();
		c.usarBolsa();
	}

}
