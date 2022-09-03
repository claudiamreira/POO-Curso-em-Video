package aula10;

public class Main {

	public static void main (String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p1.setIdade(22);
		p2.setIdade(18);
		p3.setIdade(39);
		p4.setIdade(30);
		
		p1.setSexo("M");
		p2.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("F");
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Recepção");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
	
}
