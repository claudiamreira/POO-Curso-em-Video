package exemplo;

public class Main {
	
	public static void main(String[] args) {
		Notebook note = new Notebook();
		
		note.cor = "Preto";
		note.fabricante = "Samsung";
		note.modelo = "I3";
		note.tamanho = 20;
		note.tipo = "Teclado numérico";
		
		note.ligar();
		
		note.status();
		note.conectar();
		note.digitar();
	}

}
