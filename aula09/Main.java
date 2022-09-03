package aula09;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Heitor", 15, "M");
		p[1] = new Pessoa("Claudia", 22, "F");
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Livro("POO para Iniciantes", "José Paulo", 500, p[1]);
		l[2] = new Livro("Java Avançado", "Maria Cândido", 800, p[1]);
		
		l[0].abrir();
		l[0].folhear(150);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		
		System.out.println(l[1].detalhes());
		
	}

}
