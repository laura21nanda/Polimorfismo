package Polimorfismo;

public class PrincipalProf {

	public static void main(String[] args) {

		Medico med = new Medico("Lucas", "Cirirgia", 100, "crm");
		System.out.println(med.getNome());
		System.out.println(med.agendarConsulta());
		
		Dentista dent = new Dentista ("Marcos", "Aparelho", 100, "cro");
		System.out.println(dent.getNome());
		System.out.println(dent.agendarConsulta());
		
		Fisioterapista fisio = new Fisioterapista("Joao", "Acupumtura", 100, "crj");
		System.out.println(fisio.getNome());
		System.out.println(fisio.agendarConsulta());
		
	}

}
