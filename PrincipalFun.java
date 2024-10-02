package Polimorfismo;

public class PrincipalFun {

	public static void main(String[] args) {

		System.out.println("------------Funcionario-------------");
		
		Funcionario fun = new Funcionario(1, "Laura", "(15)1234-5678", 123,"itapetininga");
		System.out.println(fun.getNome());
		System.out.println(fun.caucularSalario(10000, 1000));
		
		System.out.println("------------Horista-------------");
		
		Horista horis = new Horista(2, "Pedro", "(15)1234-5678", 1234,"itapetininga");
		System.out.println(horis.getNome());
		System.out.println(horis.caucularSalario(100, 200));
		
		System.out.println("-------------Jornada------------");
		
		Jornada jor = new Jornada(3, "Lucas", "(15)1234-5678", 12345,"itapetininga");
		System.out.println(jor.getNome());
		System.out.println(jor.caucularSalario(180,220));
		
		System.out.println("-------------ConsultorPj------------");
		
		ConsultorPj pj = new ConsultorPj(4, "Beatrice", "(15)1234-5678", 123456,"itapetininga");
		System.out.println(pj.getNome());
		System.out.println(pj.caucularSalario(40000,5000));
		
	}

}
