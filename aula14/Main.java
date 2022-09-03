package aula14;

public class Main {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Claudia", 22, "F", "clau");
		g[1] = new Gafanhoto("Vitória", 22, "F", "vic");
		
		Visualizacao vis[] = new Visualizacao[4];
		vis[0] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar();
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[1].avaliar(35.5f);
		vis[2] = new Visualizacao(g[1], v[0]);
		vis[2].avaliar(10);
		vis[3] = new Visualizacao(g[0], v[0]);
		vis[3].avaliar(4);
			
		System.out.println("VIDEOS\n------------------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println("\nGAFANHOTOS\n------------------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		System.out.println("\nVISUALIZAÇÃO\n------------------------------");
		System.out.println(vis[0].toString());
		System.out.println(vis[1].toString());
		System.out.println(vis[2].toString());
		System.out.println(vis[3].toString());
	}
}
