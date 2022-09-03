package aula09;

public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean Aberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public String detalhes() {
		return "Livro \ntitulo: " + titulo + "\nautor: " + autor + "\ntotal de páginas: " + totalPaginas 
				+ ", página atual: " + pagAtual + ", aberto: " + aberto + "\nleitor: " + leitor.getNome() +
				", idade: " + leitor.getIdade() + ", sexo: " + leitor.getSexo();
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int pagina) {
		if (pagina > this.totalPaginas) {
			this.pagAtual = 0;
		} else {
			this.pagAtual = pagina;
		}
	}

	@Override
	public void avancarPag() {
		this.pagAtual++; //this.pagAtual = this.pagAtual + 1;
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
	}

	

}
