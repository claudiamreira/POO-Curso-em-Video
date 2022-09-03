package exemplo01;

public class Carro extends Veiculo{

	private String combustivel;
	
	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public void ligar() {
		System.out.println("Ligando carro...");		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando carro...");
	}

}
