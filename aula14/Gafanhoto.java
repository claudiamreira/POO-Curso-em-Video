package aula14;

public class Gafanhoto extends Pessoa{
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totalAssistido = 0;
	}

	private String login;
	private int totalAssistido;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public int getTotalAssistido() {
		return totalAssistido;
	}
	
	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}
	
	public void viuMaisUm() {
		
	}

	@Override
	public String toString() {
		return "Gafanhoto [" + super.toString() + "\nlogin: " + login + ", totalAssistido: " + totalAssistido;
	}
	
	

}
