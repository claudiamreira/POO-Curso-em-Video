package exemplo01;

public class Caminhao extends Veiculo{

	private int eixos, tara, trucado;
	
	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	public int getTrucado() {
		return trucado;
	}

	public void setTrucado(int trucado) {
		this.trucado = trucado;
	}
	
	public void levantarCarroceria() {
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando caminhão...");	
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando caminhão...");
	}

}
