package aula11;

public class Main {

	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		v1.setNome("Melissa");
		v1.setIdade(24);
		v1.setSexo("F");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Carlos");
		a1.setIdade(19);
		a1.setSexo("M");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Kátia");
		b1.setIdade(52);
		b1.setSexo("M");
		System.out.println(b1.toString());
		b1.pagarMensalidade();
		
		Professor p1 = new Professor();
		p1.setNome("Mauro");
		p1.setIdade(55);
		p1.setSexo("M");
		System.out.println(p1.toString());
		p1.receberAumento(1.000f);

	}

}
