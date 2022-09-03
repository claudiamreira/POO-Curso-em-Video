package exemplo01;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Onibus oni = new Onibus();
		
		Caminhao cam = new Caminhao();
		
		Carro car = new Carro();
		car.setAno(2022);
		car.setCombustivel("Flex");
		car.setCor("branco");
		car.setMarca("Fiat");
		car.setModelo("UNO");
		System.out.println(car.toString());
		car.ligar();
		car.acelerar();

	}

}
