package exemplo01;

public class Onibus extends Veiculo{

	private int passageiros;
	
	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	public void acionarCampainha() {
		System.out.println("Próxima parada...");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando ônibus...");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando ônibus...");
	}

}
